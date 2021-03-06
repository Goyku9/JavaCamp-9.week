package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForeignLanguage;

public interface CvForeignLanguageService {
	
	Result add(CvForeignLanguage cvForeignLanguage);
	
	Result update(CvForeignLanguage cvForeignLanguage);
	
	Result delete(int id);
	
	DataResult<CvForeignLanguage> getById(int id);	
	
	DataResult<List<CvForeignLanguage>> getAll();
	
	DataResult<List<CvForeignLanguage>> getAllByJobHunterId(int id);

}
