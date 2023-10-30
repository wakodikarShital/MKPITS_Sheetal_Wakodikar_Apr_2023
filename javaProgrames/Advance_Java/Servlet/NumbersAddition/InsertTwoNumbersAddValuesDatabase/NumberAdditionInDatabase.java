/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LENOVO
 */
@WebServlet(urlPatterns = {"/NumberAdditionInDatabase"})
public class NumberAdditionInDatabase extends HttpServlet {

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
        
        Connection connection;
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            try{
                int number1 = Integer.parseInt(request.getParameter("number1"));
                int number2 = Integer.parseInt(request.getParameter("number2"));
                int total = number1+number2;
                
                Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksadded","root","Shital@123");
            System.out.println("Connection Established from database");
            
                //----------------------------------------------------------------------
            PreparedStatement preparedStatement = connection.prepareStatement(" insert into addition values(?,?,?)");
             preparedStatement.setInt(1,number1);
             preparedStatement.setInt(2,number2);
             preparedStatement.setInt(3,total);
             
             int updateValue = preparedStatement.executeUpdate();

            if(updateValue != 0){
            out.println("record insert");
            }else {
           out.println("Unable to added");
            }
                
            }catch(Exception e){
               out.println(e);
            }
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NumberAdditionInDatabase</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NumberAdditionInDatabase at " + request.getContextPath() + "</h1>");
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
