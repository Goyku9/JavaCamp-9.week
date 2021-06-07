package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvProgrammingLanguage;

public interface CvProgrammingLanguageService {
	
	Result add(CvProgrammingLanguage cvProgrammingLanguage);
	
	Result update(CvProgrammingLanguage cvProgrammingLanguage);
	
	Result delete(int id);
	
	DataResult<CvProgrammingLanguage> getById(int id);	
	
	DataResult<List<CvProgrammingLanguage>> getAll();
	
	DataResult<List<CvProgrammingLanguage>> getAllByJobHunterId(int id);

}
