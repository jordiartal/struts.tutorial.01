package net.codejava.struts;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jordi.Artal
 *
 */
public class TestAction extends ActionSupport{
	static final Logger LOGGER = Logger.getLogger(TestAction.class.getName());
    
    public String execute() {
         
        LOGGER.info("This is a debug log message from Struts2");
         
        return SUCCESS;
    }
}
