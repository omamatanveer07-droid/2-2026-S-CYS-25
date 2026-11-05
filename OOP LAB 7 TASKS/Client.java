import java.util.ArrayList;
import java.util.List;

public class Client {
    private String id;
    private Person PersonDetails;
    private List<Account> AcList;
    private static int count = 0;

    public Client() {
        this(null);
    }

    public Client(Person person) {
        this.id = String.format("C%04d", ++count);
        this.PersonDetails = person;
        this.AcList = new ArrayList<>();
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Person getPersonDetails() { return PersonDetails; }
    public void setPersonDetails(Person personDetails) { this.PersonDetails = personDetails; }

    public List<Account> getAcList() { return AcList; }
    public void setAcList(List<Account> acList) {
        this.AcList = (acList == null) ? new ArrayList<>() : acList;
    }

    public static int getCount() { return count; }

    public float totalAmount() {
        float total = 0;
        for (Account account : AcList) total += account.getAmount();
        return total;
    }

    public void withdraw(float amount, String accNo) {
        Account account = findAccount(accNo);
        if (account == null) System.out.println("Account not found for this client.");
        else System.out.println("Remaining balance: " + account.withdraw(amount));
    }

    public void deposit(float amount, String accNo) {
        Account account = findAccount(accNo);
        if (account == null) System.out.println("Account not found for this client.");
        else System.out.println("Current balance: " + account.deposit(amount));
    }

    public void addAccount(Account account) {
        if (account != null && !AcList.contains(account)) {
            AcList.add(account);
            account.setACholder(this);
        }
    }

    private Account findAccount(String accNo) {
        for (Account account : AcList) {
            if (account.getNumber().equals(accNo)) return account;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Client ID: ").append(id).append("\\n");
        result.append(PersonDetails == null ? "No personal details" : PersonDetails).append("\\n");
        result.append("Accounts:\\n");
        if (AcList.isEmpty()) result.append("  No accounts\\n");
        for (Account account : AcList) result.append("  ").append(account).append("\\n");
        result.append("Total balance: ").append(totalAmount());
        return result.toString();
    }
}
