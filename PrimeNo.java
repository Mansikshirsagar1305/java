class PrimeNo{

    public static void main(String[] args) {
     
        
        int n=7;
        boolean prime=true;

        if(n<=1){
            prime=false;

        }
        else{
            for(int i=2;i<=n/2;i++){

                if(n %2 ==0)
                {
                    prime=false;
                    break;

                }
            }

        }
        if(prime)
        {

            System.out.println("No is Prime");
        }
        else
        {
            
            System.out.println("No is  Not Prime");
        }
    }




}