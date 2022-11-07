package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.subTechnologyRequests.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnologyRequests.DeleteSubTechnologyRequest;
import Kodlama.io.Devs.business.requests.subTechnologyRequests.UpdateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.subTechnologyResponses.GetAllSubTechnologiesResponses;

public interface SubTechnologyService {
	
	List<GetAllSubTechnologiesResponses> getAll();
	void add(CreateSubTechnologyRequest createSubTechnologyRequest);
	void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest);
    void update(int id, UpdateSubTechnologyRequest updateSubTechnologyRequest);
	}
