import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("World.csv"));
            while ((line = br.readLine()) != null){
               display(parseCSVline(line));
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static List<String> parseCSVline(String csvLine){
        List<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            Collections.addAll(result, splitData);
        }
        return result;
    }

    private static void display(List<String> list){
        System.out.println("Country: " + list.get(5) );
    }
}
