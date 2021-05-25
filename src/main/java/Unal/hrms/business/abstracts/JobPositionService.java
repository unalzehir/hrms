  package Unal.hrms.business.abstracts;

import java.util.List;

import Unal.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
