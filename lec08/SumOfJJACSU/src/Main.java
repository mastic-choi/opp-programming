import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        for(int i = 1 ; i <= n; i ++){
            if(n%i == 0){
                result += i;
            }
        }
        System.out.println(result);
    }
}