
import java.util.Scanner;


public class Method1_3 {
    // เมธอดรับและรีเทิร์นค่า
    public static void main(String[] args){
        // โปรแกรมหลัก
        int result=minNumber(5,-10);
        int n1=sum(8,6);
        System.out.println("ค่าที่น้อยที่สุดคือ = "+result);
        System.out.println("ผลรวมคือ = "+n1);
    }
    
    // เปรียบเทียบตัวเลข 2 ตัว
      
    static int maxNumber(int a,int b){
        // การประมวลผล
        if(a==b){
            return a;
        }else if(a>b){
            return a;
        }else{
            return b;
        }
    }
    
    static int minNumber(int a,int b){
        // การประมวลผล
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
    
    static int sum(int x,int y){
        int total=x+y;
        return total;
    }
}
