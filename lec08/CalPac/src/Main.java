import java.util.Scanner;

class Main{
    public static int calpac(int x){
        if (x == 1){
            return 1;
        }
        else{
            return calpac(x-1) * x;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = calpac(x);
        System.out.println(result);

    }
}