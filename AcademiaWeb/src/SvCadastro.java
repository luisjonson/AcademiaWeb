
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SvCadastro
 */
@WebServlet("SvCadastro")
public class SvCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SvCadastro() {
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

		String matricula = request.getParameter("matrivula");
		String nome = request.getParameter("nome");
		String narciumento = request.getParameter("dataDeNascimento");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		String telefone = request.getParameter("telefone");

		PrintWriter out = response.getWriter();
		out.print(matricula);
		out.print(nome);
		out.print(narciumento);
		out.print(email);
		out.print(endereco);
		out.print(telefone);

	}
}
