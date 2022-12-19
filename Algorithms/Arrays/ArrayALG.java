package Algorithms.Arrays;

public class ArrayALG{

    private int arr[];

    public ArrayALG() {
        
        System.out.println("ArrayALG is init..");
    }



    public ArrayALG(int[] arr) {
        this.arr = arr;
        System.out.println("ArrayALG is init..");
    }

    // gettes & settes

    public int[] getArr() {
        return arr;
    }

    public void reverse() {
        int[] B = new int[this.arr.length];
        for (int i = this.arr.length -1; i >= 0; i--){
            B[this.arr.length -1 - i] = this.arr[i];
        }
        this.arr = B;
    }

    public int sum() {
        int total = 0;
        
        for (int num : this.arr) {
          total += num;
        }
        
        return total;
      }
    

    public int max() {
        int max = arr[0];
        for (int i = 0; i >= arr.length; i++){
            if(arr[0] < arr[i]) {
                return arr[i];
            }
            else {
                return arr[0];

            }
    }
        return max;
}

public int min() {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++){
        if(min > arr[i]) {
            min = arr[i];
        }
    }
    return min;
}

 // The numarray() method counts the number of times a certain element is in the array
public  int numarray() {
    int countermax = 0; //modifying a integer of a counter maximum
    for (int i = 0; i < arr.length; i++){  // making a "for" loop for checking the array
        int count = 0; // modifying a integer of a counter 
        for (int j = 0; j < arr.length; j++) { // making a secondry "for" loop for counting the number of times an element is shown in the array
        if(arr[i] == arr[j]) { // an "if" command to level up the count
           count++;
    }
    if(count > countermax) { // a secondary "if" command to put a limit to the count (won't be above the elements in the array)
        countermax = count;
    }
}
}
    return countermax;
}
}

 

