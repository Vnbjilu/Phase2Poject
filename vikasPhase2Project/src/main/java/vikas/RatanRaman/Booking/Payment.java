package vikas.RatanRaman.Booking;

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
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	
	@Column(unique = true)
	private int bookingId;
	
	@Column(length=12)
	private String accountNumber;
	
	@Column(length=40)
	private String bankName;
	@Column(length=12)
	private String flightNumber;
	@Column(length=16)
	private String bookingDate;
	
	private int fare;
	
	@Column(length=50)
	private String customerName;
	@Column(length=12)
	private String departTime;
	

}
