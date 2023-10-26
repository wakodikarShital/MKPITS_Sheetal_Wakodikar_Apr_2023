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
@WebServlet(name = "insert_details_tabular_format", urlPatterns = {"/insert_details_tabular_format"})
public class insert_details_tabular_format extends HttpServlet {

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
            
            
             String studentRollNo= request.getParameter("Roll_No");
             String studentName= request.getParameter("Name_Of_Student");
             String pin= request.getParameter("pin");
             String city= request.getParameter("City");
             
             
            Connection connection;
            try{
            
//            Driver laded-------------------------------------------
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment_system","root","Shital@123");
            System.out.println("Connection Established from database");
            
//            Data Insert tabular format--------------------------
            
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Student_Details values(?,?,?,?)");
            preparedStatement.setString(1,studentRollNo);
            preparedStatement.setString(2,studentName);
            preparedStatement.setString(3,pin);
            preparedStatement.setString(4,city);
            int returnValue = preparedStatement.executeUpdate();
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
            out.println("<title>Servlet insert_details_tabular_format</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2><center>Student Records </center></h2>");
            out.println("<table align=center border=1 cellspacing=2 cellpadding=5>"
            + "<tr>" +
                     "<th>studentRollNo</th>"
                    +"<th>studentName</th>" 
                    +"<th>pin</th>"
                    +"<th>City</th>" 
            +"</tr>"
            + "<tr>"+
                    "<td>"+studentRollNo+"</td>"
                    +"<td>"+studentName+"</td>" 
                    +"<td>"+pin+"</td>"
                    +"<td>"+city+"</td>" 
            + "</tr>" );
            out.println("</table>");
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
