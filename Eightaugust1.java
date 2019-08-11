package ee.sdacademy;


import java.util.Random;

public class Eightaugust1 {

    public static void main(String[] args) {

        int times = 5;
        int itemssize = 20;

        for (int i = 0; i < times; i++) {
            String[] items = generator(itemssize);

            for (int j=0;j<items.length;j++)
            {
                System.out.println(items[j] + " - " + items[j].length() + ", ");
            }
            System.out.println("");

            String longest = findlongest(items);
            System.out.println(longest + " - " + longest.length());
        }
    }
    public static String[] generator(int size)
    {
        String charactersource = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String[] items = new String[size];
        Random random = new Random();

        for (int i =0;i<size;i++)
        {
            StringBuilder sb = new StringBuilder();
            int stringsize = random.nextInt(charactersource.length());

        for (int j = 0; j<stringsize;j++) {
            int generatedindex = random.nextInt(charactersource.length());
            char letter = charactersource.charAt(generatedindex);
            sb.append(letter);
        }
        items[i] = sb.toString();
        }
        return items;
    }
    public static String findlongest(String[] items)
    {
        String longest = items[1];
        for (int i =0;i<items.length;i++)
        {
            if (items[i].length() > longest.length())
            {
                longest = items[i];
            }
        }
        return longest;
    }
}
