import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        if(args.length < 1) {
            System.out.println("Invalid use");
            return;
        }

        int chars = 0;
        int words = 0;
        int lines = 0;

        FileReader fileReader = new FileReader(new File(args[0]));
        int c;
        while((c = fileReader.read()) != -1) {
            chars++;
            if(c == ' ')
                words++;
            else if(c == '\n')
                lines++;
        }
        fileReader.close();

        System.out.println(chars + " - characters");
        System.out.println(words + " - words");
        System.out.println(lines + " - lines");
    }
}
