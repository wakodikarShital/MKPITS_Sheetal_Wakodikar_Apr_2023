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
import java.sql.ResultSet;
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
@WebServlet(urlPatterns = {"/Transfer"})
public class Transfer extends HttpServlet {

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
        
        Connection connection;
        PreparedStatement preparedStatement;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String UserId = request.getParameter("User_Id");
            int balance = Integer.parseInt(request.getParameter("amount"));
            String transferIn = "Transfer In";
            String transferOut = "Transfer Out";
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Transfer</title>");            
            out.println("</head>");
            out.println("<body>");
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Details","root","Shital@123");
            System.out.println("Connection Established from database");
            
            HttpSession httpSession = request.getSession(true);
            long value = httpSession.getCreationTime();
                //           -------------------------------- insert money on account------------------------------
                 preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
                preparedStatement.setString(1, UserId);
                preparedStatement.setDate(2, new java.sql.Date(value));
                preparedStatement.setDouble(3, balance);
                preparedStatement.setString(4,transferIn );
                int returnValue = preparedStatement.executeUpdate();
                
                
                //------------------------------------- insert money from that account ------------------------
                 preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
                 
                 httpSession.getAttribute("UserId");
                preparedStatement.setString(1,(String) httpSession.getAttribute("UserId"));
                preparedStatement.setDate(2, new java.sql.Date(value));
                preparedStatement.setDouble(3, balance);
                preparedStatement.setString(4,transferOut );
                int returnValue1 = preparedStatement.executeUpdate();
                
                
                //-------------------------------- add ammount on that table ------------------------------
                preparedStatement = connection.prepareStatement(" update Account_details set accountBalance =accountBalance+? where customerUserId=?");
                preparedStatement.setDouble(1,balance);
             preparedStatement.setString(2,UserId);
             int updateValue = preparedStatement.executeUpdate(); 
             if(updateValue!=0){
              out.println("<center>Amount credited</center>");   
             }else{
                 out.println("<center>Not Amount credited</credited>");  
             }
             out.println("<br>");
             
              //-------------------------------- add ammount on that table ------------------------------
                preparedStatement = connection.prepareStatement(" update Account_details set accountBalance =accountBalance-? where customerUserId=? ");
                preparedStatement.setDouble(1,balance);
             preparedStatement.setString(2,(String) httpSession.getAttribute("UserId"));
             int updateValue2 = preparedStatement.executeUpdate(); 
             if(updateValue!=0){
              out.println("<center>Amount debited</center>");   
             }else{
                 out.println("<center>Not Amount debited</center>");  
             }
                
                
            
            }catch(Exception e){
                out.println(e);
            }
            
            
            
            out.println("<center><h3>Back to LogIn : <a href='newLogin.html'>LogIn<a> </h3></center>");
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
