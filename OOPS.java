public class OOPS {

    public static void main(String args[]) {

        ComplexNumbers cn = new ComplexNumbers();
        System.out.println(" A = 12"+'\n'+" B = 10");
        cn.sum(12, 10);
        cn.difference(12, 10);
        cn.multiple(12, 10);
        
    }


    
}

class ComplexNumbers{

    void sum (int a , int b){

        System.out.println(" Sum of A and B is : "+(a+b));
    }
    void multiple (int a , int b){

        System.out.println(" Multiplication of A and B is : "+ (a*b));
    }
    void difference (int a , int b){

        System.out.println(" Difference of A and B is : "+ (a-b));
    }
}
