import java.util.Scanner;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int findingIndex, lenOfArray, elementsOfArray;
        findingIndex = myScanner.nextInt();
        lenOfArray = myScanner.nextInt();
        int result = -1;
        for (int i = 0; i < lenOfArray; i++){
            int elements = myScanner.nextInt();
            if (elements == findingIndex){
                result = i;
                break;
            }
        }//입력 받기 끝
        System.out.println(result);


    }
}