import java.util.*;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        for (int i = 1; i <= 10; i++) {
            Set<Account> accounts = new HashSet<>();
            Client client=new Client(i,"Oleg", 14);
            accounts.add(new Account(i,12));
            accounts.add(new Account(++i,13));
            bank.addClientWithAccounts(client, accounts);
        }
        bank.addClientWithAccount(new Client(1,"Oleg",14),new Account(100,100));
        Set<Client> clients = bank.getAllClients();
        for (Client client : clients) {
            System.out.println("Клиент:" + client + " владеет счетами:" + bank.getAccounts(client));
        }
        Set<Account> accounts = bank.getAllAccounts();
        for (Account account : accounts) {
            System.out.println("Владелец счета:" + account + " клиент:" + bank.findClient(account));
        }
    }
}
