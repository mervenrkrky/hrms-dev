package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.candidateService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.entities.concretes.candidate;

@RestController
@RequestMapping("/api/candidate")
public class candidateControllers {
	
	private candidateService candidateservice;


	@Autowired
	public candidateControllers(candidateService candidateservice) {
		super();
		this.candidateservice = candidateservice;
	}
	
	@GetMapping("/getall")
	
	public DataResult<List<candidate>> getAll(){
		return this.candidateservice.getAll();
	}
	
	

}
