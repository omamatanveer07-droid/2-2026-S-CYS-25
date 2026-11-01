//Lab 2
//Task 1
public class Main{
   public static void main(String[]args){
       System.out.println("omama");
   }
}
//Task 2
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
//Task 3
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
// Task 4
public class Main{
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);

       System.out.println("Minutes: ");
       int minutes = input.nextInt();
       int hour = (minutes / 60) % 12;

       int reminutes = minutes % 60;
       System.out.println("Time is:" + hour + ":" + reminutes);

   }
}
//Task 5
public class Main{
   public static void main(String[]args){
       int[] array = {2,4,5,6,7,8,77,65,12,34,32,45};

       Scanner a = new Scanner(System.in);
       System.out.println("enter the start number: ");

       int s = a.nextInt();
       System.out.println("enter the end number");

       int e = a.nextInt();
       System.out.println("enter the increment : ");
       int I = a.nextInt();
       for(int i = s ; i < e ; i = i +1){
           System.out.println(array[i]);
       }
   }
//}
