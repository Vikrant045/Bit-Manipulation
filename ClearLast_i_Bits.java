public class ClearLast_i_Bits{

public static int clearLastiBits( int n ,int i) {

    int bitmask = (~0)<<i;

    return n&bitmask;
    
}
    public static void main(String args[]) {

        int n =11,i=2;

        System.out.println(clearLastiBits(n, i));
        
    }
}