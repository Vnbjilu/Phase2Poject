package vikas.RatanRaman.Flight;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FlightController
 */
@WebServlet("/FlightController")
public class FlightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("addfrm"))
			addFlightsFrm(request,response);
		else if(action.equalsIgnoreCase("deletefrm"))
			deleteFlightsFrm(request,response);
		else if(action.equalsIgnoreCase("displayfrm"))
			displayFlightFrm(request,response);
		else if(action.equalsIgnoreCase("editfrm"))
			editFlightsFrm(request,response);
		else if(action.equalsIgnoreCase("AddFlight"))
			addFlightRecord(request,response);	
		else if(action.equalsIgnoreCase("editFlights"))
			editFlightRecord(request,response);
		else if(action.equalsIgnoreCase("UpdateFlight"))
			updateFlightRecord(request,response);
	}

	private void updateFlightRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Flights flight=new Flights();
		flight.setAirlineName(request.getParameter("airlineName"));
		flight.setFlightNumber(request.getParameter("flightNumber"));
		flight.setFromLocation(request.getParameter("fromLocation"));
		flight.setToLocation(request.getParameter("toLocation"));
		flight.setArrivalTime(request.getParameter("arrivalTime"));;
		flight.setDepartTime(request.getParameter("departTime"));
		flight.setCapacity(Integer.parseInt(request.getParameter("capacity")));
		flight.setFair(Integer.parseInt(request.getParameter("fair")));
		FlightDao fl=new FlightDao();
		fl.update(flight);
		request.getRequestDispatcher("flightDisplay.jsp").forward(request, response);
		
	}

	private void editFlightRecord(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String Flnumber=request.getParameter("value");
		FlightDao dao=new FlightDao();
		Flights flight=dao.getSpecficRecordById(Flnumber);
		request.setAttribute("flight", flight);
		request.getRequestDispatcher("FlightEditfrm.jsp").forward(request, response);;
		
	}

	private void addFlightRecord(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Flights flight=new Flights();
		flight.setAirlineName(request.getParameter("airlineName"));
		flight.setFlightNumber(request.getParameter("flightNumber"));
		flight.setFromLocation(request.getParameter("fromLocation"));
		flight.setToLocation(request.getParameter("toLocation"));
		flight.setArrivalTime(request.getParameter("arrivalTime"));;
		flight.setDepartTime(request.getParameter("departTime"));
		flight.setCapacity(Integer.parseInt(request.getParameter("capacity")));
		flight.setFair(Integer.parseInt(request.getParameter("fair")));
		FlightDao fl=new FlightDao();
		fl.Insert(flight);
		request.getRequestDispatcher("flightDisplay.jsp").forward(request, response);
		
		
	}

	private void editFlightsFrm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void displayFlightFrm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("flightDisplay.jsp").forward(request, response);
		
	}

	private void deleteFlightsFrm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void addFlightsFrm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("addFlightFrm.jsp").forward(request, response);
		
	}
	}


