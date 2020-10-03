package code;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test01
 */
@WebServlet("/test01")
public class test01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setCharacterEncoding("UTF-8");
	String name=request.getParameter("username");
	String password=request.getParameter("password");
	String num=request.getParameter("num");
	String login1=request.getParameter("login");
	if(num!=null){
		System.out.println("登陆成功!");
	}
	if(login1!=null){
	if(name.equals("mr")&&password.equals("12345")){
		System.out.println("登陆成功");
		use user=new use();
		user.setGrade("95");
		user.setId("20181181");
		user.setName("林非凡");
		user.setPre_cno("c语言");
		boolean res=login.get().save(user);
		if(res==true){
			System.out.println("插入数据成功");
		}
		
		
}}
	else{
		System.out.println("登陆失败");
	}
	}
	

}
