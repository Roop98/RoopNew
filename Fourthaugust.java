package ee.sdacademy;
import java.util.Scanner;
public class Fourthaugust {

    String[] numberinwords = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    //First Solution

    protected boolean printnumberinwords() {
        System.out.println("The numbers from [0-9] are:");

        for (int i = 1; i < numberinwords.length; i++) {
            System.out.println("Number " + i + " is : " + numberinwords[i]);

        }
        return true;
    }

    //Second Solution

    protected boolean regex()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to be converted in words:");
        int num = scan.nextInt();
        for (int i = 0;i<numberinwords.length;i++)
        {
            if (num == i)
            {
                System.out.println(numberinwords[i]);
            }
            else
                return false;
        }
        return true;
    }

  //  protected boolean anothersolution()
    //{
      //  Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a number between [0-9]");
        //int num1 = scan.nextInt();
        //System.out.println(numerals[num1]);
    //}

    public static void main(String[] args) {

        Fourthaugust fourthaugust = new Fourthaugust();
        fourthaugust.printnumberinwords();
        fourthaugust.regex();
    }
}
