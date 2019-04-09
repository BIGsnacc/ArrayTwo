/*1 Get info
    1.1. prompt the user for a real number to assign values of all elements of the array with a user number
        1.1.2. prompt the user for a real number to multiply all of the elements by a user number
        1.1.3. prompt the user for a real number to raise all of the element's values by a user number
  2 Do calculations
    2.1. cast x of type int to type double
    2.2. find a random number between 46 and 1
    2.3. assign a user number to the values of all elements
    2.4. multiply the values of the element by a user number
    2.5. raise all of the values of the elements by a user number
  3 Print results
    3.1. print the array of all 50 real numbers
    3.2. print all of the menu choices
    3.3. print the array of 50 random real numbers between 1 and 46
    3.4. prompt the user for a real number to assign values of all elements of the array with a user number
    3.5. print the array of 50 elements with the value assigned by the user
    3.6. prompt the user for a real number to multiply all of the elements by a user number
    3.7. print the array of 50 elements with values that have been multiplied by a user number
    3.8. prompt the user for a real number to raise all of the element's values by a user number
    3.9. print the array of 50 elements with values that have been raised to a power assigned by the user.



 */
import java.util.Scanner;
public class ArrayTwo {


    public ArrayTwo() {
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declaring the array
        double list[] = new double[50];



    //first for loop to print the array of 50 real numbers
        for (int x=0; x<50; x++){
            list[x] = Double.valueOf(x);
            System.out.println(list[x]);
        }

        //this is the menu
        int menuOption;
        System.out.println("If you would like to make all of the elements values a random number, press 1. If you would like to assign values of all elements of the array with a user number and print all the values on the same line, press 2. ");
        System.out.println("If you would like to multiply all of the elements by a user number, press 3. If you would like to raise all of the element's values by a user number, press 4.");
        menuOption=scanner.nextInt();


        //first menu option loop
        if(menuOption==1) {
            for (int x = 0; x < 50; x++) {
                list[x] = (int) (Math.random() * 46 * 1);
                System.out.println(list[x]);
            }
        }

        //second menu option loop
        if(menuOption==2){

            String arrayString = "";
            double userNumber;
            System.out.println("Please enter a real number");
            userNumber=scanner.nextDouble();


            for (int x = 0; x < 50; x++) {
                list[x] = userNumber;
                arrayString = arrayString + (list[x])+ " ";

            }
            System.out.println(arrayString);
        }

        //third menu option loop
        if(menuOption==3) {

            double userNumber;
            System.out.println("Please enter a real number to multiply all of the element values by");
            userNumber=scanner.nextDouble();


            for (int x = 0; x < 50; x++) {
                list[x] = userNumber * list[x];
                System.out.println(list[x]);
            }
        }

        //fourth menu option loop
        if(menuOption==4) {

            double userNumber;
            System.out.println("Please enter a real number to raise all of the element's values by.");
            userNumber=scanner.nextDouble();

            for (int x = 0; x < 50; x++) {
                list[x] = Math.pow(list[x], userNumber);
                System.out.println(list[x]);
            }
        }


    }
}


