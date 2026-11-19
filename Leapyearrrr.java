public class Leapyearrrr {

        public static void main(String[] args) {
            
        
    
            for(int num=2000;num<=2028;num++)
{
    if((num%400==0)|| (num%100!=0&& num%4==0))
    {
        System.out.println(num + "is Leap Year");
    }
}
    }
}


