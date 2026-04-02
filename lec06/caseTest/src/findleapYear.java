import java.util.Scanner;

public class findleapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int usr_year = sc.nextInt();
        //판단하기
        if(usr_year%400 == 0){
            System.out.println("true");
        }else if(usr_year%4 == 0){
            if (usr_year%100 == 0){
                System.out.println("false");
            } else{
                System.out.println("true");
            }
        }else{
            System.out.println("false");
        }
    }
}
