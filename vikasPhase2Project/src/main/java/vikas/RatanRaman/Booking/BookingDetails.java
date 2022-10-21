package vikas.RatanRaman.Booking;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	private String bookingDate;
	private String customerName;
	private String customerEmail;
	private String customerContact;
	private String flightNumber;
	private String fromLocation;
	private String toLocation;
	int fair;
	private String departTime;
	

}
