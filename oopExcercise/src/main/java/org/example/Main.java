package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends operation {
    public static void main(String[] args) {

        //create public instance from operation class
        operation op = new operation();

        //ask for adding (integer numbers or double numbers)
        System.out.println("for adding integer numbers press 1 for adding double numbers press 2");

        //get choise from user
        Scanner scanner = new Scanner(System.in);
        int mychoise = scanner.nextInt();

        //in case get integer numbers from user
        if (mychoise == 1) {
            //ask to  add two number or three num
            System.out.println("if you want to add two integer number press 2,if u want to add three integers number press 3");
            Scanner scanner_2 = new Scanner(System.in);
            int my_no_int_choise = scanner_2.nextInt();
            if (my_no_int_choise == 2) {

                //ask to enter first number
                System.out.println("Enter your first number");
                Scanner scanner1 = new Scanner(System.in);
                // int fnumber= scanner1.nextInt();
                op.setFirstnumber(scanner1.nextInt());

                //ask to enter second number
                System.out.println("Enter your second number");
                Scanner scanner2 = new Scanner(System.in);
                op.setSecondnumber(scanner2.nextInt());

                int result = op.add_operation(op.getFirstnumber(), op.getSecondnumber());
                System.out.println("the result is :" + result);
            }
            if (my_no_int_choise == 3) {
                //ask to enter first number
                System.out.println("enter first number");
                Scanner scanner_no1 = new Scanner(System.in);
                op.setFirstnumber(scanner_no1.nextInt());

                //ask to enter second number
                System.out.println("Enter your second number");
                Scanner scanner_no2 = new Scanner(System.in);
                op.setSecondnumber(scanner_no2.nextInt());

                //ask to enter third number
                System.out.println("Enter your third number");
                Scanner scanner_no3 = new Scanner(System.in);
                op.setThirdnumber(scanner_no3.nextInt());

                int result = op.add_operation(op.getFirstnumber(), op.getSecondnumber(), op.getThirdnumber());
                System.out.println("the result is :" + result);
            }
        }

        //in case get double numbers from user
        if (mychoise == 2) {
            System.out.println("if you want to add two double numbers press 2,if u want to add three doubles number press 3");
            //get answer from user
            Scanner my_no_double_choise = new Scanner(System.in);
            int my_double_choise = my_no_double_choise.nextInt();
            if (my_double_choise == 2) {
                //ask to enter first number
                System.out.println("enter your first double number");
                Scanner scanner1 = new Scanner(System.in);
                op.setFirstnumber_dble(scanner1.nextDouble());

                //ask to enter second number
                System.out.println("enter your second double number");
                Scanner scanner2 = new Scanner(System.in);
                op.setSecondnumber_dble(scanner2.nextDouble());


                double doubleResult = op.add_operation(op.getFirstnumber_dble(), op.getSecondnumber_dble());
                System.out.println("the result is:" + doubleResult);
            }
            if (my_double_choise == 3)


            {
                //ask to enter first number
                System.out.println("enter your first double number");
                Scanner scanner1 = new Scanner(System.in);
                op.setFirstnumber_dble(scanner1.nextDouble());

                //ask to enter second number
                System.out.println("enter your second double number");
                Scanner scanner2 = new Scanner(System.in);
                op.setSecondnumber_dble(scanner2.nextDouble());

                //ask to enter third number
                System.out.println("enter your third double number");
                Scanner scanner3 = new Scanner(System.in);
                op.setThirdnumber_dble(scanner2.nextDouble());
                double doubleResult = op.add_operation(op.getFirstnumber_dble(), op.getSecondnumber_dble(),op.getThirdnumber_dble());
                System.out.println("the result is:" + doubleResult);
            }


        }

    }
}
