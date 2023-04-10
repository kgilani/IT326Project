//Controller class that works with the server side to retrieve account information
import java.util.*;
class Controller {
    private List<Account> accounts;

    Controller() {
        accounts = new ArrayList<Account>();
    }

    public void createAccount(char[] username, char[] password) {
        accounts.add(new Account(username, password));
    }

    public void login(char[] username, char[] password) {
        for(Account account : accounts) {

        }
    }
}
