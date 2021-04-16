
public class Prepost {
    public static void main(String[] args){
        int a = 5;
        // pre หน้า / post หลัง ทีละ 1
        System.out.println(a);
        System.out.println(++a); // บวกก่อนแล้วค่อยใช้
        System.out.println(a);
        System.out.println("-----------------------");
        a = 5;
        System.out.println(a);
        System.out.println(a++); // ใช้ก่อนแล้วค่อยบวก
        System.out.println(a);
        System.out.println("-----------------------");
        int b = 5;  
        System.out.println(b);
        System.out.println(--b); // ลบก่อนแล้วค่อยใช้
        System.out.println(b);
        System.out.println("-----------------------");
        b = 5; 
        System.out.println(b);
        System.out.println(b--); // ใช้ก่อนแล้วค่อยลบ
        System.out.println(b);
    }
}
