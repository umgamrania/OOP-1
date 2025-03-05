import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Invalid use");
            return;
        }

        String target = args[0];
        String filename = args[1];

        try {
            FileReader fileReader = new FileReader(new File(filename));
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            StringBuilder builder = new StringBuilder();

            while((line = br.readLine()) != null) {
                line = line.replaceAll(target, "");
                builder.append(line + "\n");
            }

            br.close();
            fileReader.close();

            FileWriter fileWriter = new FileWriter(new File(filename));
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(builder.toString());
            bw.close();
            
        } catch(FileNotFoundException e) {
            System.out.println("File not found!");
        } catch(IOException e) {
            System.out.println("IO Exception while handling file: " + e);
        }
    }
}