package Kodlama.io.Devs.entities.concretes;

import java.util.List;

import Kodlama.io.Devs.entities.abstracts.Person;

public class Applicant extends Person {
	
	private List<Language> knownLanguages;

	public Applicant(int id, String firstName, String lastName, String address, String telNumber, List<Language> knownLanguages) {
		super(id, firstName, lastName, address, telNumber);
		this.knownLanguages = knownLanguages;
	}	
}
