package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvExperienceService;
import kodlamaio.hrms.business.abstracts.CvForeignLanguageService;
import kodlamaio.hrms.business.abstracts.CvImageService;
import kodlamaio.hrms.business.abstracts.CvLinkService;
import kodlamaio.hrms.business.abstracts.CvProgrammingLanguageService;
import kodlamaio.hrms.business.abstracts.CvSchoolService;
import kodlamaio.hrms.business.abstracts.JobHunterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobHunterDao;
import kodlamaio.hrms.entities.concretes.JobHunter;
import kodlamaio.hrms.entities.dtos.CvDto;


@Service
public class JobHunterManager implements JobHunterService{
	
	private JobHunterDao jobHunterDao;
	private CvExperienceService cvExperienceService;
	private CvForeignLanguageService cvForeignLanguageService;
	private CvImageService cvImageService;
	private CvLinkService cvLinkService;
	private CvProgrammingLanguageService cvProgrammingLanguageService;
	private CvSchoolService cvSchoolService;

	public JobHunterManager(JobHunterDao jobHunterDao, CvExperienceService cvExperienceService,
			CvForeignLanguageService cvForeignLanguageService, CvImageService cvImageService,
			CvLinkService cvLinkService, CvProgrammingLanguageService cvProgrammingLanguageService,
			CvSchoolService cvSchoolService) {
		super();
		this.jobHunterDao = jobHunterDao;
		this.cvExperienceService = cvExperienceService;
		this.cvForeignLanguageService = cvForeignLanguageService;
		this.cvImageService = cvImageService;
		this.cvLinkService = cvLinkService;
		this.cvProgrammingLanguageService = cvProgrammingLanguageService;
		this.cvSchoolService = cvSchoolService;
	}

	@Override
	public Result add(JobHunter jobHunter) {
		this.jobHunterDao.save(jobHunter);
		return new SuccessResult("Jobseeker has been added.");
	}

	@Override
	public Result update(JobHunter jobHunter) {
		this.jobHunterDao.save(jobHunter);
		return new SuccessResult("Jobseeker has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobHunterDao.deleteById(id);
		return new SuccessResult("Jobseeker has been deleted.");
	}

	@Override
	public DataResult<JobHunter> getById(int id) {
		return new SuccessDataResult<JobHunter>(this.jobHunterDao.getById(id));
	}

	@Override
	public DataResult<List<JobHunter>> getAll() {
		return new SuccessDataResult<List<JobHunter>>(this.jobHunterDao.findAll());
	}

	@Override
	public DataResult<JobHunter> getJobHunterByNationalId(String nationalId) {
		return new SuccessDataResult<JobHunter>(this.jobHunterDao.getJobHunterByNationalId(nationalId));
	}

	@Override
	public DataResult<CvDto> getJobHunterCVById(int id) {
		JobHunter jobHunter = this.jobHunterDao.getById(id);
		CvDto cv = new CvDto();
		cv.experiences = jobHunter.getExperiences();
		cv.languages = jobHunter.getLanguages();
		cv.image = jobHunter.getImage();
		cv.links = jobHunter.getLinks();
		cv.pLanguages = jobHunter.getPLanguages();
		cv.schools = jobHunter.getSchools();
		return new SuccessDataResult<CvDto>(cv);
	}
	
	
	

}
