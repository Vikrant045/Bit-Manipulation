public class get_ith_bit {

    public  static void main(String args[]) {

        int a = 4 ; // 00000100
int i = 3;
        int bitmask = 1<<i;
        
        if((a&bitmask)>0){
            System.out.println(" ith term is 1" );
        }
        else{
            System.out.println(" ith term is 0" );

        }
    }
    
}
