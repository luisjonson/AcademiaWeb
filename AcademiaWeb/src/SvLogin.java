import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SvLogin
 */
@WebServlet("/Login")
public class SvLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SvLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		RequestDispatcher rd = null;

		request.setAttribute(nome, "nome");

		if (nome.equals("name") && senha.equals("pass")) {
			rd = request.getRequestDispatcher("/WelcomeServlet");
			rd.forward(request, response);
		} else {
			out.println("<b>Invalid Login Info.</b><br>");
			rd = request.getRequestDispatcher("/LoginInfo.jsp");
			rd.include(request, response);
		}
		out.close();

	}

}
