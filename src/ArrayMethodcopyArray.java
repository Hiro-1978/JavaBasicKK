
public class ArrayMethodcopyArray {
    public static void main(String[] args){
        // เมธอดแสดงค่าของ Array ที่รับเข้ามา
        int[] numberA={10,20,30};
        int[] numberB=copyArray(numberA);
        
        displayArray(numberA);
        displayArray(numberB);
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
        
        static int[] copyArray(int[] a){
            int[] newArr = new int[a.length];
            for(int i=0;i<a.length;i++){
                newArr[i] = a[i];
           }
            return newArr;
    }    
}
