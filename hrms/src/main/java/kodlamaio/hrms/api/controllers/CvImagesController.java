package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CvImageService;
import kodlamaio.hrms.business.abstracts.JobHunterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvImage;
import kodlamaio.hrms.entities.concretes.JobHunter;

@RestController
@RequestMapping("api/images")
public class CvImagesController {
	
	private CvImageService cvImageService;
	private JobHunterService jobHunterService;

	@Autowired
	public CvImagesController(CvImageService cvImageService, JobHunterService jobHunterService) {
		super();
		this.cvImageService = cvImageService;
		this.jobHunterService = jobHunterService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		JobHunter jobHunter = this.jobHunterService.getById(id).getData();
		CvImage imageForCV = new CvImage();
		imageForCV.setJobHunter(jobHunter);
		return this.cvImageService.add(imageForCV, imageFile);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvImage imageForCV){
		return this.cvImageService.update(imageForCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvImageService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvImage> getById(@RequestParam("id") int id){
		return this.cvImageService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvImage>> getAll(){
		return this.cvImageService.getAll();
	}
	
	
	@GetMapping("/getByJobseekerId")
	public DataResult<CvImage> getByJobseekerId(@RequestParam int id){
		return this.cvImageService.getByJobHunterId(id);
	}
	

}
