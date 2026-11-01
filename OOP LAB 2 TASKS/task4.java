public class Main{
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);

       System.out.println("Minutes: ");
       int minutes = input.nextInt();
       int hour = (minutes / 60) % 12;

       int reminutes = minutes % 60;
       System.out.println("Time is:" + hour + ":" + reminutes);

   }