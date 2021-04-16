
public class String1 {
    /*
    String คือ ชนิดข้อมูลที่เก็บชุดข้อความ
    symbol = ""
    
    char เก็บตัวอักษร
    symbol = ''
    
    char เรียงต่อกัน => String
        
    */
    
    public static void main(String[] args){
        char a = 'A'; // เก็บได้ทีละตัว
        String b = "ABC"; // เก็บได้ทีละหลายๆ ตัว
        System.out.println(a);
        System.out.println(b);
        
        String n1 = "100", n2 = "200";
        int n3;
        // String => int
        n3 = Integer.parseInt(n1);
        n3 = n3+50;
        System.out.println(n3);
        
    } 
}
