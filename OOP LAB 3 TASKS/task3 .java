class  personalinformation{
    private String name;
    private int age = 17;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "omama";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 17;
    }

    long CNIC;

}
class encapsulation{
    public static void main(String[]args){

        personalinformation pf = new personalinformation();
//        pf.setName ( "omama");
//        pf.setAge(17);
//        pf.CNIC = 33205063244184L;

//        System.out.println("name");
//
//        System.out.println("age ");
//
//        System.out.println("CNIC");
//
//        for getting we use the get

        System.out.println(pf.getName());
        System.out.println(pf.getAge());
        System.out.println("CNIC");

    }

}