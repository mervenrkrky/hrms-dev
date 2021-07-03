package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.employerService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.dataAccess.abstracts.employerDao;
import kodlamaio.hrms1.entities.concretes.employer;
@Service
public class employerManager implements employerService{

	private employerDao employerdao;
	@Autowired
	public employerManager(employerDao employerdao) {
		super();
		this.employerdao = employerdao;
	}

	@Override
	public DataResult<List<employer>> getAll() {
		return new SuccessDataResult<List<employer>>(this.employerdao.findAll(),"Data listelendi");
		
	
				
				
	}

}
