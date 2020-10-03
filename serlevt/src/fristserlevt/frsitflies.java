package fristserlevt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class frsitflies
 */
@WebServlet("/frsitflies")
public class frsitflies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public frsitflies() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE HTML PUBLIC\"-//W3C//DTD HTML 4.02 Transitional//EN\">");
		out.println("<HTML>");
		out.println("<HEAD><TITLE>动态生成HTML文档</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<table border='0' align='center'");
		out.println("<tr><td bgcolor='skyblue' colspan=2>动态生成HTML文档</td></tr>");
		out.println("</table>");
		out.println("</BODY>");
		out.println("</HTML>");
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost");// TODO Auto-generated method stub
	}

}
