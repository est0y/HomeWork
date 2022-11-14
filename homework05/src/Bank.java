import java.util.*;

public class Bank {
    final private Map<Client, List<Account>> accountsByClient;
    final private Map<Account, Client> clientByAccount;

    Bank(Map<Client, List<Account>> accountsByClient,
         Map<Account, Client> clientByAccount) {
        this.accountsByClient = accountsByClient;
        this.clientByAccount = clientByAccount;
    }

    public void addClientWithAccounts(Client client, List<Account> accounts) {
        this.accountsByClient.put(client, accounts);
        for (Account account : accounts) {
            this.clientByAccount.put(account, client);
        }
    }

    Client findClient(Account account) {
        return clientByAccount.get(account);
    }

    List<Account> getAccounts(Client client) {
        return accountsByClient.get(client);
    }

    Set<Account> getAllAccounts() {
        return this.clientByAccount.keySet();
    }

    Set<Client> getAllClients() {
        return this.accountsByClient.keySet();
    }
}
