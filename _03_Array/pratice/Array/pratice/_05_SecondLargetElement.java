import java.util.Scanner;

public class _05_SecondLargetElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max && arr[i]>secMax){
                secMax=max;
                max=arr[i];
            }else if(arr[i]<max && arr[i]>secMax){
                secMax=arr[i];
            }
        }
        System.out.println("Second max is"+secMax);
    }
}
