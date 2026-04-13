import java.util.Scanner;

public class Main{
    public static int[] makeArray(int size){
        int[] tmp = new int[size];
        return tmp;

    }
    public static void fillArray(int[] list, int a){
        for (int i = 0; i < list.length; i++){
            list[i] = a;
        }
    }
    public static void printArray(int[] list){
        System.out.println("Start Printing List");
        for (int i : list){
            System.out.printf("%d ", i);
        }
        System.out.println("\n");

    }
    public static void doubleArray(int[] mylist){
        for (int i = 0; i < mylist.length; i++){
            mylist[i] *= 2;
        }
    }
    public static double sumArray(int[] mylist){
        double result = 0;
        for (int k: mylist){
            result += k;
        }
        return result;
    }
    public static void modifyElement(int[] list, int x){
        list[x] = 0;
    }

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int [] mylist;
        int numberArray;
        do {
            System.out.println("Enter a positive interger :");
            numberArray = myScanner.nextInt();

        }while(numberArray <= 0);
        mylist = makeArray(numberArray);
        //filling number
        int mydata = 7;
        fillArray(mylist, mydata);
        printArray(mylist);
        doubleArray(mylist);
        double sumofArray = sumArray(mylist);
        System.out.printf("\n%f \n", sumofArray);
        printArray(mylist);
        modifyElement(mylist, 1);
        printArray(mylist);

        int[][] myGrid;
        myGrid = new int[5][];

        for(int i = 0; i < myGrid.length; i++)
        {
            myGrid[i] = makeArray(i+5);
            fillArray(myGrid[i], i);
            for (int j = 0; j < myGrid[i].length; j++){
                System.out.print(myGrid[i][j]);
            }
            System.out.println();
        }
    }



}