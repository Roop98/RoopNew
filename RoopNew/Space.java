package ee.sdacademy;

public class Space {

    public static void main(String[] args) {

        int blocksize = 16;
        char padcharacter = '0';
        String[] words = {"String1", "String2", "String00003"};

        for (String value : words) {
            StringBuilder builder = new StringBuilder(value);

            while (builder.length() < blocksize)
                builder.insert(0, padcharacter);

            System.out.println(builder.toString());
        }
    }
}
