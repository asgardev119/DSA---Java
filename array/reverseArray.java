// package array;
import java.util.*;

@SuppressWarnings("unused")
public class reverseArray {

    public static void rev(int arr[] , int n ){
        int l = 0; int r = n-1;
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = arr[temp];
            l++;
            r--;
        }
    }

 public static void main(String[] args){
    int arr [] = {2,1,3,2,4};
    int s = arr.length;
    rev(arr,s);
    for(int i = 0; i<s;i++){
        System.out.println(arr[i]);
    }

 }


}
