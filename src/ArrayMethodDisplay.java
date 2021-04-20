
public class ArrayMethodDisplay {
    public static void main(String[] args){
        // เมธอดแสดงค่าของ Array ที่รับเข้ามา
        int[] numberA={10,20,30,40,50};
            displayArray(numberA);   
            System.out.println("##################");
            
        double[] price={11.2,30.0,25.2,44,4,63.0};
            displayPrice(price);
            System.out.println("##################");
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
        
            // สร้างเมธอดสำหรับแสดงผล Array แบบ Double
        static void displayPrice(double[] arr){
            System.out.print("{");
            for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(",");
           }
            System.out.println("}");
        }
}
