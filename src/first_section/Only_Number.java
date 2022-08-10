package first_section;

import java.util.Scanner;

public class Only_Number {

    public static int solution (String str) {
        String answer = "";
        for(char x : str.toCharArray()){
//            if (x>= 48 && x<= 57){
//                answer = answer *10 + (x -48);
//            }
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Only_Number.solution(str));
    }
}
