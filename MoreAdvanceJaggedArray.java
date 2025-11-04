package Arrays;

public class MoreAdvanceJaggedArray {
    public static void main(String[] args){
        int rows = 5;

        int[][] array = new int[rows][];

        for (int i = 0; i < array.length; i++){
            array[i] = new int[i + 1];
        }

        int count = 1;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = count++;
            }
        }

        System.out.println("Contents of 2-D jagged array");

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
