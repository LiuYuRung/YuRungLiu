import java.io.IOException;
import java.util.ArrayList;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/post") //URLマッピング
public class PostServlet extends HttpServlet{
    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException{
        System.out.println("***** post *****");
        req.setCharacterEncoding("UTF-8");
        
        ServletContext sc = this.getServletContext();
        //パラメータを取得
        String name = req.getParameter("name");
        String comment = req.getParameter("comment");
        String color = req.getParameter("color");

        ArrayList<String> namelist = (ArrayList<String>) sc.getAttribute("name");
        if (namelist == null) {
            namelist = new ArrayList<String>();  // 新しいリストを作成
        }

        ArrayList<String> comlist = (ArrayList<String>) sc.getAttribute("comment");
        if (comlist == null) {
            comlist = new ArrayList<String>();  // 新しいリストを作成
        }

        ArrayList<String> colorlist = (ArrayList<String>) sc.getAttribute("color");
        if (colorlist == null) {
            colorlist =  new ArrayList<String>();  // デフォルト色
        }

        namelist.add(name);
        comlist.add(comment);
        colorlist.add(color);

        sc.setAttribute("name", namelist);
        sc.setAttribute("comment", comlist);
        sc.setAttribute("color",colorlist);

        RequestDispatcher dispatcher
        = req.getRequestDispatcher("/update.html");

        dispatcher.forward(req, res);
    } 
}