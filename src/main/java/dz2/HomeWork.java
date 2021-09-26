package dz2;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

        changeArray();
        createArray();
        multiplicationArray();
createDiagonal();



    }
    static void changeArray (){
        int[] arr1 = {0, 0, 1, 1, 0, 1, 1, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) arr1[i] = 1;
            else arr1[i] = 0;
        }
        for (int i : arr1) {
            System.out.println(i);
                    }
        System.out.println();

               }
              public static void  createArray(){
        int[] arr = new int[8];
                   for (int i = 0,j = 0; i < arr.length; i++,j+=3) {
                       arr[i]=j;
                       System.out.println(arr[i]+ "");
                   }
                  System.out.println();
               }
               public static void  multiplicationArray(){
        int[]arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
                   for (int i = 0; i < arr1.length ; i++) {
                       if(arr1[i] <6) arr1[i]*=2;
                       System.out.println(arr1[i]);
                       System.out.println();
                   }
               }
//               public static void  squareArray(int[][] diagonal){
//                   for (int i = 0; i < diagonal.length ; i++) {
//                       diagonal[i][i]= 1;
//                       System.out.println(Arrays.toString();

    static void createDiagonal() {
        int length = 5;

        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if ((i == j) || (i == length - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }}






                       




