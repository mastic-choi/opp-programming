import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class findSecNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //list 선언하기
        ArrayList<Integer> myArray = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            //입력받기
            int j = sc.nextInt();
            myArray.add(j);
        }
        myArray.sort(Comparator.naturalOrder());
        System.out.println(myArray.get(1));

    }
}
