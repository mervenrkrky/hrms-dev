package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.candidateService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.dataAccess.abstracts.candidateDao;
import kodlamaio.hrms1.entities.concretes.candidate;
@Service
public class candidateManager implements candidateService {

	private candidateDao candidatedao;
	@Autowired
	public candidateManager(candidateDao candidatedao) {
		super();
		this.candidatedao = candidatedao;
	}

	@Override
	public DataResult<List<candidate>> getAll() {
		
		return new SuccessDataResult<List<candidate>>(this.candidatedao.findAll(),"Data Listelendi");
	}

}
