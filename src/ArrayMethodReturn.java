
public class ArrayMethodReturn {
    public static void main(String[] args){
        // เมธอดแสดงค่าของ Array ที่รับเข้ามา
        int[] numberA={10,20,30,40,50};
            System.out.println("ค่าสูงสุดของ Array A คือ : "+(findMaxInArray(numberA))
                    +" อยู่ที่ตำแหน่งที่ : "+(findMaxIndex(numberA)));   
            System.out.println("ค่าต่ำสุดของ Array A คือ : "+(findMinInArray(numberA))
                    +" อยู่ที่ตำแหน่งที่ : "+(findMinIndex(numberA)));
            System.out.println("##################");
            
        int[] numberB={11,-30,25,44,-63};
            findMaxInArray(numberB);
            System.out.println("ค่าสูงสุดของ Array B คือ : "+(findMaxInArray(numberB))
                    +" อยู่ที่ตำแหน่งที่ : "+(findMaxIndex(numberB)));   
            System.out.println("ค่าต่ำสุดของ Array B คือ : "+(findMinInArray(numberB))
                    +" อยู่ที่ตำแหน่งที่ : "+(findMinIndex(numberB)));   
            System.out.println("##################");
            
        System.out.println("ผลของการเปรียบเทียบค่าของ Array = "+compareArray(numberA,numberB));    
    }
    
            // สร้างเมธอดสำหรับแสดงผล Array แบบ Integer
        static void displayArray(int[] arr){
            for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);}
        }
        
            // สร้างเมธอดสำหรับคืนค่า Array
        static int findMaxInArray(int[] arr){
            int maxValue=arr[0]; // เก็บค่าเริ่มต้นเป็นค่าสูงสุดก่อน
            for(int i=0;i<arr.length;i++){
                if(arr[i]>maxValue){
                    maxValue = arr[i];
                }
            }
            return maxValue;
        }
        
            static int findMinInArray(int[] arr){
            int minValue=arr[0]; // เก็บค่าเริ่มต้นเป็นค่าสูงสุดก่อน
            for(int i=0;i<arr.length;i++){
                if(arr[i]<minValue){
                    minValue = arr[i];
                }
            }
            return minValue;
        }
           
            static int findMaxIndex(int[] arr){
            int maxIndex=0; // เก็บค่าเริ่มต้นเป็นค่าสูงสุดก่อน
            for(int i=0;i<arr.length;i++){
                if(arr[i]>arr[maxIndex]){
                    maxIndex = i;
                }
            }
            return maxIndex;
        }
            
            static int findMinIndex(int[] arr){
            int minIndex=0; // เก็บค่าเริ่มต้นเป็นค่าสูงสุดก่อน
            for(int i=0;i<arr.length;i++){
                if(arr[i]<arr[minIndex]){
                    minIndex = i;
                }
            }
            return minIndex;
        }     
            
            static String compareArray(int[] a,int[] b){
            // เปรียบสมาชิกใน array
            String masseage;
            for(int i=0;i<a.length;i++){
                    if(a[i] == b[i]){
                        masseage="เท่ากัน";
                }
            }
            masseage="ไม่เท่ากัน";
            return masseage;
        }             
}
