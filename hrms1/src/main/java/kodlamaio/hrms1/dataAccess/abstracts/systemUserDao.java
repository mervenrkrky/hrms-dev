package kodlamaio.hrms1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms1.entities.concretes.system_user;

public interface systemUserDao extends JpaRepository<system_user, Integer>{

}
