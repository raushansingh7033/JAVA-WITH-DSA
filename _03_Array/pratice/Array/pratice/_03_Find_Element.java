import java.util.Scanner;

public class _03_Find_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter the key of the element");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the key");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Key is found");
            }
        }
        
        
       }
}
