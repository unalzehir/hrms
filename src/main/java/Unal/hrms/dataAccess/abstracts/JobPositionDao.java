package Unal.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Unal.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{
	
}
