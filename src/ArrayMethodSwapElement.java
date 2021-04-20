
public class ArrayMethodSwapElement {
    public static void main(String[] args){
        // เมธอดแสดงค่าของ Array ที่รับเข้ามา
        int[] numberA={10,20,30};
            System.out.print("ก่อนเปลี่ยนตำแหน่ง Array = ");
            displayArray(numberA);
            
            swapElement(numberA,0,2);
            System.out.print("หลังเปลี่ยนตำแหน่ง Array = ");
            displayArray(numberA);
    }
    
        // สร้างเมธอดสำหรับแสดงผล Array แบบ Integer
        static void displayArray(int[] arr){
            System.out.print("{");
            for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(",");
           }
            System.out.println("}");
        }
        
        // สร้างเมธอดย้ายค่าใน Array
        
        static void swapElement(int[] a,int b,int c){
            int temp = a[b];
            a[b] = a[c];
            a[c] = temp;
        }
        
}
