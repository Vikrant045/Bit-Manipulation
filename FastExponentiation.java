public class FastExponentiation{


public static int Exponentiation(int a, int n) {
    int ans=1;
    while(n>0){

    if( (n&1)==1){

        ans = a*ans;
        a = a*a;
    }
    else{
        ans = ans*1;
        a= a*a;
    }
    n=n>>1;
}
return ans;
    
}

    public static void main(String args[]){
        int a =3 ;
        int n =5;
        System.out.println(Exponentiation(a, n));


    }
}