//package servlet_examples;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
                               	

    int Count = 1;

   	req.setCharacterEncoding("Big5");
    res.setContentType("text/html; charset=Big5");
    PrintWriter out = res.getWriter();

    String name = req.getParameter("name");
    out.println("<HTML>");
    out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
    out.println("<BODY>");
    out.println("Hello, §A¦ngit3: " + name);
    
    out.println("<br><img src=\""+req.getContextPath()+"/images/tomcat.gif\">");
    out.println("<br><img src=\""+   "/IBM_9"         +"/images/tomcat.gif\">");
    out.println("<br><img src=\"/IBM_9/images/tomcat.gif\">");
    
    out.println("</BODY></HTML>");
  }
  
  public String getServletInfo() {
    return "A servlet that knows the name of the person to whom it's" + 
           "saying hello";
  }
}