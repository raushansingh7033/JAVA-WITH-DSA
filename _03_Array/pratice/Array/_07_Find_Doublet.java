import java.util.Scanner;

public class _07_Find_Doublet {
    public static void main(String[] args) {
      int num[] = { 5, 2, 7, -1 };
      int x = 9;
      int n=num.length;
      for(int i=0;i<n;i++){
       for(int j=i+1;j<n;j++){
        if(num[i]+num[j]==x){
            System.out.println(i+" "+j);
        }
       }
      }
    }
}
