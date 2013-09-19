package action; 
 
import com.opensymphony.xwork2.ActionSupport; 
 
public class HelloWorld extends ActionSupport { 
 
	private static final long serialVersionUID = -923094184005572016L;

	public String execute() throws Exception { 
        setMessage(getText(MESSAGE));
        return SUCCESS; 
    } 
 
    public static final String MESSAGE = "HelloWorld.message"; 
 
    private String message; 
 
    public String getMessage() { 
 
        return message; 
    } 
 
    public void setMessage(String message) { 
        this.message = message; 
    } 
} 