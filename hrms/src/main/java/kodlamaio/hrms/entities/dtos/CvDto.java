package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.CvExperience;
import kodlamaio.hrms.entities.concretes.CvForeignLanguage;
import kodlamaio.hrms.entities.concretes.CvImage;
import kodlamaio.hrms.entities.concretes.CvLink;
import kodlamaio.hrms.entities.concretes.CvProgrammingLanguage;
import kodlamaio.hrms.entities.concretes.CvSchool;
import kodlamaio.hrms.entities.concretes.JobHunter;

public class CvDto {

	public JobHunter jobHunter;
	public List<CvSchool> schools;
	public List<CvProgrammingLanguage> pLanguages;
	public List<CvLink> links;
	public List<CvForeignLanguage> languages;
	public List<CvExperience> experiences;
	public CvImage image;
}
