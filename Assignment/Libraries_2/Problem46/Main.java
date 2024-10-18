package Libraries_2.Problem46;

import java.io.*;
import java.util.regex.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        String regex = "\\w+\\d+";
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<>();
        while(true){
            System.out.println("Enter strings :");
            String s = sc.nextLine();
            Pattern pattern = Pattern.compile(regex);
            if(s.equalsIgnoreCase("end")){
                break;
            }
            
            Matcher matcher =pattern.matcher(s);
            
            if(matcher.matches()){
                a.add(s);
            }else{
                System.out.println("Not matched try again");
            }
        }
        System.out.println(a);
        
    }
}