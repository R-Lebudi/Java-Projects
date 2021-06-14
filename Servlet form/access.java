import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;
import java.sql.*;

public class access extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String id = request.getParameter("t1");
            String name = request.getParameter("t2");
            String address = request.getParameter("t3");
            
            out.println("Welcome:   " + name);
            out.println("</br></br>");
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                out.println("driver loaded");
                out.println("</br></br>");
                
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "");
                out.println("connection success");
                out.println("</br></br>");
                
                Statement stmt = con.createStatement();
                stmt.executeUpdate("insert into teacher values ('"+id+"', '"+name+"', '"+address+"');");
                out.println("Succesfully Added");
                
                con.close();
            }
            catch (Exception e){
            
            }
            
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
