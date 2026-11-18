public class SumofDigit {

    public static void main(String[] args) {
        

        int num=54321;
        int sum=0;

        while (num>0)
        {
             int digit=num%10;
              sum=digit+sum;
              num=num/10;



            
        }
        System.out.println("sum  of Digit" +sum);
        }
}
