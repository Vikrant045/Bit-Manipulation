public class CheckNumIsPowOf2orNot {

    public static boolean isCheck( int n ) {

       if((n & (n-1) )== 0){
return true;
       }

        //int bitmask =a|b;

    else{
        return false;
    }
    }
        public static void main(String args[]) {
    
            int n =4;
    
            System.out.println(isCheck(n));
            
        }
    
}
