package second_section;

import java.util.ArrayList;
import java.util.Scanner;

public class Return_Big_number {

    public static ArrayList<Integer> solution (int num1,int num2[]){
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(num2[0]);

        for(int i = 1; i < num1; i++) {
            if(num2[i]> num2[i-1]){
                answer.add(num2[i]);
            }
        }


        return answer;

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2[] = new int[num1];
        for(int i = 0; i < num1 ; i++) {
            num2[i] = sc.nextInt();
        }
        for(int s : Return_Big_number.solution(num1,num2)){
            System.out.print(s + " ");
        }

    }
}
