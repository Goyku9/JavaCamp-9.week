package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CvExperience;

public interface CvExperienceDao extends JpaRepository<CvExperience, Integer>{
	CvExperience getById(int id);
	List<CvExperience> getAllByJobHunter_idOrderByEndAtDesc(int id);
	List<CvExperience> getAllByJobHunter_id(int id);
}