public class Account {
    private String number;
    private float amount;
    private Client ACholder;
    private static int count = 0;

    public Account() {
        this(0.0f, null);
    }

    public Account(float amount, Client holder) {
        this.number = String.format("A%04d", ++count);
        this.amount = Math.max(0.0f, amount);
        this.ACholder = holder;
    }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public float getAmount() { return amount; }
    public void setAmount(float amount) {
        if (amount >= 0) this.amount = amount;
    }

    public Client getACholder() { return ACholder; }
    public void setACholder(Client ACholder) { this.ACholder = ACholder; }

    public static int getCount() { return count; }

    public float withdraw(float amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > this.amount) {
            System.out.println("Insufficient balance.");
        } else {
            this.amount -= amount;
        }
        return this.amount;
    }

    public float deposit(float amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            this.amount += amount;
        }
        return this.amount;
    }

    @Override
    public String toString() {
        String holderName = (ACholder == null || ACholder.getPersonDetails() == null)
                ? "No holder" : ACholder.getPersonDetails().getName();
        return "Account No: " + number + ", Balance: " + amount
                + ", Account Holder: " + holderName;
    }
}
