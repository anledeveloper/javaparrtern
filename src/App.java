public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ManagerAccountImpl managerAccountImpl = getMangerAcount(new User("john", "password"));
        managerAccountImpl.actionLogin("john", "password");
        managerAccountImpl.changeStatus(LoginStatus.SUCCESS);
    }
    private static ManagerAccountImpl getMangerAcount( User user) {
        ManagerAccountImpl managerAccountImpl = new ManagerAccountImpl(user);
        managerAccountImpl.attach(new NotiLogger());
        managerAccountImpl.attach(new NotifileValidate());
        managerAccountImpl.attach(new NotiSuccess());
        return managerAccountImpl;
    }
}
