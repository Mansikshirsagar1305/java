import java.util.*;
public class ArrayCopyof {

    public static void main(String[] args) {
         int[] number= {43,13,35,21,31,23,656,56};
         int[] num= Arrays.copyOf(number,number.length);
         System.out.println(Arrays.toString(num));

         

    }
}
