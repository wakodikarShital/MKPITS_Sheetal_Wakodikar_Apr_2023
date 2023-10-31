/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import StudentModel.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.Studentdao;

/**
 *
 * @author LENOVO
 */
@WebServlet(urlPatterns = {"/MyRecord"})
public class MyRecord extends HttpServlet {

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
            //------------------ get request from html page ---------------------------
            String rollNo=request.getParameter("rollNo");
            String nameOfStudent=request.getParameter("nameOfStudent");
            String pin=request.getParameter("pin");
            String city=request.getParameter("city");
            
            //---------------- set the values in model of  student's class object -----------------
            //--------------------- create a object of Student class-----------------------
            Student student = new Student();
            student.setRollno(rollNo);
            student.setNameOfStudent(nameOfStudent);
            student.setPin(pin);
            student.setCity(city);
            
            //----------- pass that object to service class ----------------------------------------
            Studentdao studentdao = new Studentdao();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyRecord</title>");            
            out.println("</head>");
            out.println("<body>");
            //----------- take condition if studentdao.insert(student)!=0 means return 1 so print Record inserted successfully 
            //------ or
            //------ else studentdao.insert(student)==0 means return 0 so print Record not inserted successfully 
            if( studentdao.insert(student)!=0)
                out.println("Record inserted successfully");
            else
                out.println("Record not inserted ");
            //-------------------------------------------------------------------------------------------------
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
