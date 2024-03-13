public class recursion2 {
    static int step = 1;
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Step-"+step+"  Transfer disk "+n+" from "+src+" to "+dest);
            step++;
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Step-"+step+"  Transfer disk "+n+" from "+src+" to "+dest);
        step++;
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        int n = 10;
        // System.out.println((int)java.lang.Math.pow(2,n)-1);
        //time complexity = O(2^n -1) 
        towerOfHanoi(n, "S","H", "D");
    }
}
