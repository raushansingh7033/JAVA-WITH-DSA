import java.util.Scanner;

public class _03_Search_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Search Element");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                 System.out.println("Element is present in the array");
            }
        }
          
    }
}
