package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CvSchool;

public interface CvSchoolDao extends JpaRepository<CvSchool, Integer>{
	CvSchool getById(int id);
	List<CvSchool> getAllByJobHunter_idOrderByEndAtDesc(int id);
	List<CvSchool> getAllByJobHunter_id(int id);
}
