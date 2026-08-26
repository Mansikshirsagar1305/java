import java.util.Arrays;

public class ArrayCopyrange {

    public static void main(String[] args) {
         int[] number= {43,13,35,21,31,23,656,56};
         int[] num= Arrays.copyOfRange(number,3,6);
         System.out.println(Arrays.toString(num));

    }
    
}
