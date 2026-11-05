public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("UET Bank");

        Person person1 = new Person("Omama Tanveer", "35202-1234567-8", "0300-1234567");
        Person person2 = new Person("Ali Ahmed", "35202-7654321-0", "0311-7654321");

        Client client1 = bank.addClient(person1);
        Client client2 = bank.addClient(person2);

        Account account1 = bank.addAccount(client1.getId(), 5000.0f, client1);
        Account account2 = bank.addAccount(client1.getId(), 2500.0f, client1);
        Account account3 = bank.addAccount(client2.getId(), 8000.0f, client2);

        System.out.println("=== Initial Bank Details ===");
        System.out.println(bank);

        System.out.println("\\n=== Deposit and Withdrawal ===");
        client1.deposit(1000.0f, account1.getNumber());
        client1.withdraw(500.0f, account2.getNumber());

        System.out.println("\\n=== Search Account ===");
        Account found = bank.searchAccount(account3.getNumber());
        System.out.println(found == null ? "Account not found" : found);

        System.out.println("\\n=== Search Client by CNIC ===");
        Client searched = bank.searchCustomerDetail("35202-1234567-8");
        System.out.println(searched == null ? "Client not found" : searched);

        System.out.println("\\nBank total: " + bank.totalAmount());
        System.out.println("Client 1 total: " + client1.totalAmount());

        System.out.println("\\n=== Remove Client 2 from Bank ===");
        System.out.println("Removed: " + bank.removeClient(client2.getId()));
        System.out.println(bank);
    }
}
