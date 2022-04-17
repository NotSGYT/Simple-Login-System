import java.util.HashMap;

public class IDAndPass {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDAndPass(){

        logininfo.put("Shivam","Shivam");
        logininfo.put("Saish","Saish");
        logininfo.put("Vishnu","Vishnu");
        logininfo.put("Priti","Priti");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}