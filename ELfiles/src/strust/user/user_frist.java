package strust.user;

import services.UserService;
import user_information.user;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class user_frist extends ActionSupport implements ModelDriven<user>{
    public user a=new user();
   
    public String execute() throws Exception {
    	 System.err.println("����ִ�е�Action");
        // ������ͼ SUCCESS�����ǿ�ܶ����
        UserService userservice=new UserService();
        boolean success=UserService.finduser(a);
        if(success){
        return SUCCESS;}
        else{
        	return ERROR;
        }
    }
	
	public user getModel() {
		// TODO Auto-generated method stub
		return a;
	}
}
