package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms1.business.abstracts.jobPositionService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.dataAccess.abstracts.jobPositionDao;
import kodlamaio.hrms1.entities.concretes.job_position;
@Service
public class jobPositionManager implements jobPositionService{

	private jobPositionDao jobpositiondao;
	@Autowired
	public jobPositionManager(jobPositionDao jobpositiondao) {
		super();
		this.jobpositiondao = jobpositiondao;
	}

	@Override
	public DataResult<List<job_position>>getAll() {
		return new SuccessDataResult<List<job_position>>(this.jobpositiondao.findAll(), "data listelendi");
		
				
	}

}