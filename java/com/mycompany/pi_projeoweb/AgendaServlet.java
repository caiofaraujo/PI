/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi_projeoweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author caio.faraujo
 */

@WebServlet("/agenda")
public class AgendaServlet extends HttpServlet {
    
//    @Override
    public void goGet (HttpServletRequest request, HttpServletResponse response) throws ServletException {
        response.setContentType("text/plain");
        try (PrintWriter out = response.getWriter()){
            out.print("Olá mundo Servlet Web");
            out.flush();
        } catch (IOException ex) {
            
        } 
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("AgendaJSP.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (IOException ex) {
            
        }
        
    }
}
