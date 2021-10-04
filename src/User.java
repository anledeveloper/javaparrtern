
public class User {
    private String email;
    private String password;
    private LoginStatus status;

    public User(String email , String password){
        this.email =email;
        this.password =password ;
        
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email ){
        this.email = email;
    }
    
    public String getPassword(){
        return password ;
    }

    public void setPassword(String password) {
        this.password =password ;
    }
    public LoginStatus getStatus(){
        return status;
    }
    public void setStatus( LoginStatus status){
        this.status =status;
    }
}
