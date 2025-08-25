class Demo{
  static int factorial(int n){
    if(n==0)
    return 1;
    else return n*factorial(n);

  }
}



public class _Factorial {
  public static void main(String args[]){
         System.out.println(  Demo.factorial(5));
  }
  
}
