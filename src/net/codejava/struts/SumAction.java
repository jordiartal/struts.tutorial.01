package net.codejava.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
 
import com.opensymphony.xwork2.ActionSupport;
 
/**
 * @author Jordi.Artal
 * for tutorial 'how-to-handle-exceptions-in-struts2'
 *
 */
public class SumAction extends ActionSupport implements ServletRequestAware {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2636356263822121074L;
	private HttpServletRequest request;
    private int sum;
 
    public int getSum() {
        return sum;
    }
 
    @Override
    public String execute() {
        // an exception might be thrown here if x/y is not a number
        int x = Integer.parseInt(request.getParameter("x"));
        int y = Integer.parseInt(request.getParameter("y"));
        sum = x + y;
        return SUCCESS;
    }
 
    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }
}