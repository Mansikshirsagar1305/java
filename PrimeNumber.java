import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter the No");

        int num=sc.nextInt();

        boolean isprime=true;

        if(num<=1){

            isprime=false;

        }
        else
        {
            for(int i=2;i<num;i++){
                if(num%i==0)
                {
                    isprime=false;
                    break;

                }



            }


         
        }

        if(isprime){
            System.out.println("No is prime");
        }
            else
            {
                System.out.println("No is Not prime");
            }

    }
}
