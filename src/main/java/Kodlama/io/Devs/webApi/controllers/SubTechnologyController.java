package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.SubTechnologyService;
import Kodlama.io.Devs.business.requests.subTechnologyRequests.CreateSubTechnologyRequest;
import Kodlama.io.Devs.business.responses.subTechnologyResponses.GetAllSubTechnologiesResponses;

@RestController
@RequestMapping("api/subtechnologies")
public class SubTechnologyController {
	
	private SubTechnologyService subTechnologyService;
	
	@Autowired
	public SubTechnologyController(SubTechnologyService subTechnologyService) {
		this.subTechnologyService = subTechnologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllSubTechnologiesResponses> getAll(){
		return subTechnologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateSubTechnologyRequest createSubTechnolgyRequests) {
		subTechnologyService.add(createSubTechnolgyRequests);
	}
	
}
