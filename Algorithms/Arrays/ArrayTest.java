package Algorithms.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 4, 7, 6, 7, 8, 9, 10};

        ArrayALG arrALG = new ArrayALG(arr);


        // reverse arry
        arrALG.reverse();
        int sum = arrALG.sum();
        int max = arrALG.max();
        int min = arrALG.min();
        int countermax = arrALG.numarray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arrALG.getArr()[i] + " ");

        }
        System.out.println(sum); 
        System.out.println(max); 
        System.out.println(min); 
        System.out.println(countermax); 

    }
}
