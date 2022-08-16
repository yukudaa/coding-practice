package first_section;

import java.util.Scanner;

public class Security {

    public static String solution(int num, String str) {
        String answer = "";

        for (int i = 0; i < num; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int n = Integer.parseInt(tmp, 2);
            answer += (char) n;
            str = str.substring(7);
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(Security.solution(num, str));
    }
}
