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
@Table(name="cv_links")
@NoArgsConstructor
@AllArgsConstructor
public class CvLink extends Cv{
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "url")
	private String url;	
	
	@ManyToOne()
	@JoinColumn(name = "jobHunter_id")
	private JobHunter jobHunter;
}

