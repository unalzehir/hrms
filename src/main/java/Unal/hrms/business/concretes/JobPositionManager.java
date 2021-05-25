package Unal.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Unal.hrms.business.abstracts.JobPositionService;
import Unal.hrms.dataAccess.abstracts.JobPositionDao;
import Unal.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

}
