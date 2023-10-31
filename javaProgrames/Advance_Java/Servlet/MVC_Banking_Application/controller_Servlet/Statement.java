/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_Servlet;

import Model.Transactions;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import service.Banking_Service;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "Statement", urlPatterns = {"/Statement"})
public class Statement extends HttpServlet {

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
            
            HttpSession httpSession = request.getSession();
            String logUserId=(String)httpSession.getAttribute("userId");
            
            Transactions transactions = new Transactions();
            transactions.setUserId(logUserId);
            
            Banking_Service service= new  Banking_Service();
            ResultSet resultSet = service.statement(transactions);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Statement</title>");            
            out.println("</head>");
            out.println("<body>");
            try{
                out.println("<center><h2>Welcome : "+logUserId+"</h2></center>");
                out.println("<table align=center border='4px'  cellspacing='3px' cellpadding='10px'>"
            + "<tr>" 
                     
                    +"<th>Transaction Date</th>" 
                    +"<th>Ammount</th>"
                    +"<th>Transaction Type</th>" 
                    +"</tr>");
            if(resultSet.next()){
                while(resultSet.next()){ 
                out.println("<tr >"
                    
                    +"<td>"+resultSet.getDate(1)+"</td>"    
                    +"<td>"+resultSet.getDouble(2)+"</td>"    
                    +"<td>"+resultSet.getString(3)+"</td>"    
                    + "</tr>");
                
                
            }
                out.println("</table>");
            }
              
              else{
                 out.println("Data not fetch");
            }
                }catch(Exception e){
                    out.println(e);
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
