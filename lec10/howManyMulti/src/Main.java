import java.util.Scanner;


class Main{
    public static int checkNum(int n_, int m_, int k_){
        int result = 0;
        for (int i = n_; i <= m_; i ++){
            if (i% k_ == 0){
                result += 1;
            }
        }
        return result;
    }


    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n, m, k;
        n = myScanner.nextInt();
        m = myScanner.nextInt();
        k = myScanner.nextInt();
        System.out.printf("%d", checkNum(n, m, k) );


    }
}