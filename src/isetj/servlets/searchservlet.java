package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchservlet
 */
@WebServlet("/searchservlet")
public class searchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n=request.getParameter("n");
		String s=request.getParameter("s");
		PrintWriter out=response.getWriter();
		out.println("<html><head>");
		out.println("<title>search</title></head>");
		out.println("<p><i>votre recherche : </i></p>");
		out.println(" <input type='tex' name='n' value='' >");
		out.println(" <label>moteur de recherche :  </label>");
		out.println(" <select name='s' size='1'> <option>GOOGLE</option>   <option>YAHOO</option>  </select>");
		out.println(" <input type='submit' value='chercher'>");
		out.println("</body></html>");
		
		response.sendRedirect("googl/");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
