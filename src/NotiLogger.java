public class NotiLogger implements  NotiAccount{

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        System.out.println("user is : " + user.getEmail() + user.getPassword());
    }
    
}
