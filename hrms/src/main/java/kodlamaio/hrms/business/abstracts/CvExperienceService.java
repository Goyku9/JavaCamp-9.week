package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvExperience;

public interface CvExperienceService {
	
	Result add(CvExperience cvExperience);
	
	Result update(CvExperience cvExperience);
	
	Result delete(int id);
	
	DataResult<CvExperience> getById(int id);	
	
	DataResult<List<CvExperience>> getAll();
	
	DataResult<List<CvExperience>> getAllByJobHunterIdOrderByEndAtDesc(int id);
	
	DataResult<List<CvExperience>> getAllByJobHunterId(int id);

}
