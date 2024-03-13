import java.util.ArrayList;
public class recursion4 {
    public static void printPerm(String str, String Permutation){
        if(str.length() == 0){
            System.out.println(Permutation);
            return;
        }
        for(int i=0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, Permutation+currChar);
        }
    }

    public static int countMazePaths(int i, int j, int n, int m){
        if(i == n || j == m)
            return 0;
        if(i == n-1 && j == m-1)
            return 1;

        int rightPaths = countMazePaths(i+1, j, n, m);
        int leftPaths = countMazePaths(i, j+1, n, m);
        return rightPaths + leftPaths;
    }

    public static int placeTiles(int n, int m){
        if(n == m) 
            return 2;
        if(n < m)
            return 1;

        int placeVertical = placeTiles(n-m, m);
        int placeHorizontal = placeTiles(n-1, m);
        return placeHorizontal + placeVertical;
    }

    public static int inviteGuests(int n){
        if(n <= 1)
            return 1;

        int inviteSingle = inviteGuests(n-1);
        int invitePair = (n-1) * inviteGuests(n-2);
        return inviteSingle + invitePair;
    }

    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++)
            System.out.print(subset.get(i)+" ");
        System.out.println();
    }
    public static void getSubset(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubset(subset);
            return;
        }

        subset.add(n);
        getSubset(n-1, subset);

        subset.remove(subset.size()-1);
        getSubset(n-1, subset);

    }
    public static void main(String args[]){
        // String str = "c";
        // // System.out.println(str.substring(0,0));
        // System.out.println(str.substring(1));
        // // printPerm(str, "");

        // int n = 3, m = 3;
        // int totalPaths = countMazePaths(0, 0, n, m);
        // System.out.println(totalPaths);

        // int n = 4, m = 2;
        // int totalWays = placeTiles(n, m);
        // System.out.println(totalWays);

        // int n = 3;
        // System.out.println(inviteGuests(n));

        int n=3;;
        ArrayList<Integer> susbet = new ArrayList<>();
        getSubset(n, susbet);
    }
}
