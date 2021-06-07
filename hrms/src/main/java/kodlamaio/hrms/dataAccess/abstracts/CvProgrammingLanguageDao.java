package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CvProgrammingLanguage;

public interface CvProgrammingLanguageDao extends JpaRepository<CvProgrammingLanguage, Integer>{
	CvProgrammingLanguage getById(int id);
	List<CvProgrammingLanguage> getAllByJobHunter_id(int id);
}
