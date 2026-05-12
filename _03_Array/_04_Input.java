
import java.util.Scanner;

public class _04_Input {
  public static void main(String[] args) {
  //  int[] arr1={10,20,30,40,50};
   Scanner sc=new Scanner(System.in);
   int[] arr=new int[5];
   for(int i=0;i<5;i++){
    arr[i]=sc.nextInt();
   }
   for(int i=0;i<5;i++){
    System.out.print( arr[i]+" ");
   }
   sc.close();
  //   Scanner sc = new Scanner(System.in);
  //   int[] arr = new int[5];
  //   for (int idx = 0; idx < arr.length; idx++) {
  //     int elem = sc.nextInt();
  //     arr[idx] = elem;
  //   }
  //   for (int idx = 0; idx < arr.length; idx++) {
  //     System.out.println(arr[idx]);
  //   }
   }
}
