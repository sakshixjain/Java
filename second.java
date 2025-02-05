import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

          //OPERATORS

        int a=1;
        int b=2;
        int c= 3;
        int sum= a+b;
        int diff= a-b;

        System.out.println(sum);


        //MAths

        System.out.println(Math.min(4,2));
        System.out.println(Math.max(4,2));


        //get random value
        System.out.println((Math.random()*100));
        System.out.println((int)(Math.random()*10));


        // how to take input

        Scanner sc= new Scanner (System.in);
//        System.out.println("Input your age : ");
        System.out.println("Input your name : ");
//        String name= sc.next();  //for word
        String names = sc.nextLine();  // for line
        System.out.println(names);


        int age= sc.nextInt();
//        float age= sc.nextFloat();
//        double age= sc.nextDouble();


        System.out.println(age);
    }
}