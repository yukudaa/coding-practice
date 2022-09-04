package second_section;

import java.util.Scanner;

public class Rock_Scissors_Paper {

    public static String solution(int num, int arr1[], int arr2[]) {
        String answer = "";
        for (int i = 0; i < num; i++) {
            if (arr1[i] == arr2[i]) {
                answer += "D";
            } else if (arr1[i] == 1 && arr2[i] == 3) {
                answer += "A";
            } else if (arr1[i] == 2 && arr2[i] == 1) {
                answer += "A";
            } else if (arr1[i] == 3 && arr2[i] == 2) {
                answer += "A";
            } else
                answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr1[] = new int[num];
        int arr2[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            arr2[i] = sc.nextInt();
        }
        for (char x : Rock_Scissors_Paper.solution(num, arr1, arr2).toCharArray()) {
            System.out.println(x);
        }

    }
}
