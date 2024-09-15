// package array;
// import java.util.Scanner;

class HelloWorld {
   public static void main(String[] args) {
      int arr[] = { 2, 3, 4, 5 };

      int n = arr.length;
      int insarr[] = new int[n + 1];
      int add = 20;
      int po = 1;
      for (int i = 0; i < arr.length; i++) {
         insarr[i] = arr[i];
         insarr[po] = add;
         insarr[n] = i;

      }

      for (int i = 0; i < insarr.length; i++) {
         System.out.println(insarr[i]);
      }

   }
}