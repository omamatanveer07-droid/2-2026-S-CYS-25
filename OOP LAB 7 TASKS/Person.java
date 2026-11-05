public class Person {
    private String name;
    private String CNIC;
    private String phoneNo;

    public Person() {
        this("", "", "");
    }

    public Person(String name, String CNIC, String phoneNo) {
        this.name = name;
        this.CNIC = CNIC;
        this.phoneNo = phoneNo;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCNIC() { return CNIC; }
    public void setCNIC(String CNIC) { this.CNIC = CNIC; }

    public String getPhoneNo() { return phoneNo; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }

    @Override
    public String toString() {
        return "Name: " + name + ", CNIC: " + CNIC + ", Phone: " + phoneNo;
    }
}
