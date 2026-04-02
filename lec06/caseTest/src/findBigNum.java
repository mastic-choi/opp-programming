import java.util.Scanner;

public class findBigNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a;

        //새수 비교를 하자.

        if(b >= result){
            result = b;

        }
        if(c >= result){
            result = c;

        }
        System.out.println(result);

    }
}
