import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) throws Exception {
        File file = new File("Practical7.txt");
        FileWriter fileWriter = new FileWriter(file);
        
        for(int i = 0; i < 100; i++) {
            int num = (int)(Math.random() * 1000);
            fileWriter.write(num + " ");
        }

        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String line = br.readLine();

        String[] numbersStr = line.split(" ");
        int[] numbersInt = new int[100];

        for(int i = 0; i < 100; i++) 
            numbersInt[i] = Integer.parseInt(numbersStr[i]);
        
        Arrays.sort(numbersInt);
        for(int i : numbersInt)
            System.out.print(i + " ");

        br.close();
        fileReader.close();
    }
}
