public class Polindrom {

        public static void main(String[] args) {
            

            int num=121;
            int rev=0;
            int original=num;

            while(num>0)
                {
                    int rem=num%10;
                    rev=rev*10+rem;
                    num=num/10;

                }
                if(original==rev){

                    System.out.println("no is plindrom");
                }
                else{
                    System.out.println("No is not plindrom");
                }
            
        }
}
