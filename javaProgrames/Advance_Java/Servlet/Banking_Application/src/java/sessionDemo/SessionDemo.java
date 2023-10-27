/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionDemo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "SessionDemo", urlPatterns = {"/SessionDemo"})
public class SessionDemo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
//             --------------------- create session HttpSession Interface -------------------
            
            HttpSession httpSession = request.getSession(true);
            out.println(httpSession);
            out.println("<br>");
            
//            --------------------- get session id-------------------
            
           String sessionId =  httpSession.getId();
           out.println(sessionId);
           out.println("<br>");
           
//           ------------------------ session isNew() method return true or false ----------------

           boolean session  =  httpSession.isNew();
           out.println(session);
           
//         ------------------------ session setAttribute() ---------------------------
            httpSession.setAttribute("studentName", "shital");
            
//         ------------------------ session getAttribute() ---------------------------
            out.println(httpSession.getAttribute("studentName"));
            
//         ------------------------ session getCreationTime() ---------------------------
            long value = httpSession.getCreationTime();
            out.println(new java.sql.Date(value));
            
//         ------------------------ session putValue() ---------------------------
            httpSession.putValue("S_name", "Nikki");
//         ------------------------ session setValue() ---------------------------
            out.println(httpSession.getValue("S_name"));
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SessionDemo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SessionDemo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
