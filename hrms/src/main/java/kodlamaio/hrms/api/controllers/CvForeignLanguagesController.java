package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForeignLanguage;

@RestController
@RequestMapping("/api/foreignLanguages")
public class CvForeignLanguagesController {
	
	private CvForeignLanguageService cvForeignLanguageService;

	@Autowired
	public CvForeignLanguagesController(CvForeignLanguageService cvForeignLanguageService) {
		super();
		this.cvForeignLanguageService = cvForeignLanguageService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvForeignLanguage cvForeignLanguage){
		return this.cvForeignLanguageService.add(cvForeignLanguage);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvForeignLanguage cvForeignLanguage){
		return this.cvForeignLanguageService.update(cvForeignLanguage);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvForeignLanguageService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvForeignLanguage> getById(@RequestParam("id") int id){
		return this.cvForeignLanguageService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvForeignLanguage>> getAll(){
		return this.cvForeignLanguageService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvForeignLanguage>> getAllByJobseekerId(@RequestParam int id){
		return this.cvForeignLanguageService.getAllByJobHunterId(id);
	}
	
	

}
