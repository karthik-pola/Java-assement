package Libraries_2.Problem45;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       
        StringBuilder sb = new StringBuilder("");

        String filename = "Problem45.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line.replaceAll("\\s+", " ")).append(System.lineSeparator());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (FileWriter file = new FileWriter("Problem45.txt", false)) {
            file.write(sb.toString());
            file.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}