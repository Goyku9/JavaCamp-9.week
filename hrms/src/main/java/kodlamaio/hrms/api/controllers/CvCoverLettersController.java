package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvCoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvCoverLetter;

@RestController
@RequestMapping("/api/coverLetters")
public class CvCoverLettersController {
	
	private CvCoverLetterService cvCoverLetterService;
     
	@Autowired
	public CvCoverLettersController(CvCoverLetterService cvCoverLetterService) {
		super();
		this.cvCoverLetterService = cvCoverLetterService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvCoverLetter cvCoverLetter){
		return this.cvCoverLetterService.add(cvCoverLetter);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvCoverLetter cvCoverLetter){
		return this.cvCoverLetterService.update(cvCoverLetter);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvCoverLetterService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvCoverLetter> getById(@RequestParam("id") int id){
		return this.cvCoverLetterService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvCoverLetter>> getAll(){
		return this.cvCoverLetterService.getAll();
	}
	

}
