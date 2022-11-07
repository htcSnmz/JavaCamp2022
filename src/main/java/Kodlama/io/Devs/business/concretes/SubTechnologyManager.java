package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.io.Devs.business.requests.subTechnologyRequests.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnologyRequests.DeleteSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnologyRequests.UpdateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.subTechnologyResponses.GetAllSubTechnologiesResponses;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import Kodlama.io.Devs.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService{

	private SubTechnologyRepository subTechnologyRepository;
	private LanguageRepository languageRepository;
	
	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository, LanguageRepository languageRepository) {
		super();
		this.subTechnologyRepository = subTechnologyRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllSubTechnologiesResponses> getAll() {
		
		List<SubTechnology> subTechnologies = subTechnologyRepository.findAll();
		List<GetAllSubTechnologiesResponses> getAllSubTechnologyResponses = new ArrayList<GetAllSubTechnologiesResponses>();
		for(SubTechnology subTechnology : subTechnologies) {
			GetAllSubTechnologiesResponses item = new GetAllSubTechnologiesResponses();
			item.setId(subTechnology.getId());
			item.setName(subTechnology.getName());
			item.setLanguageName(subTechnology.getLanguage().getName());
			getAllSubTechnologyResponses.add(item);
		}
		
		return getAllSubTechnologyResponses;
	}
	

	@Override
	public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {
		
		SubTechnology subTechnology = new SubTechnology();
		Language language = languageRepository.findById(createSubTechnologyRequest.getLanguageId()).get();
		subTechnology.setName(createSubTechnologyRequest.getName());
		subTechnology.setLanguage(language);
		subTechnologyRepository.save(subTechnology);	
		
	}

	@Override
	public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {
		subTechnologyRepository.deleteById(deleteSubTechnologyRequest.getId());
		
	}

	@Override
	public void update(int id, UpdateSubTechnologyRequest updateSubTechnologyRequest) {
		SubTechnology subTechnology = subTechnologyRepository.findById(id).get();
        Language language = languageRepository.findById(updateSubTechnologyRequest.getLanguageId()).get();
        subTechnology.setName(updateSubTechnologyRequest.getName());
        subTechnology.setLanguage(language);
        subTechnologyRepository.save(subTechnology);
		
	}	
}
