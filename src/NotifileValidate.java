public class NotifileValidate implements NotiAccount {

    @Override
    public void update(User user) {
        // TODO Auto-generated method stub
        if ( user.getStatus() == LoginStatus.FAILD){
            StringBuilder data = new StringBuilder("err this account is login false , try again... ");
            data.append(user.getEmail());
            System.out.println( data );
        }
    }
    
}
