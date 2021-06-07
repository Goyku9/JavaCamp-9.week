package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvForeignLanguageDao;
import kodlamaio.hrms.entities.concretes.CvForeignLanguage;


@Service
public class CvForeignLanguageManager implements CvForeignLanguageService {
	
private CvForeignLanguageDao cvForeignLanguageDao;
	
	@Autowired
	public CvForeignLanguageManager(CvForeignLanguageDao cvForeignLanguageDao) {
		super();
		this.cvForeignLanguageDao = cvForeignLanguageDao;
	}

	@Override
	public Result add(CvForeignLanguage cvForeignLanguage) {
		this.cvForeignLanguageDao.save(cvForeignLanguage);
		return new SuccessResult("Yabancı dil eklendi");
	}

	@Override
	public Result update(CvForeignLanguage cvForeignLanguage) {
		this.cvForeignLanguageDao.save(cvForeignLanguage);
		return new SuccessResult("Yabancı dil güncellendi");
	
	}

	@Override
	public Result delete(int id) {
		this.cvForeignLanguageDao.deleteById(id);;
		return new SuccessResult("Yabancı dil silindi.");
	}

	@Override
	public DataResult<CvForeignLanguage> getById(int id) {
		return new SuccessDataResult<CvForeignLanguage>(this.cvForeignLanguageDao.getById(id));
	}

	@Override
	public DataResult<List<CvForeignLanguage>> getAll() {
		return new SuccessDataResult<List<CvForeignLanguage>>(this.cvForeignLanguageDao.findAll());
	}

	@Override
	public DataResult<List<CvForeignLanguage>> getAllByJobHunterId(int id) {
		return new SuccessDataResult<List<CvForeignLanguage>>(this.cvForeignLanguageDao.getAllByJobHunter_id(id));
	}

}
