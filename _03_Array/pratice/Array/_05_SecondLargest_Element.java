import java.util.Scanner;

public class _05_SecondLargest_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max && arr[i]>secMax){
              secMax=max;
              max=arr[i];
            }else if(arr[i]>secMax && arr[i]<max){
                secMax=arr[i];
            }
        }
        System.out.println("Second Largest element is "+secMax);
    }
}
