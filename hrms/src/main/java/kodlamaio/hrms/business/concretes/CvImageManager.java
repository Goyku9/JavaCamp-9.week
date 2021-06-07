package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CvImageService;
import kodlamaio.hrms.core.utilities.imageUpload.ImageUploadService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvImageDao;
import kodlamaio.hrms.entities.concretes.CvImage;


@Service
public class CvImageManager implements CvImageService{
	
	private CvImageDao cvImageDao;
	private ImageUploadService imageUploadService;

	@Autowired
	public CvImageManager(CvImageDao cvImageDao, ImageUploadService imageUploadService) {
		super();
		this.cvImageDao = cvImageDao;
		this.imageUploadService = imageUploadService;
	}
	
	@Override
	public Result add(CvImage cvImage , MultipartFile imageFile) {
		Map<String,String> uploadImage = this.imageUploadService.uploadImageFile(imageFile).getData();
		cvImage.setUrl(uploadImage.get("url"));
		this.cvImageDao.save(cvImage);
		return new SuccessResult("Fotoğraf yüklendi.");
	}

	@Override
	public Result update(CvImage cvImage) {
		this.cvImageDao.save(cvImage);
		return new SuccessResult("Fotoğraf güncellendi.");
	}

	@Override
	public Result delete(int id) {
		this.cvImageDao.deleteById(id);
		return new SuccessResult("Fotoğraf silindi.");
	}

	@Override
	public DataResult<CvImage> getById(int id) {
		return new SuccessDataResult<CvImage>(this.cvImageDao.getById(id));
	}

	@Override
	public DataResult<List<CvImage>> getAll() {
		return new SuccessDataResult<List<CvImage>>(this.cvImageDao.findAll());
	}

	@Override
	public DataResult<CvImage> getByJobHunterId(int id) {
		return new SuccessDataResult<CvImage>(this.cvImageDao.getByJobHunter_id(id));
	}

}
