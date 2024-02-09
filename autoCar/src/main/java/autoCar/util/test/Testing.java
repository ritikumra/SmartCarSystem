package autoCar.util.test;

import java.io.Serializable;
import java.time.LocalTime;

import org.hibernate.Session;
import autoCar.util.HibernateUtil;
import autoCar.entities.*;



public class Testing {
	
	public static void main(String[] args) {
		try(Session session= HibernateUtil.getSessionFactory().openSession();){
			CarProperties cp = new CarProperties();
			cp.setFuel_capacity(2);
			cp.setIgnition(true);
			cp.setEngine_status(false);
			cp.setTime(LocalTime.now());
			session.beginTransaction();
			Serializable serializable= session.save(cp);
			Integer fuel_capacity= (Integer) serializable;
			session.getTransaction().commit();
			
			if(cp.getTime().compareTo(LocalTime.parse("12:00:00"))<0) 
			System.out.println("Good Morning! System Inialized Succesfully.");
			else if( cp.getTime().compareTo(LocalTime.parse("12:00:00"))>0 && cp.getTime().compareTo(LocalTime.parse("17:00:00"))<0) {
				System.out.println("Good AfterNoon! System Inialized Succesfully.");
			}
			else System.out.println("Good Evening! System Inialized Succesfully.");
			if(!cp.isIgnition()) {
				System.out.println("You may proceed to turn on the ignition to start your journey!");
			}
			else System.out.print("");
			if(fuel_capacity<3) {
				System.out.println("Low Fuel!");
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error Initializing System!");
			
		}
		
	}

}
