package Libraries_2.Problem48;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main{
    public static void main(String[] args) {
        
        List<String> customers = new ArrayList<>();

        Pattern pattern = Pattern.compile("([A-Za-z ]+),\\s*(\\d{10})");

        try (BufferedReader br = new BufferedReader(new FileReader("customers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    customers.add(matcher.group(1) + ", " + matcher.group(2));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        customers.sort(Comparator.naturalOrder());
        
        System.out.println("Sorted Customers by Name:");
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}