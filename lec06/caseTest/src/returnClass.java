import java.util.Scanner;

public class returnClass {
    public static void main(String[] args){
        //입력받기
        Scanner sc = new Scanner(System.in);
        int usr_input = sc.nextInt();
        //구분하자
        if(usr_input < 0){
            System.out.println("Error");
        }if(usr_input >= 0){
            if(usr_input >= 200){
                if(usr_input >= 700){
                    if(usr_input >= 1500) {
                        System.out.println("Diamond");
                    }else{
                        System.out.println("Gold");
                    }
                }else{
                    System.out.println("Silver");
                }
            }else{
                System.out.println("Regular");
            }

        }

    }
}
