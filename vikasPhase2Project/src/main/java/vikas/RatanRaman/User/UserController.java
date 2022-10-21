package vikas.RatanRaman.User;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("create"))
			createAccount(request,response);
		else if(action.equals("edit"))
		{
			editAccount(request,response);
		}else if(action.equals("update")) {
			updateAccount(request,response);
		}
			
		
	}

	private void updateAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		user.setUserId(Integer.parseInt(request.getParameter("userId")));
		user.setUserName(request.getParameter("userName"));
		user.setUserPassword(request.getParameter("userPassword"));
		user.setUserRole(request.getParameter("userRole"));
		UserDao udao=new UserDao();
		String msg=udao.getUpate(user);
		response.getWriter().print("<h1> "+msg+"</h1>");
		request.getRequestDispatcher("userDisplay.jsp").include(request, response);
		
	}

	private void editAccount(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id=Integer.parseInt(request.getParameter("userId"));
		UserDao ud=new UserDao();
		User user=ud.getSpecficRecordById(id);
		request.setAttribute("user", user);
		
		String userRole="<select name='userRole'>";
		if(user.getUserRole().isBlank())
			userRole+="<option value='' selected>Select</option>";
		else
			userRole+="<option value=''>Select</option>";
		if(user.getUserRole().equals("ADMIN"))
			userRole+="<option value='ADMIN' selected>Admin</option>";
		else
			userRole+="<option value='ADMIN' >Admin</option>";
		if(user.getUserRole().equals("USER"))
			userRole+="<option value='USER' selected>User</option>";
		else
			userRole+="<option value='USER'>User</option>";
		
		userRole+="</select>";
		request.setAttribute("userRole", userRole);
		
		try {
			request.getRequestDispatcher("editFrm.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void createAccount(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		User user=new User();
		user.setUserName(request.getParameter("userName"));;
		user.setUserPassword(request.getParameter("userPassword"));
		user.setUserRole(request.getParameter("userRole"));
		UserDao da=new UserDao();
		int id=da.Insert(user);
		response.getWriter().print("<h1>"+id+"< of that Record created Succesfully");
		
		
		
	}

}
