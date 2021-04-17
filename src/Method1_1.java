
public class Method1_1 {
    public static void main(String[] args){
        // เมธอดรับค่าข้อมูล
        display("XYZ");
        fullName("Paisan","Pompadech");
        plus(5,6,8);
    }
    
    // การสร้างเมธอด
    static void display(String message){
    // กลุ่มคำสั่งที่อยากให้งาน
        System.out.println("Hello World "+message);
    }
    
    static void fullName(String firstName,String lastName){
    // กลุ่มคำสั่งที่อยากให้งาน
        System.out.println("Hello "+firstName+" "+lastName);
    }
    static void plus(int a,int b,int c){
    // คำสั่งบวกเลข    
        int e=a+b-c;
        System.out.println("ผลลัพธ์ = "+e);
    }

}
