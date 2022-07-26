package first_section;

import java.util.Scanner;

public class Remove_Duplicate_ch {

    public static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) { // indexof -> 앞에서부터 처음 발견되는 인덱스 반환
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Remove_Duplicate_ch.solution(str));
    }
}
