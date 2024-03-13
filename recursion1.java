public class recursion1 {
    public static int calPow(int x, int n){
        if(n==0)
            return 1;
        if(x==0)
            return 0;
        return x * calPow(x, n-1);
    }

    public static int calPowlogn(int x, int n){
        if(n==0)
            return 1;
        if(x==0)
            return 0;
        if(n%2==0)
            return calPowlogn(x, n/2) * calPowlogn(x, n/2);
        else
            return calPowlogn(x, n/2) * calPowlogn(x, n/2) * x;
    }
    public static void main(String args[]){
        int x = 2, n = 5;
        System.out.println(calPow(x, n));

        //x^n stack height = logn
        System.out.println(calPowlogn(x, n));
    }
}
