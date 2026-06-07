import java.util.Scanner;

public class _21_Count_Maximum_TImes_Present_Character {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] freq = new int[26];


        for (int i = 0; i < n; i++) {
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                freq[ch - 'a']++;
            }
        }

        int max = 0;
        char ans = 'a';

        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = (char)(i + 'a');
            }
        }

        System.out.println(ans);
    }
}
