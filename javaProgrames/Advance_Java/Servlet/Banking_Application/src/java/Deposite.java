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
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
@WebServlet(urlPatterns = {"/Deposite"})
public class Deposite extends HttpServlet {

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
        
        Connection connection ;
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            int amountDeposit = Integer.parseInt(request.getParameter("ammount"));
            String transactionType = "Deposite";
            
            try{
                
// ------------------------- ------------ Driver loaded -----------------------
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                    System.out.println("Driver Loading");
                    connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Details","root","Shital@123");
                    System.out.println("Connection Established from database");
// ---------------------------------- Insert data ------------------------------
                
                HttpSession httpSession = request.getSession(true);
                long value = httpSession.getCreationTime();
            
                PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
            httpSession.getAttribute("UserId");
            preparedStatement.setString(1, (String)httpSession.getAttribute("UserId"));
            preparedStatement.setDate(2,new java.sql.Date(value));
            preparedStatement.setDouble(3,amountDeposit);
            preparedStatement.setString(4,transactionType);
            int returnValue = preparedStatement.executeUpdate();
           
// ---------------------------------- update balance data ------------------------------
             
             preparedStatement =connection.prepareStatement(" update Account_details set accountBalance =accountBalance+? where customerUserId=? ");
             httpSession.getAttribute("acountBalance");
             preparedStatement.setDouble(1,amountDeposit);
             preparedStatement.setString(2, (String)httpSession.getAttribute("UserId"));
            int updateValue =preparedStatement.executeUpdate();
            System.out.println(updateValue);
            
            
            if(returnValue != 0){
            System.out.println("Student record Inserted");
            }else {
            System.out.println("Student record not inserted");
            }
            }catch(Exception e){
                out.println(e);
            }
            
                
                
            
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Deposite</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Deposite at " + request.getContextPath() + "</h1>");
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
