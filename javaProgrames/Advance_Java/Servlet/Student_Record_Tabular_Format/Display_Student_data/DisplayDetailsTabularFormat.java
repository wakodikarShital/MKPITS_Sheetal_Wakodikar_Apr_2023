/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_Records_Details;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "DisplayDetailsTabularFormat", urlPatterns = {"/DisplayDetailsTabularFormat"})
public class DisplayDetailsTabularFormat extends HttpServlet {

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
            
            
                Connection connection;

            try{
                
//                --------------- Driver loaded ---------------------------------
             Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment_system","root","Shital@123");
            System.out.println("Connection Established from database");
            
//            ------------------- Display Records in tabular fromat -----------------
            
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DisplayStudentRecords</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2><center>Student Records</center></h2>");
           
            Statement statement= connection.createStatement();
              ResultSet resultSet = statement.executeQuery("select * from Student_Details");
             out.println("<table align=center border=1 cellspacing=2 cellpadding=5>"
            + "<tr>" +
                     "<th>Roll No</th>"
                    +"<th>Student Name</th>" 
                    +"<th>Pin code</th>"
                    +"<th>City</th>" 
            +"</tr>");
              
              while(resultSet.next()){
//                   out.println("<h1>"+resultSet.getString(2)+ " "+resultSet.getString(3)+ " "+ resultSet.getString(1)+ " "+resultSet.getString(4)+ "</h1>");
//                 System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
                    out.println("<tr>"
                    +"<td>"+resultSet.getString(1)+"</td>"
                    +"<td>"+resultSet.getString(2)+"</td>"    
                    +"<td>"+resultSet.getString(3)+"</td>"    
                    +"<td>"+resultSet.getString(4)+"</td>"    
                    + "</tr>");
              }
              out.println("</table>");
              
            
            }catch(Exception e){
            System.out.println(e);
            }
            
           
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
