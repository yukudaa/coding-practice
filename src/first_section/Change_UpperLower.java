package first_section;

import java.util.Locale;
import java.util.Scanner;

public class Change_UpperLower {

    public static String solution(String str){

        String answer = "";

        for(char a : str.toCharArray()){
            if(Character.isUpperCase(a)){
                answer += Character.toLowerCase(a);
            }
            else {
                answer += Character.toUpperCase(a);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Change_UpperLower.solution(str));
    }
}
