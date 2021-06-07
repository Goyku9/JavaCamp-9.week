package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvExperienceDao;
import kodlamaio.hrms.entities.concretes.CvExperience;


@Service
public class CvExperienceManager implements CvExperienceService{
	
private CvExperienceDao cvExperienceDao;
	
	@Autowired
	public CvExperienceManager(CvExperienceDao cvExperienceDao) {
		super();
		this.cvExperienceDao = cvExperienceDao;
	}

	@Override
	public Result add(CvExperience cvExperience) {
		this.cvExperienceDao.save(cvExperience);
		return new SuccessResult("Tecrübe eklendi");
	}

	@Override
	public Result update(CvExperience cvExperience) {
		this.cvExperienceDao.save(cvExperience);
		return new SuccessResult("Tecrübe güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.cvExperienceDao.deleteById(id);
		return new SuccessResult("Tecrübe silindi.");
	}

	@Override
	public DataResult<CvExperience> getById(int id) {
		return new SuccessDataResult<CvExperience>(this.cvExperienceDao.getById(id));
	}

	@Override
	public DataResult<List<CvExperience>> getAll() {
		return new SuccessDataResult<List<CvExperience>>(this.cvExperienceDao.findAll());
	}

	@Override
	public DataResult<List<CvExperience>> getAllByJobHunterIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<CvExperience>>(this.cvExperienceDao.getAllByJobHunter_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<CvExperience>> getAllByJobHunterId(int id) {
		return new SuccessDataResult<List<CvExperience>>(this.cvExperienceDao.getAllByJobHunter_id(id));
	}

}
