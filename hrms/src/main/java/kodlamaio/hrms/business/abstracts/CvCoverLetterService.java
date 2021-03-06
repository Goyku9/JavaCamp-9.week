package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvCoverLetter;

public interface CvCoverLetterService {
	
	Result add(CvCoverLetter cvCoverLetter);
	
	Result update(CvCoverLetter cvCoverLetter);
	
	Result delete(int id);
	
	DataResult<CvCoverLetter> getById(int id);	
	
	DataResult<List<CvCoverLetter>> getAll();

}
