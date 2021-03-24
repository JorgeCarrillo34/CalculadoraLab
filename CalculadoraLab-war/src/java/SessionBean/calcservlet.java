/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jorge_j3qr4sd
 */
public class calcservlet extends HttpServlet {

    @EJB
    private CalcBeanLocal calcBean;
    
    

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
            String a = request.getParameter("v1");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calcservlet</title>");            
            out.println("</head>");
            out.println("<body>"); 
            //2+3
            
            //out.println("\\+"); 
            for (int i = 0; i < a.length(); i++) { //revisa cada char y del arreglo y mira cual es la operacion para separar los operadores 
                //out.println("hola estoy antes del if");
                switch (a.charAt(i)) {
                    case '+':
                        //out.println("\\+");
                        out.println("<h1>La suma es " + calcBean.suma(Integer.parseInt(a.split("\\+")[0]), Integer.parseInt(a.split("\\+")[1])) + "</h1>");
                        break;
                    case '-':
                        out.println("<h1>La resta es " + calcBean.resta(Integer.parseInt(a.split("-")[0]), Integer.parseInt(a.split("-")[1])) + "</h1>");
                        break;
                    case '*':
                        out.println("<h1>La multiplicacion es " + calcBean.multi(Integer.parseInt(a.split("[*]")[0]), Integer.parseInt(a.split("[*]")[1])) + "</h1>");
                        break;
                    case '/':
                        out.println("<h1>La division es " + calcBean.div(Integer.parseInt(a.split("/")[0]), Integer.parseInt(a.split("/")[1])) + "</h1>");
                        break;
                    case '%':
                        out.println("<h1>El modulo es " + calcBean.mod(Integer.parseInt(a.split("%")[0]), Integer.parseInt(a.split("%")[1])) + "</h1>");
                        break;
                    case '^':
                        out.println("<h1>La potencia es " + calcBean.pot(Integer.parseInt(a.split("\\^")[0]), Integer.parseInt(a.split("\\^")[1])) + "</h1>");
                        break;
                    default:
                        break;
                }
            }
                
            
            
            
//           
//            int a = Integer.parseInt(request.getParameter("v1"));
//            int b = Integer.parseInt(request.getParameter("v2"));
//            String c = request.getParameter("v3");
//            switch(c)
//            {
//                case "suma":
//                    out.println("<h1>La suma es " + calcBean.suma(a, b) + "</h1>");
//                    break;
//                case "resta":
//                    out.println("<h1>La resta es " + calcBean.resta(a, b) + "</h1>");
//                    break;
//                case "multiplicacion":
//                    out.println("<h1>La multipliacion es " + calcBean.multi(a, b) + "</h1>");
//                    break;  
//                case "division":
//                    out.println("<h1>La division es " + calcBean.div(a, b) + "</h1>");
//                    break;    
//                case "modulo":
//                    out.println("<h1>La modulo es " + calcBean.mod(a, b) + "</h1>");
//                    break;    
//                case "potencia":
//                    out.println("<h1>La potencia es " + calcBean.pot(a, b) + "</h1>");
//                    break;                
//            }
//            
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
