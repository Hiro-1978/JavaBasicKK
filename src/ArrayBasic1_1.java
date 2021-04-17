
public class ArrayBasic1_1 {
    public static void main(String[] args){
        // Array 2 มิติ
        String [][]product = {
            {"เก้าอี้","โต๊ะ","โคมไฟ"},
            {"คีย์บอร์ด","เม้าส์","แป้นพิมพ์"},
            {"ลิปติก","โรลออน","ครีม"}
        };
        // product[เลขแถว][เลขคอลัมน์]
        System.out.println("ก่อนเปลี่ยน = "+product[1][2]);
        // เปลี่ยนสมาชิก
        product[1][2] = "แผ่นรองเม้าส์";
        System.out.println("หลังเปลี่ยน = "+product[1][2]);
        System.out.println("################################");
        // For Loop
        for(int row=0;row<product.length;row++){
            for(int column=0;column<product[row].length;column++){
            System.out.println("แถวที่ = "+row+" คอลัมน์ที่ = "+column+" เก็บค่า ="+product[row][column]);
            }
        }
    }
}
