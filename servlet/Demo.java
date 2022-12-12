import javax.servlet.*;
import javax.servlet.http.*;
import java .io.*;
import java.util.*;

public class Demo extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponce responce) throws ServletException,IOException
    {
        PrintWriter out = responce.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Marvellous Servlet</TITLE>");
        out.println("</HEAD");
        out.println("<BODY>");
        out.println("Marvellous Infosystem");
        out.println("</BODY>");
        out.println("</HTML");
    }
}
