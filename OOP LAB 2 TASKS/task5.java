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