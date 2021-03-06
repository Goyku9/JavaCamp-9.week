package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;

import kodlamaio.hrms.business.abstracts.CvLinkService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvLink;

@RestController
@RequestMapping("/api/links")
public class CvLinksController {
	
	private CvLinkService cvLinkService;

	@Autowired
	public CvLinksController(CvLinkService cvLinkService) {
		super();
		this.cvLinkService = cvLinkService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvLink cvLink){
		return this.cvLinkService.add(cvLink);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvLink cvLink){
		return this.cvLinkService.update(cvLink);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cvLinkService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CvLink> getById(@RequestParam("id") int id){
		return this.cvLinkService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CvLink>> getAll(){
		return this.cvLinkService.getAll();
	}
	
	@GetMapping("/getAllByJobseekerId")
	public DataResult<List<CvLink>> getAllByJobseekerId(@RequestParam int id){
		return this.cvLinkService.getAllByJobHunterId(id);
	}
	
	

}
