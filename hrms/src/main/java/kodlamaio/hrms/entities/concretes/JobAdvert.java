package kodlamaio.hrms.entities.concretes;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "job_adverts")
@AllArgsConstructor
public class JobAdvert extends Cv{

	
	@Column(name = "description")
	private String description;
	
	@Column(name = "salary_min")
	private int salaryMin;
	
	@Column(name = "salary_max")
	private int salaryMax;
	
	@Column(name = "open_position_count")
	private int openPositionCount;
	
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@Column(name = "published_at")
	private LocalDate publishedAt;
	
	@Column(name = "is_open")
	private boolean isOpen;

	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private Position jobPosition;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

}