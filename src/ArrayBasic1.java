
public class ArrayBasic1 {
    public static void main(String[] args){
        int []number={10,20,30,40,50};
        int size=number.length; // ขนาดของสมาชิก
        for(int i=0;i<number.length;i++){
            // การเข้าถึงสมาชิกด้วย forloop
            System.out.println("ตำแหน่งที่ "+i+" = "+number[i]);
        }
        // การเข้าถึงสมาชิกแบบ For Each
        int sum=0;
        for(int item : number){
            sum+=item;
        }
        System.out.println("ผลรวม = "+sum);
        //
        boolean []status={true,false,true,false};
        String []fruits={"มะละกอ","มะม่วง","แตงโม"};
        System.out.println(fruits[2]);        
    }
}
