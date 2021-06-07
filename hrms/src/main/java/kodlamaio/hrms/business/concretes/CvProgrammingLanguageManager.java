package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.hrms.business.abstracts.CvProgrammingLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvProgrammingLanguageDao;
import kodlamaio.hrms.entities.concretes.CvProgrammingLanguage;


@Service
public class CvProgrammingLanguageManager implements CvProgrammingLanguageService{
	
private CvProgrammingLanguageDao cvProgrammingLanguageDao;
	
	
	@Autowired
	public CvProgrammingLanguageManager(CvProgrammingLanguageDao cvProgrammingLanguageDao) {
		super();
		this.cvProgrammingLanguageDao = cvProgrammingLanguageDao;
	}

	@Override
	public Result add(CvProgrammingLanguage cvProgrammingLanguage) {
		this.cvProgrammingLanguageDao.save(cvProgrammingLanguage);
		return new SuccessResult("Programlama dilleri eklendi.");
	}

	@Override
	public Result update(CvProgrammingLanguage cvProgrammingLanguage) {
		this.cvProgrammingLanguageDao.save(cvProgrammingLanguage);
		return new SuccessResult("Programlama dilleri güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.cvProgrammingLanguageDao.deleteById(id);
		return new SuccessResult("Programlama dilleri silindi");
	}

	@Override
	public DataResult<CvProgrammingLanguage> getById(int id) {
		return new SuccessDataResult<CvProgrammingLanguage>(this.cvProgrammingLanguageDao.getById(id));
	}

	@Override
	public DataResult<List<CvProgrammingLanguage>> getAll() {
		return new SuccessDataResult<List<CvProgrammingLanguage>>(this.cvProgrammingLanguageDao.findAll());
	}

	@Override
	public DataResult<List<CvProgrammingLanguage>> getAllByJobHunterId(int id) {
		return new SuccessDataResult<List<CvProgrammingLanguage>>(this.cvProgrammingLanguageDao.getAllByJobHunter_id(id));
	}

}
