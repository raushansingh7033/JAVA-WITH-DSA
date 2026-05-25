import java.util.Scanner;

public class _06_Count_Greater_Element {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the element");
    int n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the element of the array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the key element");
    int key=sc.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]>key){
      System.out.println("Greater element is "+arr[i]);
      }
    }

   }
}
