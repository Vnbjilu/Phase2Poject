package vikas.RatanRaman.Booking;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookingController
 */
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("action").isEmpty())
		{
			return;
		}
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("book"))
		{
			bookingdataInsert(request,response);
			
		}else if(action.equalsIgnoreCase("payAmount"))
		{
			paymentpage(request,response);
		}
				
			
	}

	private void paymentpage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Payment pay=new Payment();
		pay.setAccountNumber(request.getParameter("accountNumber"));
		pay.setBankName(request.getParameter("bankName"));
		pay.setBookingDate(request.getParameter("bookingDate"));
		pay.setFare(Integer.parseInt(request.getParameter("fare")));
		pay.setCustomerName(request.getParameter("customerName"));
		pay.setDepartTime(request.getParameter("departTime"));
		pay.setBookingId(Integer.parseInt(request.getParameter("bookingId")));
		pay.setFlightNumber(request.getParameter("flightNumber"));;
		
		PaymentDao Dao=new PaymentDao();
		int id=Dao.insert(pay);
		String msg="Your Ticket number ="+id;
		request.setAttribute("msg", msg);
		request.setAttribute("id", id);
		request.getRequestDispatcher("ticket.jsp").forward(request, response);
		
		
		
		
		
	}

	private void bookingdataInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookingDetails details=new BookingDetails();
		details.setBookingDate(request.getParameter("bookingDate"));
		details.setCustomerName(request.getParameter("customerName"));
		details.setCustomerEmail(request.getParameter("customerEmail"));
		details.setCustomerContact(request.getParameter("customerContact"));
		details.setFlightNumber(request.getParameter("flightNumber"));
		details.setFair(Integer.parseInt(request.getParameter("fare")));
		details.setFromLocation(request.getParameter("from"));
		details.setToLocation(request.getParameter("to"));
		details.setDepartTime(request.getParameter("departTime"));
		BookingDao bdao=new BookingDao();
		int id=bdao.insert(details);
		details.setBookingId(id);
		request.setAttribute("details", details);
		request.getRequestDispatcher("payment.jsp").forward(request, response);
		
	}

}
