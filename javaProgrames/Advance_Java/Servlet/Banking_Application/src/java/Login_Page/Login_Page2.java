/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login_Page;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "Login_Page2", urlPatterns = {"/Login_Page2"})
public class Login_Page2 extends HttpServlet {

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
            String userid = request.getParameter("customerUserId");
            String password = request.getParameter("password");
            
              try{
                
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    System.out.println("Driver Loading");
                    connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_Details","root","Shital@123");
                    System.out.println("Connection Established from database");
                    
             
            PreparedStatement preparedStatement =connection.prepareStatement(" select * from Account_details where customerUserId = ? and password =?");
            preparedStatement.setString(1,userid);
            preparedStatement.setString(2,password);
             ResultSet resultSet= preparedStatement.executeQuery();
             
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayStudentRecords</title>");            
            out.println("</head>");
            out.println("<body>");
            
           
            if(resultSet.next()){
                
                HttpSession httpSession = request.getSession(true);
                 httpSession.setAttribute("UserId", userid );
           out.println("<center><h2>Welcome : " + userid+ "<h2></center>");
               
            }
            else{
            out.println("Incorrect Password");
             
            }
                       
              }catch(Exception e){
                  System.out.println(e);
              }
              
              
          
            out.println("<center><h3><u><a = href='deposite.html'>Deposit</u></a> || <u> Withdraw </u> <h3></center>");
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
