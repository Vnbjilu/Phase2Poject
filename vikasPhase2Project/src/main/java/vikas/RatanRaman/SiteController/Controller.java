package vikas.RatanRaman.SiteController;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vikas.RatanRaman.Flight.FlightDao;
import vikas.RatanRaman.Flight.Flights;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(! request.getParameter("action").isEmpty())
		{
			String action=request.getParameter("action");
			if(action.equalsIgnoreCase("flights"))
				request.getRequestDispatcher("flightIndex.jsp").forward(request, response);
			else if(action.equals("search"))
				SearchFlight(request,response);
			else if(action.equals("searchFrm"))
				searchFrmShow(request,response);
			else if(action.equalsIgnoreCase("book"))
				bookFrmshow(request,response);
			
		}
	}

	private void bookFrmshow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fl=request.getParameter("value");
		FlightDao dao=new FlightDao();
		Flights flight=dao.getSpecficRecordById(fl);
		request.setAttribute("flight", flight);
		request.getRequestDispatcher("bookingFrm.jsp").forward(request, response);
	}

	private void searchFrmShow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("searchIndex.jsp").forward(request, response);
		
	}

	private void SearchFlight(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String from=request.getParameter("From");
		String to=request.getParameter("To");
		List<Flights> flight=new FlightDao().displayFlights(from, to);
		request.setAttribute("flight", flight);
		request.getRequestDispatcher("searchResult.jsp").forward(request, response);
		
	}

}
