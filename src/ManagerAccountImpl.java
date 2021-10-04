import java.util.ArrayList;
import java.util.List;

public class ManagerAccountImpl implements ManagerAccount{

    private User user;
    private List<NotiAccount> notiAccounts = new ArrayList<>();
    public ManagerAccountImpl(User user){
        this.user = user;
    }
    @Override
    public void attach(NotiAccount notiAccount) {
        // TODO Auto-generated method stub
        notiAccounts.add(notiAccount);
    }
    
    @Override
    public void notifileAll() {
        // TODO Auto-generated method stub
        for (NotiAccount x : notiAccounts){
            x.update(user);
        }        
    }

    public void changeStatus(LoginStatus status) {
        user.setStatus(status.SUCCESS);
        notifileAll();
    }
    public void actionLogin (String login , String password) {
        user =new User(login ,password);
        if (login == "John"){
            
            user.setStatus(LoginStatus.SUCCESS);
           
        }else {
           
            user.setStatus(LoginStatus.FAILD);
           
        }
        System.out.println("Login is handled");
        this.notifileAll();
    }
    
    
    
}
