// here is the formation of class occour
//task 1
class hello {
    void O() {
        System.out.println("omama tanveer");
    }

    void name() {

        System.out.println("name = omama");
    }

    void regnumber() {
        System.out.println(25);
    }

    void age() {
        System.out.println(17);

    }
}

class Friends {
    private void omama() {
        System.out.println("omama");
    }

    void nazish() {
        System.out.println("nazish");

    }

    void zuryat() {
        System.out.println("zuryat");
    }

}
//Task 2
public class Main{
    public static void main(String[]args){

            Friends f = new Friends();
//            f.omama();
            f.nazish();
            f.zuryat();

        }
    }

//    //public class Main{
//    public static void main(String[]args){
//        hello h = new hello();
//
//        h.O();
//        }
//
//    }
//pillers of oop
// encapsulation
// abstraction
//polymorphosm and inheritance
//task 3
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