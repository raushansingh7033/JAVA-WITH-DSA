
public class _01_Print_Roll {
    public static void main(String[] args) {
         int[] marks={81,17,95,36,61,10,60};
         for(int i=0;i<marks.length;i++){
            if(marks[i]<35){
                System.out.println(i);
            }
         }
    }
}
