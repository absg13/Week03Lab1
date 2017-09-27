/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import business.service.*;
/**
 *
 * @author 738377
 */
public class LoginServlet extends HttpServlet {

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
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
                    forward(request, response);
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
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if (username == null || password == null) {
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
                    forward(request, response);
            
            return;
        } 
        
        else if (username.isEmpty() || password.isEmpty()) {
            request.setAttribute("message", "Both values are required!");
           
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
                    forward(request, response);
            
            return;
        }
        
        UserService user = new UserService();
        
        if (user.login(username, password) == true) {
            
            User person = new User();
            person.setUsername(username);
            person.setPassword(password);
            
            request.setAttribute("user", person);
            getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").
                    forward(request, response);
        
            return;
        }
        
        request.setAttribute("message", "Invalid username or password!");
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").
                    forward(request, response);
    }
// </editor-fold>

}
