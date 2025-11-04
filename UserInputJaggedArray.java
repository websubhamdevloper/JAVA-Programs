package Arrays;

import java.util.Scanner;

public class UserInputJaggedArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sub-arrays for a Jagged Array: ");
        int rows = scanner.nextInt();

        int[][] jaggedArray = new int[rows][];

        for(int i = 0; i < jaggedArray.length; i++){
            System.out.println("Enter the size of the sub-arrays " + (i + 1) + " : ");
            int sizeOfsubArray = scanner.nextInt();
            jaggedArray[i] = new int[sizeOfsubArray];
        }

        for (int i = 0; i < jaggedArray.length; i++){
            System.out.println("Enter the elements of the sub-array" + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++){
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < jaggedArray.length; i++){
            for (int j = 0; j < jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
