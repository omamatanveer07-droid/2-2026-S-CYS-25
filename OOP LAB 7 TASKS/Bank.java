import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Client> ClList;
    private List<Account> AcList;

    public Bank() {
        this("", new ArrayList<>(), new ArrayList<>());
    }

    public Bank(String name) {
        this(name, new ArrayList<>(), new ArrayList<>());
    }

    public Bank(String name, List<Client> clients, List<Account> accounts) {
        this.name = name;
        this.ClList = (clients == null) ? new ArrayList<>() : clients;
        this.AcList = (accounts == null) ? new ArrayList<>() : accounts;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Client> getClList() { return ClList; }
    public void setClList(List<Client> clList) {
        this.ClList = (clList == null) ? new ArrayList<>() : clList;
    }

    public List<Account> getAcList() { return AcList; }
    public void setAcList(List<Account> acList) {
        this.AcList = (acList == null) ? new ArrayList<>() : acList;
    }

    public Client addClient(Person person) {
        if (person == null) return null;
        Client client = new Client(person);
        ClList.add(client);
        return client;
    }

    public Account addAccount(String id, float amount, Client client) {
        if (client == null || !ClList.contains(client)) {
            System.out.println("Client must belong to this bank first.");
            return null;
        }
        if (amount < 0) {
            System.out.println("Initial amount cannot be negative.");
            return null;
        }
        Account account = new Account(amount, client);
        AcList.add(account);
        client.addAccount(account);
        return account;
    }

    public Account searchAccount(String id) {
        for (Account account : AcList) {
            if (account.getNumber().equals(id)) return account;
        }
        return null;
    }

    public boolean removeClient(String id) {
        Client client = searchClientById(id);
        if (client == null) return false;
        // Removing a client from this bank also removes this bank's accounts
        // belonging to that client. The Client object itself can still exist.
        AcList.removeIf(account -> account.getACholder() == client);
        client.getAcList().removeIf(account -> !AcList.contains(account));
        ClList.remove(client);
        return true;
    }

    public float totalAmount() {
        float total = 0;
        for (Account account : AcList) total += account.getAmount();
        return total;
    }

    public Client searchCustomerDetail(String CNIC) {
        for (Client client : ClList) {
            Person person = client.getPersonDetails();
            if (person != null && person.getCNIC().equals(CNIC)) return client;
        }
        return null;
    }

    private Client searchClientById(String id) {
        for (Client client : ClList) {
            if (client.getId().equals(id)) return client;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Bank: " + name + "\\nClients:\\n");
        for (Client client : ClList) result.append(client).append("\\n\\n");
        result.append("Bank total balance: ").append(totalAmount());
        return result.toString();
    }
}
