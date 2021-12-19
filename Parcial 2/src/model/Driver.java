package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Driver {
	
	private  String idDriver;
	private String name;
	private LocalDate dateBirthday;
	
	public Driver(String idDriver, String name, LocalDate dateBirthday) {
		
		this.idDriver = idDriver;
		this.name = name;
		this.dateBirthday = dateBirthday;
	}

	public String getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(String idDriver) {
		this.idDriver = idDriver;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public LocalDate getDateBirthday() {
		return dateBirthday;
	}

	public void setDateBirthday(LocalDate dateBirthday) {
		this.dateBirthday = dateBirthday;
	}

	private int getAge() {

		int actualYear = getDateBirthday().getYear() - LocalDateTime.now().getYear();

		if (actualYear >= 18) {
			return actualYear;
		}

		return 0;

	}

	@Override
	public String toString() {
		return "Driver [idDriver=" + idDriver + ", name=" + name + ", dateBegin=" + dateBirthday + "]";
	}
	
	
	
	
}
