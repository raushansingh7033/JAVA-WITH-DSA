import java.util.Scanner;

public class _06_CountGreaterElement {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n=sc.nextInt();
    System.out.println("Enter the element of the array");
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
      System.out.println("Enter the key element");
    int key=sc.nextInt();
    int count=0;
    for(int i=0;i<n;i++){
        if(arr[i]>key){
            count++;
        }
    }
     System.out.println("the count of the greater element is"+count);
   } 
}
