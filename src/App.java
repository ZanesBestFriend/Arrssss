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

    //Integer array method
    public static int[] printArray(int[] array){
        for(int i = 0; i <array.length; i++){
            //array[i] = array[i].toUpperCase();
            System.out.println(array[i]);
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

        //String array
        String coolPeeps[] = {"BUkey!", "Wu", "ZANE", "GUlanbenjamin", "chuck", "potato"};

        // printArray(coolPeeps);

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String a[] = s.split(",");

        int intArray[] = new int[a.length];

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = Integer.parseInt(a[i]);
        }
        printArray(intArray);
        
        // String stringArray[] = new String[5];

        printArray(intArray);
        // printArray(stringArray);
        // printArray(a);

        // for(int i = 0; i <coolPeeps.length; i++){
        //     coolPeeps[i] = coolPeeps[i].toUpperCase();
        //     System.out.println(coolPeeps[i]);
        // }

        

        // System.out.println(b[0]);
        // b[0] = "Lek";
        // System.out.println(b[0]);




    }
}
