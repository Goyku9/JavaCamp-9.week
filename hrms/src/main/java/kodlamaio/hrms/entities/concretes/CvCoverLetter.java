package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_cover_letters")
@NoArgsConstructor
public class CvCoverLetter extends Cv {

	
	
		
		@Column(name = "content")
		private String content;
		
		public CvCoverLetter(String content, int jobHunterId) {
			super();
			this.content = content;
			this.jobHunter.setId(jobHunterId);
		}

		@ManyToOne()
		@JoinColumn(name = "jobHunter_id")
		@JsonIgnore
		private JobHunter jobHunter;
		
	}

