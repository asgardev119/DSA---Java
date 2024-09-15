import java.util.Scanner;

public class inputoutput {

   public static void AirtmeticOperation() {
      System.out.println("Enter a value for a : ");
      try (Scanner sc = new Scanner(System.in)) {
         int a = sc.nextInt();
         System.out.println("Enter a value for b : ");
         int b = sc.nextInt();
         int sum = a + b;
         int mul = a * b;
         int div = a / b;
         int module = a % b;
         int sub = a - b;

         System.out.println("totla Value is : " + sum + ", " + "mul is : " + mul + ", " +
               "div Value is : " + div + ", " + "module Value is : " + module + ", " + "sub Value is : " + sub);
      }
   }

   public static void diff() {
      String name=null;
      int marks;
      try (Scanner data = new Scanner(System.in)) {
         System.out.println("Enter ur marks Please : ");
         marks = data.nextInt();

         if (marks >= 30) {
            data.nextLine();
            System.out.println("Enter ur name Please : ");
            name = data.nextLine();

         } else {
            System.out.println("no need Your Here You Failed in Exam");

         }
      }
      System.out.println(name + " " + "Congralations you passed Exam");

   }

   public static void main(String[] args) {
      // AirtmeticOperation();
     diff();

   }
}
