
public class ArrayBasic {
    public static void main(String[] args){
        // การสร้าง Array
        /*
            แบบกำหนดขนาดเอาไว้
            int []number=new int[10];
            // กำหนดค่าลงไปใน Array
            number[0] = 10;
            number[1] = 20;
            number[2] = 30;
            number[3] = 40;
            number[4] = 50;
        */
        
        // แบบกำหนดสมาชิก
        int []number={10,20,30,40,50,70};
        System.out.println("ก่อนเปลี่ยนตำแหน่งที่ 5 = "+number[5]);
        number[5] = 100; // เปลี่ยนค่าในตำแหน่งที่ 5
        System.out.println("หลังเปลี่ยนตำแหน่งที่ 5 = "+number[5]);
    }
}
