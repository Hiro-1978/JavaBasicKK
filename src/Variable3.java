
public class Variable3 {
    public static void main(String[] args){
        // Global & Local Variable
        int a = 100; // แบบ Global Variable
        int b = 200;
        System.out.println(a);
        
        {
            int c = 300; // แบบ Local Variable มีขอบเขตแค่ใน {} เท่านั้น
            System.out.println("A = "+a);
            System.out.println(c);
        }
        
        System.out.println(b);
        // ค่า Max-Min Data Type
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
    }
}
