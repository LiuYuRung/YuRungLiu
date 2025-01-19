import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DelServlet extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException{
        System.out.println("***** delete *****");
        getServletContext().removeAttribute("name");
        getServletContext().removeAttribute("comment");
        getServletContext().removeAttribute("namelist");
        getServletContext().removeAttribute("comlist");
        RequestDispatcher dispatcher
        = req.getRequestDispatcher("/update.html");
        
        dispatcher.forward(req, res);
    } 
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        doPost(req, res);
        getServletContext().removeAttribute("name");
        getServletContext().removeAttribute("comment");
        getServletContext().removeAttribute("color");
        getServletContext().removeAttribute("namelist");
        getServletContext().removeAttribute("comlist");
        getServletContext().removeAttribute("colorlist");
        
        RequestDispatcher dispatcher
        = req.getRequestDispatcher("/update.html");
    }
}