package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.employerService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.entities.concretes.employer;

@RestController
@RequestMapping("/api/employer")
public class employerConrtollers {
	
	private employerService employerservice;

	@Autowired
	public employerConrtollers(employerService employerservice) {
		super();
		this.employerservice = employerservice;
	}
	@GetMapping("/getall")
	public DataResult<List<employer>> getAll(){
		return this.employerservice.getAll();
		}

}
