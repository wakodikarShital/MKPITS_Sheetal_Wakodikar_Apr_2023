/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller_Servlet;

import Model.Transactions;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
@WebServlet(name = "DepositAmount", urlPatterns = {"/DepositAmount"})
public class DepositAmount extends HttpServlet {

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
            //------------------------ get the request from html page through get paremeter--------
            
             HttpSession httpSession = request.getSession();
             long value=httpSession.getCreationTime();
             
            String userId=(String)httpSession.getAttribute("userId");
            Date transactionDate=new java.sql.Date(value);
            int depositAmount = Integer.parseInt(request.getParameter("amount"));
            String transactionType="Deposit";
            
            Transactions transactions = new Transactions();
            transactions.setUserId(userId);
            transactions.setTransactionDate(transactionDate);
            transactions.setDepositAmount(depositAmount);
            transactions.setTransactionType(transactionType);
            
            Banking_Service bankingService = new Banking_Service();
            
            
  
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DepositAmount</title>");            
            out.println("</head>");
            out.println("<body>");
            if(bankingService.depositAmount(transactions)==0)
               out.println("<h2><center>Amount not deposited</center></h2>");
            else
                
             out.println("<h2><center>Amount deposited successfully</center></h2>");
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
