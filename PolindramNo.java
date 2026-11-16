public class PolindramNo {
    public static void main(String[] args) {
        
        
        int Num=121;
        int original=Num;
        int rev=0;

        while(Num>0)
        {
           int rem=Num%10;

           rev=rev *10+rem;

           Num=Num/10;



        }
        if(original==rev)
        {
            System.out.println("NO is Polindrom");

        }
        else{
            System.out.println("No is Not Polindrom");
        }

    }
    
}
