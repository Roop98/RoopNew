package ee.sdacademy;

import java.util.ArrayList;
import java.util.Random;

public class Randomgenerator {

    int[] arr = new int[17];
}

class Rand {
    Randomgenerator randomgenerator = new Randomgenerator();

    protected void number() {
        Random random = new Random(20);
        for (int i =0;i<randomgenerator.arr.length;i++){
            randomgenerator.arr[i] = random.nextInt(20);
            System.out.println(randomgenerator.arr[i]);
        }
    }
    protected void randmax(){
        int max = randomgenerator.arr[3];
        for (int i =1;i<randomgenerator.arr.length;i++)
        {
            if (randomgenerator.arr[i]> max){
                max = randomgenerator.arr[i];
                System.out.println(randomgenerator.arr[i]);
            }
        }
    }
}

class print {
    public static void main(String[] args) {
        Rand rand = new Rand();
        rand.number();
        rand.randmax();
    }
}
