package vikas.RatanRaman.Customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@Column(length=30)
	private String custFirst;
	
	@Column(length=30)
	private String custLast;
	
	@Column(length=100)
	private String custEmail;
	
	@Column(length=15)
	private String custAadhar;
	
	@Column(length=15)
	private String custContact;
	
	@Column(length=100)
	private String custAddress;
}
