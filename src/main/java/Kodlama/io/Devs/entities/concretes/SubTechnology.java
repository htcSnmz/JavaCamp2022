package Kodlama.io.Devs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="sub_technologies")
@Entity
public class SubTechnology{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="language_id")
	private Language language;
	
	@Column(name="name")
	private String name;
		
	public SubTechnology() {
		super();
	}


	public SubTechnology(int id, String name, Language language) {
		this.id = id;
		this.language = language;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public Language getLanguage() {
		return language;
	}


	public void setLanguage(Language language) {
		this.language = language;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
			this.name = name;
	}		
}
