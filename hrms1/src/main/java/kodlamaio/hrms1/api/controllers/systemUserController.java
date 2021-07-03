package kodlamaio.hrms1.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms1.business.abstracts.systemUserService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.entities.concretes.system_user;

@RestController
@RequestMapping("/api/systemUser")
public class systemUserController {
	
	private systemUserService systemUserservice;

	@Autowired
	public systemUserController(systemUserService systemUserservice) {
		super();
		this.systemUserservice = systemUserservice;
	}
	
	@GetMapping("/getall")
	public DataResult<List<system_user>>getAll(){
		return this.systemUserservice.getAll();
	}

}
