package first_section;

import java.util.ArrayList;
import java.util.Scanner;

public class Flip_over_Word {

    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
/*        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }             StringBuilder 사용 방법  */

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while (rt > lt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str[] = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.next();
        }
        for (String x : Flip_over_Word.solution(num, str))
            System.out.println(x);
    }
}

