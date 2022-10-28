package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}
	
	

	@Override
	public Language getById(int id){
		for(Language lang : languageRepository.getAll()) {
			if(lang.getId() == id) {
				return languageRepository.getByid(id);
			}
		}

		return null;
	}
	
	

	@Override
	public void add(Language language) throws Exception {
		if(!isExistingName(language.getName()) && !language.getName().equals("")) {
		languageRepository.add(language);	
		}else {
			throw new Exception("Dil ismi boş geçilemez veya kayıtlı bir dil girilemez.");
		}
	}
	
	

	@Override
	public void update(int id, String newName){
		if(getById(id) != null && !isExistingName(newName)) {
			languageRepository.update(id, newName);
		}	
	}
	
	

	@Override
	public void delete(int id) {
		if(getById(id) != null) {
			languageRepository.delete(id);
		}		
	}

	

	@Override
	public boolean isExistingName(String name) {
		for(Language lang : languageRepository.getAll()) {
			if(lang.getName().equals(name)) {
				return true;
			}
		} 
		return false;
	}
}
