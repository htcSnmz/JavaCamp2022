package Kodlama.io.Devs.entities.concretes;

import Kodlama.io.Devs.entities.abstracts.Person;

public class Employer extends Person {
	
	private String companyName;

	public Employer(int id, String firstName, String lastName, String address, String telNumber, String companyName) {
		super(id, firstName, lastName, address, telNumber);
		this.companyName = companyName;
	}

}
