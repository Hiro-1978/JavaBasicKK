
public class Compound {
    public static void main(String[] args){
        int x = 10, y = 5;
        System.out.println("ก่อนคำนวน X = "+x);
        // x=x+y; // ลดรูปได้เป็น x+=y
        // x=x-y; // ลดรูปได้เป็น x-=y
        // x=x/y; // ลดรูปได้เป็น x/=y
        x=x*y; // ลดรูปได้เป็น x*=y        
        System.out.println("หลังคำนวน X = "+x);
    }
}
