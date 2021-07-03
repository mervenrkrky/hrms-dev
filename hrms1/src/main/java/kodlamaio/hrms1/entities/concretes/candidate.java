package kodlamaio.hrms1.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidates")
@NoArgsConstructor
@AllArgsConstructor
public class candidate {
	
	
	@Id
	@GeneratedValue
	@Column(name="candidates_id")
	private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lasttname")
	private String lastName;
	
	@Column(name="identification_number")
	private String identificationNumber;
	
	@Column(name="birth_date")
	private Date birthDate;
	
}
