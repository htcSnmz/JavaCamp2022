package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.languageRequests.CreateLanguageRequest;
import Kodlama.io.Devs.business.requests.languageRequests.DeleteLanguageRequest;
import Kodlama.io.Devs.business.requests.languageRequests.UpdateLanguageRequest;
import Kodlama.io.Devs.business.responses.languageResponses.GetAllLanguagesResponse;
import Kodlama.io.Devs.business.responses.languageResponses.GetByIdLanguageResponse;

public interface LanguageService {
	
	List<GetAllLanguagesResponse> getAll();
	void add(CreateLanguageRequest createLanguageRequest);
	GetByIdLanguageResponse getById(int id);
	void delete(DeleteLanguageRequest deleteLanguageRequest);
	void update(int id, UpdateLanguageRequest updateLanguageRequest);

}
