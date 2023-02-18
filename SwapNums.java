public class SwapNums {

    public static void main(String args[]){

        int x=9 ;
        int y=11;
        System.out.println(" Before Swapping ");

        System.out.println(" X = "+x);
        System.out.println(" Y = "+y);

        x = x^y;
        y = x^y;
        x= x^y;

System.out.println();
        System.out.println(" After Swapping ");

        System.out.println(" X = "+x);
        System.out.println(" Y = "+y);


    }
    
}
