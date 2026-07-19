class PasswordManager{
    private String password;
    
    void setPassword(String password){
        if(password.length()>=8){
            this.password=password;
        }
        else{
            System.out.println("Must Contain 8 Character!");
        }
        
    }
    
    void changePassword(String oldPass, String newPass){
        if(this.password!=null && this.password.equals(oldPass)){
            if(newPass.length() >= 8){
                this.password = newPass;
            }else{
                System.out.println("New password must contain at least 8 characters.");
            }
        }
        else{
            System.out.println("Incorrect password");
        }
    }
    
    boolean checkPassword(String password){
        return this.password != null && this.password.equals(password);
    }
}
public class Main{
	public static void main(String[] args) {
	    PasswordManager p=new PasswordManager();
	    
	    p.changePassword("yeuyeuey","1234567");
	    
	    p.setPassword("ttut");
	    p.setPassword("yeuyeuey");
	    
	    
	    p.changePassword("yeuyeuey","1234567");
	    p.checkPassword("12345678");
	}
}
