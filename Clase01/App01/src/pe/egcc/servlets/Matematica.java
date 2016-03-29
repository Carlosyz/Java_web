package pe.egcc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/Sumar", "/Restar", "/Multiplicar", "/Dividir" })
public class Matematica extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		if (path.equals("/Sumar")) {
			sumar(request, response);
		} else if (path.equals("/Restar")) {
			restar(request, response);
		}
	}

	protected void sumar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// variables
		int n1, n2, suma;
		// cabecera
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Servlet01</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Sumar</h1>");
		// Datos
		n1 = Integer.parseInt(request.getParameter("n1"));
		n2 = Integer.parseInt(request.getParameter("n2"));
		out.println("<p>Numero 1: " + n1 + "</p>");
		out.println("<p>Numero 2: " + n2 + "</p>");
		// proceso
		suma = n1 + n2;
		out.println("<p>Suma: " + suma + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void restar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// variables
		int n1, n2, suma;
		// cabecera
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Servlet01</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Restar</h1>");
		// Datos
		n1 = Integer.parseInt(request.getParameter("n1"));
		n2 = Integer.parseInt(request.getParameter("n2"));
		out.println("<p>Numero 1: " + n1 + "</p>");
		out.println("<p>Numero 2: " + n2 + "</p>");
		// proceso
		suma = n1 - n2;
		out.println("<p>Resta: " + suma + "</p>");
		out.println("</body>");
		out.println("</html>");
	}
}