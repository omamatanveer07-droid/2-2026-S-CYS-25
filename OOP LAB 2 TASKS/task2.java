public class Main{
   public static void main(String[]args){
       Scanner input= new Scanner(System.in);

       System.out.println("Name : ");
       String name = input.nextLine();

       System.out.println("Age: ");
       int age = input.nextInt();

       System.out.print("Details; " + name + "," + age);


   }
}