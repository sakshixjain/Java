import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!\n");

            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.print("i = " );
            String name= "sakshi and Jain";
        System.out.println(name.substring(3,6));


        // ARRAY

        int[] arr= new int[4];
        arr[0]=34;
        arr[1]=22;
        arr[2]=12;
        arr[3]=78;

        System.out.println(arr[2]);

        //length
        System.out.println(arr.length);

        //to sort the arr
        System.out.println(arr[0]);
        Arrays.sort(arr);
        System.out.println(arr[0]);


        int[] mark= {34,98,67,56,12,33};

        int[][] finalMarks = {{97,98,99}, {34,78,96}};
        System.out.println(finalMarks[0][2]);


        //CASTING

//        types of casting
//                1. explicit
//            2. implicit

        double price= 100.00;
        double finalPrice= price+ 23;  // implicit casting

        System.out.println(finalPrice);

        int p = 455;
        int fp = p+ (int)19.89;     // explicit casting

        System.out.println(fp);



        // CONSTANTS

        int age= 30;
        age= 32;
        age=44;

        //constant value
      final  float PI= 3.14F;
      



    }
}