public class Main{
   public static void main(String[]args){

       Scanner input = new Scanner(System.in);

       System.out.println("Number: ");

       int number = input.nextInt();
       int hour = number/60;

       int minutes = number % 60;
       System.out.println("Time is: " + hour + ":" + minutes);


   }
}