import java.util.Scanner;
class Main {

    public static void main(String[] args) {

        // 표준 입력(stdin)을 받습니다.
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int plus = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;

        int result = plus + minus + multiply;

        // 값을 표준 출력(stdout)으로 출력합니다.
        System.out.println(result);
    }

}