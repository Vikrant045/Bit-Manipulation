public class ClearRangeOf_i_And_j_ {
    public static int cleariAndjBits( int n ,int i,int j) {

        int a= (~0)<<(j+1);
        int b = (1<<i)-1;

        int bitmask =a|b;

    
        return n&bitmask;
        
    }
        public static void main(String args[]) {
    
            int n =10,i=2,j=4;
    
            System.out.println(cleariAndjBits(n, i,j));
            
        }
    }
    

