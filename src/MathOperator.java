
import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args){
        // int a = 15, b = 5;
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("ใส่จำนวนที่ 1 : " );
        a = sc.nextInt();
 
        System.out.print("ใส่จำนวนที่ 2 : " );
        b = sc.nextInt();

        System.out.println("ผลบวก = "+(a+b));
        System.out.println("ผลลบ = "+(a-b));
        System.out.println("ผลคูณ = "+(a*b));
        System.out.println("ผลหาร = "+(a/b));
        System.out.println("เศษ = "+(a%b));
    }
}
