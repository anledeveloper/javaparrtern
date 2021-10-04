public class NotiSuccess implements NotiAccount{

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        if ( user.getStatus() == LoginStatus.SUCCESS){
            StringBuilder data = new StringBuilder("Account logined,... ");
            data.append(user.getEmail());
            System.out.println( data );
        }
    }
    
}
