public class ArrayLocationMethods {

    // Find largest element in double array
    public static int[] locateLargest(double[][] arrayParam) {

        int row = 0;
        int col = 0;
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }


    // Find largest element in int array
    public static int[] locateLargest(int[][] arrayParam) {

        int row = 0;
        int col = 0;
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }


    // Find smallest element in double array
    public static int[] locateSmallest(double[][] arrayParam) {

        int row = 0;
        int col = 0;
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }


    // Find smallest element in int array
    public static int[] locateSmallest(int[][] arrayParam) {

        int row = 0;
        int col = 0;
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {

                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        return new int[]{row, col};
    }


    // Test program
    public static void main(String[] args) {

        int[][] intArray = {
                {5, 2, 9},
                {1, 7, 3},
                {4, 6, 8}
        };

        double[][] doubleArray = {
                {3.5, 2.1, 7.8},
                {9.4, 1.2, 6.3},
                {4.9, 5.6, 8.0}
        };


        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);


        System.out.println("Largest int location: row " + largestInt[0] + ", column " + largestInt[1]);
        System.out.println("Smallest int location: row " + smallestInt[0] + ", column " + smallestInt[1]);

        System.out.println("Largest double location: row " + largestDouble[0] + ", column " + largestDouble[1]);
        System.out.println("Smallest double location: row " + smallestDouble[0] + ", column " + smallestDouble[1]);
    }
}