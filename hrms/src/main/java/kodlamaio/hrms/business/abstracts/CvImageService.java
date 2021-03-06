package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvImage;

public interface CvImageService {
	
	Result add(CvImage cvImage, MultipartFile imageFile);

	Result update(CvImage cvImage);
	
	Result delete(int id);
	
	DataResult<CvImage> getById(int id);	
	
	DataResult<List<CvImage>> getAll();
	
	DataResult<CvImage> getByJobHunterId(int id);

}
