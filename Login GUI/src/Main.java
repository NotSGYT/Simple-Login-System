import javax.swing.*;

public class Main {
	
    public static void main(String[] args) {
    	
    	JFrame frame = new JFrame();
    	frame.setTitle("GUI");
    	
    	
        IDAndPass idAndPass = new IDAndPass();

        LoginPage loginPage = new LoginPage(idAndPass.getLoginInfo());

    }
}