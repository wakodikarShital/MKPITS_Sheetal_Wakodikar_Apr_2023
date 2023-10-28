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
import java.sql.Statement;
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
@WebServlet(urlPatterns = {"/Statement_And_TotalBalance"})
public class Statement_And_TotalBalance extends HttpServlet {

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
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Details","root","Shital@123");
            System.out.println("Connection Established from database");
            
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayStudentRecords</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            HttpSession httpSession = request.getSession(true);
            httpSession.getAttribute("UserId");
            out.println("<center><h2>Welcome : "+httpSession.getAttribute("UserId")+"</h2></center>");
            
            preparedStatement =connection.prepareStatement(" select * from transactions where customerUserId = ?");
            preparedStatement.setString(1, (String) httpSession.getAttribute("UserId"));          
            resultSet= preparedStatement.executeQuery();
             out.println("<table align=center border=1 cellspacing=3 cellpadding=10>"
            + "<tr>" +
                     "<th>User Id</th>"
                    +"<th>Transaction Date</th>" 
                    +"<th>Ammount</th>"
                    +"<th>Transaction Type</th>" 
            +"</tr>");
             
              while(resultSet.next()){ 
            out.println("<tr>"
                    +"<td>"+resultSet.getString(1)+"</td>"
                    +"<td>"+resultSet.getString(2)+"</td>"    
                    +"<td>"+resultSet.getString(3)+"</td>"    
                    +"<td>"+resultSet.getString(4)+"</td>"    
                    + "</tr>");
              }
              out.println("</table>");
              
            preparedStatement =connection.prepareStatement(" select accountBalance = ? from Account_details where customerUserId = ?");
            
            preparedStatement.setString(1, (String) httpSession.getAttribute("UserId"));
            preparedStatement.setDouble(2, (double) httpSession.getAttribute("amount"));
            resultSet= preparedStatement.executeQuery();
             
             
            out.println("<h2><center>Balance : "+httpSession.getAttribute("amt")+"</center></h2>");
              
            
                
            }catch(Exception e){
                
            }
            
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Statement_And_TotalBalance</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Statement_And_TotalBalance at " + request.getContextPath() + "</h1>");
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
