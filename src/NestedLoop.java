
public class NestedLoop {
    public static void main(String[] args){
        // loop นอก
        int i=1,j=1;
        while(i<=3){
            System.out.println("รอบนอก = "+i);
            j=1;
            // loop ใน
            while(j<=5){
                System.out.println("รอบใน = "+j);
                j++;
            }
            i++;
        }
    }
}
