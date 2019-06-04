package net.codejava.struts;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jordi.Artal
 *
 */
public class LoginAction extends ActionSupport {
	 /**
	 * 
	 */
	private static final long serialVersionUID = -4475650916866625581L;
	
	private User userBean;
     
	    public String execute() {
	        System.out.println("email: " + userBean.getEmail());
	        System.out.println("pass: " + userBean.getPassword());
	         
	        // add your login procedure here...
	         
	        return SUCCESS;
	    }
	 
	    public User getUserBean() {
	        return userBean;
	    }
	 
	    public void setUserBean(User userBean) {
	        this.userBean = userBean;
	    }
}
