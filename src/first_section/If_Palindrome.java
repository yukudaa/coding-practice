package first_section;

import java.util.Scanner;

public class If_Palindrome {

    public static String solution(String str) {
//        String answer = "YES";
//        str = str.toUpperCase();
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                return "NO";
//            }
//        }
//        return answer;
//    }

        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {  // 대소문자 무시
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(If_Palindrome.solution(str));

    }


}
