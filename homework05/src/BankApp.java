import java.util.*;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank(new HashMap<>(), new HashMap<>());
        for (int i = 1; i <= 5; i++) {
            List<Account> accounts = new ArrayList<>();
            accounts.add(new Account(12));
            accounts.add(new Account(13));
            bank.addClientWithAccounts(new Client("Oleg", 14), accounts);
        }
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
