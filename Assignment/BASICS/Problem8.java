import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the elements");
        int a[] = new int[5];
        for(int i=0;i<5;i++){    
            a[i] = sc.nextInt();
        }

        for(int i=4; i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
