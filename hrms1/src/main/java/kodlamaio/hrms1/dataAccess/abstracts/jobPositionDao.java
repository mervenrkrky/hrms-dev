package kodlamaio.hrms1.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms1.entities.concretes.job_position;

public interface jobPositionDao extends JpaRepository<job_position, Integer>{

}
