package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dba.dbConnect;
import java.util.HashMap;

public final class history_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    HashMap h=(HashMap)session.getAttribute("UserDetails");
    if(h!=null){

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Confirm Form</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tbody\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tbackground-color: #ffc107;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.navbar\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tdisplay: inline;\r\n");
      out.write("\t\t\tfloat: right;\r\n");
      out.write("\t\t\tmargin:10px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.back\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\t/*position: absolute;*/\r\n");
      out.write("\t\t\ttop: 20%;\r\n");
      out.write("\t\t\tleft: 50%;\r\n");
      out.write("\t\t\tbackground-color: #000;\r\n");
      out.write("\t\t\topacity: 0.9;\r\n");
      out.write("\t\t\twidth: 1200px;\r\n");
      out.write("\t\t\theight: 350px;\r\n");
      out.write("\t\t\tcolor: #fff;\r\n");
      out.write("\t\t\toverflow-y: scroll;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.label\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tmargin: 15px;\r\n");
      out.write("\t\t\tfont-size: 1.2em;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.drop-down\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\twidth: 150px;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("                * {\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .column {\r\n");
      out.write("                float: left;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("                height: 500px;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .left {\r\n");
      out.write("                width: 50%;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .right {\r\n");
      out.write("                width: 50%;\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              .row:after {\r\n");
      out.write("                content: \"\";\r\n");
      out.write("                display: table;\r\n");
      out.write("                clear: both;\r\n");
      out.write("              }\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"py-3 container-fluid\" style=\"background-color: #592106;margin: 0px;display: inline-block;\">\r\n");
      out.write("\t\t<div class=\"text-center\" style=\"width: 70%;float: left;\">\r\n");
      out.write("\t\t\t\t<h2 style=\"color: white; font-family: Times New Roman;\">G L Bajaj Institute of Technology and Management</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"width: 30%;float: right;color: #fff;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- <a href=\"\" class=\"navbar\">hi</a>\r\n");
      out.write("\t\t\t<a href=\"\" class=\"navbar\">hi</a>\r\n");
      out.write("\t\t\t<a href=\"\" class=\"navbar\">hi</a>\r\n");
      out.write("\t\t\t<a href=\"\" class=\"navbar\">hi</a> -->\r\n");
      out.write("<!--\t\t\t<p class=\"navbar\">hii</p>-->\r\n");
      out.write("\t\t\t<p class=\"navbar\"><a href=\"Logout.jsp\">Logout</a></p>\r\n");
      out.write("                        <p class=\"navbar\">");
      out.print((String)h.get("name"));
      out.write("</p>\r\n");
      out.write("<!--                        <p class=\"navbar\"><i class=\"fa fa-home\" aria-hidden=\"true\" style=\"font-size: x-large\"></i></p>-->\r\n");
      out.write("                        <p class='navbar'><a href='userDashboard.jsp' ><i class='fa fa-home' aria-hidden='true' style='font-size:x-large'></i></a></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"panel panel-default text center\">\r\n");
      out.write("\t\t\t<div class=\"panel-heading text-center\">\r\n");
      out.write("                            <h3>All Bookings Booked By You</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</br>\r\n");
      out.write("\t</br>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"back\">        \r\n");
      out.write("\t\t\t<section>\r\n");
      out.write("                           ");

                               dba.dbConnect db = new dba.dbConnect();
                               ResultSet rs = db.history((String)h.get("name"));
                               int i = 1;
			     while(rs.next()){
			   
      out.write("\r\n");
      out.write("                        <hr style=\"background-color: #ffc107;\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-2\">\r\n");
      out.write("                                    ");
      out.write(" \r\n");
      out.write("                                    ");

                                        String audi = rs.getString("audiAssigned");
                                        
                                        if(audi.equalsIgnoreCase("SBG")){
                                    
      out.write("\r\n");
      out.write("                                   &nbsp;&nbsp;<img src=\"img/SBG.jpg\" width=\"150\" height=\"220\" padding-top: 25px;>  \r\n");
      out.write("                                     ");

                                     }
                                     else if(audi.equalsIgnoreCase("SHD")){
                                     
                                     
      out.write("\r\n");
      out.write("                                      &nbsp;&nbsp;<img src=\"img/SHD.jpg\" width=\"150\" height=\"220\" padding-top: 25px;>  \r\n");
      out.write("                                     ");

                                     }
                                     else if(audi.equalsIgnoreCase("Audi01")){
                                     
                                     
      out.write("\r\n");
      out.write("                                      &nbsp;&nbsp;<img src=\"img/Audi01.jpg\" width=\"150\" height=\"220\" padding-top: 25px;>  \r\n");
      out.write("                                     ");

                                     }
                                     else if(audi.equalsIgnoreCase("Audi02")){
                                     
                                     
      out.write("\r\n");
      out.write("                                      &nbsp;&nbsp;<img src=\"img/Audi02.jpg\" width=\"150\" height=\"220\" padding-top: 25px;>  \r\n");
      out.write("                                     ");

                                     }
                                     else if(audi.equalsIgnoreCase("PGDM Hall")){
                                     
                                     
      out.write("\r\n");
      out.write("                                      &nbsp;&nbsp;<img src=\"img/PGDMHall.jpg\" width=\"150\" height=\"220\" padding-top: 25px;>  \r\n");
      out.write("                                     \r\n");
      out.write("                                      ");

                                       }
                                       else{
                                      
      out.write("\r\n");
      out.write("                                     &nbsp;&nbsp;<img src=\"img/glbajaj-banner.jpg\" width=\"150\" height=\"220\" padding-top: 25px;>  \r\n");
      out.write("                                     ");

                                     }
                                     
      out.write("\r\n");
      out.write("                          ");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t\t    <form action=\"\" class=\"form-horizontal\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("                                            <label class=\"label\">S No.</label>\r\n");
      out.write("                                            <font size=\"4\" color=\"green\">");
      out.print( i++);
      out.write("</font>\r\n");
      out.write("                                            <label class=\"label\">Name of Department</label>\r\n");
      out.write("                                            <font size=\"4\" color=\"green\">");
      out.print( rs.getString("nameOfDepartment"));
      out.write("</font>\r\n");
      out.write("                                            <label class=\"label\">Name of Event</label>\r\n");
      out.write("                                            <font size=\"4\" color=\"green\">");
      out.print( rs.getString("eventName"));
      out.write("</font>\r\n");
      out.write("                                            <label class=\"label\">Type of Event</label>\r\n");
      out.write("                                            <font size=\"4\" color=\"green\">");
      out.print( rs.getString("typeOfEvent"));
      out.write("</font><br>\r\n");
      out.write("                                            <label class=\"label\">Chief Guest of the Event</label>\r\n");
      out.write("                                            <font size=\"4\" color=\"green\">");
      out.print( rs.getString("eventChiefGuest"));
      out.write("</font>\r\n");
      out.write("                                                <label class=\"label\">Date</label>\r\n");
      out.write("                                                <font size=\"4\" color=\"green\">");
      out.print( rs.getString("eventDate"));
      out.write("</font><br>\r\n");
      out.write("                                                <label class=\"label\">Time</label>\r\n");
      out.write("\r\n");
      out.write("                                            <font size=\"4\" color=\"green\">");
      out.print( rs.getString("time1"));
      out.write("</font> &nbsp;&nbsp;&nbsp;&nbsp; To &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                            <font size=\"4\" color=\"green\">");
      out.print( rs.getString("time2"));
      out.write("</font>\r\n");
      out.write("\r\n");
      out.write("                                                <label class=\"label\">Expected Gathering</label>\r\n");
      out.write("                                                <font size=\"4\" color=\"green\">");
      out.print( rs.getString("eventGathering"));
      out.write("</font> <br>\r\n");
      out.write("                                                \r\n");
      out.write("                                                <label class=\"label\">Allocated Audi</label>\r\n");
      out.write("                                                <font size=\"4\" color=\"green\">");
      out.print( rs.getString("audiAssigned"));
      out.write("</font> <br>\r\n");
      out.write("\r\n");
      out.write("                                  \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("                                \r\n");
      out.write("                                ");

                                    }
                                    
      out.write("\r\n");
      out.write("                                <hr style=\"background-color: #ffc107;\">\r\n");
      out.write("                                \r\n");
      out.write("            </div>                                    \r\n");
      out.write("        </div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/font-awesome.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");

    }else{
        session.setAttribute("msg","Plz Login First");
        response.sendRedirect("login.jsp");
    }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
