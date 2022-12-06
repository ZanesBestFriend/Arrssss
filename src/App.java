import java.util.Scanner;

public class App {

    //String array method
    public static String[] printArray(String[] array){
        for(int i = 0; i <array.length; i++){
            //array[i] = array[i].toUpperCase();
            System.out.println(array[i]);
        }
        return array;
    }

    //Integer array method(1D)
    public static int[] printArray(int[] array){
        for(int i = 0; i <array.length; i++){
            //array[i] = array[i].toUpperCase();
            System.out.println(array[i]);
        }
        return array;
    }

    //Integer array method (2D)
    public static int[][] printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.println(array[i][j]);
            }
        }
        return array;
    }
    //String array method (2D)
    public static String[][] printArray(String[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j].toUpperCase());
            }
            System.out.println();
        }
        return array;
    }

    public static void main(String[] args) throws Exception {

        //Arrays
        //Can't change length
        //Create empty array: 
            // int a[] = new int[length];

        //integer array
        // int a[] = {1,2,3,4};

        // System.out.println(a[0]);

        //String array (1D)
        // String coolPeeps[] = {"BUkey!", "Wu", "ZANE", "GUlanbenjamin", "chuck", "potato"};

        // printArray(coolPeeps);

        // Scanner in = new Scanner(System.in);
        // String s = in.nextLine();
        // String a[] = s.split(",");

        // int intArray[] = new int[a.length];

        // for(int i = 0; i < intArray.length; i++){
        //     intArray[i] = Integer.parseInt(a[i]);
        // }
        // printArray(intArray);
        
        // String stringArray[] = new String[5];

        // printArray(intArray);
        // printArray(stringArray);
        // printArray(a);

        // for(int i = 0; i <coolPeeps.length; i++){
        //     coolPeeps[i] = coolPeeps[i].toUpperCase();
        //     System.out.println(coolPeeps[i]);
        // }

        

        // System.out.println(b[0]);
        // b[0] = "Lek";
        // System.out.println(b[0]);

        //2D Arrays
            //int a[][] = {
                //row 0: {1,2,3}
                //row 1: {4,5,6}
        //}
        //1 = a[0][0] 2 = a[0][1] 3 = a[0][2]

        int a[][] = {{1,2,3},{4,5,6}};

        System.out.println(a[1][2]);

        
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] *= a[i][j];
            }
        }
        printArray(a);

        String employees[][] = {{"William ", "Brady ", "Hand ", "$40K"},
                                {"Kimory ", "Stanley ", "Janitor ", "$200k"}};
        printArray(employees);



    }
}
