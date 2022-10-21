package vikas.RatanRaman.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userId;
	
	@Column(length=30)
	private String userName;
	
	@Column(length=30)
	private String userPassword;
	
	@Column(length=30)
	private String userRole;
	
	
	
}
