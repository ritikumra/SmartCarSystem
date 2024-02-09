package autoCar.entities;

import java.util.Date;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarProperties {
	
	@Id
	private int fuel_capacity;
	private boolean engine_status;
	private boolean ignition;
	private Date date;
	private LocalTime time;
	
	public int getFuel_capacity() {
		return fuel_capacity;
	}
	public void setFuel_capacity(int fuel_capacity) {
		this.fuel_capacity = fuel_capacity;
	}
	public boolean isEngine_status() {
		return engine_status;
	}
	public void setEngine_status(boolean engine_status) {
		this.engine_status = engine_status;
	}
	public boolean isIgnition() {
		return ignition;
	}
	public void setIgnition(boolean ignition) {
		this.ignition = ignition;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}

}
