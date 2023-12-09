package J_opps_java.bank;
class Account{
    public String name;
    protected String email;
    private String password;
    //-----------------------------------(getters & setters)---------------------------------------------
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
         this.password=pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "John";
        account.email = "John@gmail.com";
        account.setPassword("<PASSWORD>");
        System.out.println(account.name);
        System.out.println(account.email);
        System.out.println(account.getPassword());

    }

}
