package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobHunter;
import kodlamaio.hrms.entities.dtos.CvDto;

public interface JobHunterService {
	
	
	Result add(JobHunter jobHunter);
	
	Result update(JobHunter jobHunter);
	
	Result delete(int id);
	
	DataResult<JobHunter> getById(int id);
	
	DataResult<List<JobHunter>> getAll();
	
	DataResult<JobHunter> getJobHunterByNationalId(String nationalId);
	
	DataResult<CvDto> getJobHunterCVById(int id);

}
