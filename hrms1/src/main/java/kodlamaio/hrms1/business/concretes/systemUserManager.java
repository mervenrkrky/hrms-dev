package kodlamaio.hrms1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms1.business.abstracts.systemUserService;
import kodlamaio.hrms1.core.utilities.result.DataResult;
import kodlamaio.hrms1.core.utilities.result.SuccessDataResult;
import kodlamaio.hrms1.dataAccess.abstracts.systemUserDao;
import kodlamaio.hrms1.entities.concretes.system_user;
@Service
public class systemUserManager implements systemUserService{

	private systemUserDao systemUserdao;
	@Autowired
	public systemUserManager(systemUserDao systemUserdao) {
		super();
		this.systemUserdao = systemUserdao;
	}

	@Override
	public DataResult<List<system_user>> getAll() {
		
		return new SuccessDataResult<List<system_user>>(this.systemUserdao.findAll(), "Data Listelendi");
				
	}

}
