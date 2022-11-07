package Kodlama.io.Devs.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="languages")
@Entity
public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="language")
	private List<SubTechnology> subTechnologies;
	
	public Language() {}

	public Language(int id, String name, List<SubTechnology> subTechnologies) {
		super();
		this.id = id;
		this.name = name;
		this.subTechnologies = subTechnologies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SubTechnology> getSubTechnologies() {
		return subTechnologies;
	}

	public void setSubTechnologies(List<SubTechnology> subTechnologies) {
		this.subTechnologies = subTechnologies;
	}
		
}
