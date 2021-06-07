package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.hrms.entities.concretes.JobAdvert;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;


@Service
public class JobAdvertManager implements JobAdvertService{
	
	private JobAdvertDao jobAdvertDao;

	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		if (!CheckIfNullField(jobAdvert)) {
			return new ErrorResult("Lütfen boş alanları doldurun");
		}
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("İş ilanı eklendi");
	}

	@Override
	public Result update(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("İş ilanı güncellendi.");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertDao.deleteById(id);
		return new SuccessResult("İş ilanı silindi");
	}

	@Override
	public DataResult<JobAdvert> getById(int id) {
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getById(id));
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll());
	}

	@Override
	public Result changeOpenToClose(int id) {
		if (getById(id) == null) {
			return new ErrorResult("Böyle bir ilan bulunmamaktadır");

		}
		if (getById(id).getData().isOpen() == false) {
			return new ErrorResult("İlan zaten kapanmıştır.");
		}

		JobAdvert jobAdvert = getById(id).getData();
		jobAdvert.setOpen(false);
		update(jobAdvert);
		return new SuccessResult("İş ilanı başarıyla kapanmıştır");
	}

	@Override
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertList() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertList());
	}

	@Override
	public DataResult<List<JobAdvert>> findAllByOrderByPublishedAt() {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAllByOrderByPublishedAtDesc());
	}

	@Override
	public DataResult<List<JobAdvert>> getAllOpenJobAdvertByEmployer(int id) {
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertByEmployer(id));
	}

	private boolean CheckIfNullField(JobAdvert jobAdvert) {
		if (jobAdvert.getJobPosition() != null && jobAdvert.getDescription() != null && jobAdvert.getCity() != null
				&& jobAdvert.getOpenPositionCount() != 0) {
			return true;
		}
		return false;
	}

}
