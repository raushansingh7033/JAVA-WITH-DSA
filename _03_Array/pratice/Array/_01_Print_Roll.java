

import java.util.Scanner;

public class _01_Print_Roll {
    public static void main(String[] args) {
        int[] arr={81,17,95,36,61,10,60};
        int k=35;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k){
                System.out.println("Roll number is "+i)
                ;
            }
        }
    }
}
