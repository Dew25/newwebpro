/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Article;
import entity.User;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.ArticleFacade;
import session.UserFacade;


/**
 *
 * @author Melnikov
 */
@WebServlet(name = "AdminController", urlPatterns = {"/admin","/newArticle","/addArticle"})
public class AdminController extends HttpServlet {
@EJB UserFacade userFacade;
@EJB ArticleFacade articleFacade;
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
        request.setCharacterEncoding("UTF-8");
        String userPath = request.getServletPath();
        if("/admin".equals(userPath)){
            List<User> users = userFacade.findAll();
            request.setAttribute("users", users);
            request.getRequestDispatcher("/WEB-INF"+userPath+".jsp").forward(request, response);
        }else if("/newArticle".equals(userPath)){
            request.getRequestDispatcher("/WEB-INF"+userPath+".jsp").forward(request, response);
        }else if("/addArticle".equals(userPath)){
            String title = request.getParameter("title");
            String text = request.getParameter("text");
            String author = request.getParameter("author");
            Date date = new Date();
            Article article = new Article(title, text, author, date);
            articleFacade.create(article);
            List<Article> articles = articleFacade.findAll();
            request.setAttribute("articles", articles);
            request.getRequestDispatcher("/WEB-INF/user.jsp").forward(request, response);
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
