package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Repository
public class InMemoryRepositoryLanguage implements LanguageRepository {
	
	private List<Language> languages;
	
	public InMemoryRepositoryLanguage() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "Python"));
		languages.add(new Language(3, "C#"));
	}
	
	
	
	@Override
	public List<Language> getAll() {
		return languages;
	}
	
	

	@Override
	public Language getByid(int id) {
		for(Language lang : languages) {
			if(lang.getId() == id) {
				return lang;
			}	
		}
		return null;
	}
	
	

	@Override
	public void add(Language language) {
		languages.add(language);	
	}
	
	

	@Override
	public void update(int id, String newName) {
		Language lang = getByid(id);
		lang.setName(newName);	
	}
	
	

	@Override
	public void delete(int id) {
		Language lang = getByid(id);
		languages.remove(lang);
		
	}
}
