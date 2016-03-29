/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name="Carlos",
        urlPatterns = {"/uno","/dos","/tres"})
public class Servlet01 extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet01</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Bienvenido al mundo oscuro de Java</h1>");
            out.println("</body>");
            out.println("</html>");
    } 
}