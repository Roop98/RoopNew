package ee.sdacademy;
import java.util.Scanner;
public class Today3 {

    String[] word = new String[3];
    public String[] getWord() {
        return word;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    protected void scanarray()
    {
        Scanner scan = new Scanner(System.in);
        for (int i =0;i<word.length;i++)
        {
            System.out.println("Enter word " + i + " : " );
            word[i] = scan.next();
        }
    }

    protected void printarrayleft()
    {
        System.out.println("Words aligned left of the page:");
        for (int i = 0;i<word.length;i++)
            System.out.println(word[i]);
    }

    protected void printarrayright() {
        System.out.println("Words aligned right of the page:");
        for (int i = 0; i < word.length; i++) {

                System.out.println("              " + word[i]);
            }
        }
    }


