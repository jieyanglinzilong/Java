package serlevt02;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDemo5 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*
         * 设置参数查询的编码
         * 该方法只能对请求实体内容的数据编码起作用。POST提交的数据在实体内容中，所以该方法对POST方法有效！
         * GET方法的参数放在URI后面，所以对GET方式无效！！！
         */
        request.setCharacterEncoding("utf-8");

        /*
         * 统一方便地获取请求参数的方法
         */
        System.out.println(request.getMethod() + "方式");
        
//        String value = request.getQueryString();
//        System.out.println(value);
        
        /*
         * request.getParameterNames()方法
         * 将发送请求页面中form表单里所有具有name属性的表单对象获取(包括button).
         * 返回一个Enumeration类型的枚举
         */
        Enumeration<String> enums = request.getParameterNames();
        while( enums.hasMoreElements() ) {
            
            String paramName = enums.nextElement();
            
            //如果参数名是habit，则调用getParameterValues
            if ("habit".equals(paramName)) {
                // getParameterValues(name): 根据参数名获取参数值（可以获取多个值的同名参数）
                String[] habits = request.getParameterValues("habit");
                for(String habit : habits) {
                    if("GET".equals(request.getMethod())) {
                        habit = new String(habit.getBytes("iso-8859-1"), "UTF-8");
                    }
                    System.out.println("选中的爱好：" + habit);
                }
            } else { //如果不是habit，则调用getParameter
                String paramValue = request.getParameter(paramName);
                if ( "GET".equals(request.getMethod()) ) {
                    paramValue = new String(paramValue.getBytes("iso-8859-1"), "UTF-8");
                }
                System.out.println(paramName + " = " + paramValue);
            }
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        
        // 获取以表单提交的post类型的值
//        InputStream in = request.getInputStream();
//        byte[] buf = new byte[1024];
//        int length = 0;
//        while ( (length = in.read(buf)) != -1 ) {
//            System.out.println(new String(buf, 0, length));
//        }
        
        // 统一方便地获取请求参数的方法
//        Enumeration enums = request.getParameterNames();
//        while( enums.hasMoreElements() ) {
//            String paramName = (String) enums.nextElement();
//            String paramValue = request.getParameter(paramName);
//            System.out.println(paramName + " = " + paramValue);
//        }
        this.doGet(request, response);
    }

}