package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	
	List<Language> getAll();
	Language getById(int id);
	void add(Language language) throws Exception;
	void update(int id, String newName);
	void delete(int id);
	boolean isExistingName(String name);
}
