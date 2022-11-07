package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.requests.languageRequests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.languageRequests.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.languageRequests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.languageResponses.GetAllLanguagesResponse;
import Kodlama.io.Devs.business.responses.languageResponses.GetByIdLanguageResponse;
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
	public List<GetAllLanguagesResponse> getAll() {
		
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguagesResponse> languagesResponses = new ArrayList<GetAllLanguagesResponse>();
		for(Language language : languages) {
			GetAllLanguagesResponse languagesResponse = new GetAllLanguagesResponse();
			languagesResponse.setId(language.getId());
			languagesResponse.setName(language.getName());
			languagesResponses.add(languagesResponse);
		}
		return languagesResponses;
	}



	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		this.languageRepository.save(language);
		
	}



	@Override
	public GetByIdLanguageResponse getById(int id) {
		Language language = languageRepository.findById(id).get();
        GetByIdLanguageResponse response = new GetByIdLanguageResponse();
        response.setName(language.getName());
        return response;
	}



	@Override
	public void delete(DeleteLanguageRequest deleteLanguageRequest) {
		languageRepository.deleteById(deleteLanguageRequest.getId());
		
	}



	@Override
	public void update(int id, UpdateLanguageRequest updateLanguageRequest) {
		if(!updateLanguageRequest.getName().isEmpty()){
            Language language = languageRepository.findById(id).get();
            language.setName(updateLanguageRequest.getName());
            languageRepository.save(language);
		
	}
	
	}	
}
