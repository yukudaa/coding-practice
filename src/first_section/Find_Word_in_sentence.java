package first_section;

import java.util.Scanner;

public class Find_Word_in_sentence {

    public static String solution(String str) {
        String answer = "";

        int max = 0;
        String st[] = str.split(" ");
        for(String a : st) {
            int len = a.length();
            if(len > max) {
                max = len;
                answer = a;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(Find_Word_in_sentence.solution(str));

    }
}
