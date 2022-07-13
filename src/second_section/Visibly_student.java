package second_section;

import java.util.Scanner;

public class Visibly_student {
    public static int solution(int num, int[] arr) {
        int answer = 1;
        int max = arr[0];

        for (int i = 1; i < num; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Visibly_student.solution(num, arr));
    }
}
