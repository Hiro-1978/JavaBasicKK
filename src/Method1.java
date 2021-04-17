
public class Method1 {
    public static void main(String[] args){
        // การเรียกใช้งาน
        display();
        plus();
        openVideo();
        pauseVideo();
        exitProgram();
    }
    
    // การสร้างเมธอด
    static void display(){
    // กลุ่มคำสั่งที่อยากให้งาน
        System.out.println("Hello World");
    }
    
    static void plus(){
    // คำสั่งบวกเลข    
        int a=10, b=20, c=a+b;
        System.out.println("ผลบวก = "+c);
    }
        
    static void openVideo(){
    // คำสั่งเล่นวิดีโอ    
        System.out.println("เล่น Video");
    }
        
    static void pauseVideo(){
    // คำสั่งหยุดวิดีโอ    
        System.out.println("หยุด Video");
    }
        
    static void exitProgram(){
    // คำสั่งออกจากโปรแกม    
        System.out.println("ออกจากโปรแกรม");
    }
}
