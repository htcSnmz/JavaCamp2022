package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	
	List<Language> getAll();
	Language getByid(int id);
	void add(Language language);
	void update(int id, String newName);
	void delete(int id);	
}
