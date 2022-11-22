import java.util.*;

public class Bank {
    final private Map<Client, Set<Account>> accountsByClient;
    final private Map<Account, Client> clientByAccount;

    Bank() {
        this.accountsByClient = new HashMap<>();
        this.clientByAccount = new HashMap<>();
    }


    public void addClientWithAccounts(Client client, Set<Account> accounts) {
        for (Account account:accounts){
            addClientWithAccount(client,account);
        }
        /*this.accountsByClient.put(client, accounts);
        for (Account account : accounts) {
            this.clientByAccount.put(account, client);
        }*/
    }
    public void addClientWithAccount(Client client,Account account) {
        if(this.accountsByClient.get(client)==null){
            Set<Account> clientAccounts=new HashSet<>();
            clientAccounts.add(account);
            this.accountsByClient.put(client,clientAccounts);
        }
        else {
            Set<Account> clientAccounts=this.accountsByClient.get(client);
            clientAccounts.add(account);
        }
        this.clientByAccount.put(account,client);
    }

    Client findClient(Account account) {
        return clientByAccount.get(account);
    }

    Set<Account> getAccounts(Client client) {
        return accountsByClient.get(client);
    }

    Set<Account> getAllAccounts() {
        return this.clientByAccount.keySet();
    }

    Set<Client> getAllClients() {
        return this.accountsByClient.keySet();
    }
}
