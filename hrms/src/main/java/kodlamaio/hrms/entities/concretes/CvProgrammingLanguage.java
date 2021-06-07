package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_programming_language")
@NoArgsConstructor
@AllArgsConstructor
public class CvProgrammingLanguage extends Cv{

	@Column(name = "pLanguage_name")
	private String pLanguageName;
	
	@ManyToOne()
	@JoinColumn(name = "jobHunter_id")
	private JobHunter jobHunter;
}


