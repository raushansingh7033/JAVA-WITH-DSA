public class _08_ReverseArray {
   public static void main(String[] args) {
      int num[] = { 5, 2, 7, -1 };
      int i=0;
      int j=num.length-1;
      while(i<j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
        i++;j--;
      }
      for(int k=0;k<num.length;k++){
        System.out.print(num[k]+" ");
      }
   } 
}
