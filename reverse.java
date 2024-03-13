public class reverse {
    public static void printRev(String str, int index){
        if(index==-1)
            return;
        System.out.print(str.charAt(index));
        printRev(str, index-1);
    }

    public static int first = -1, last = -1;
    public static void findOccurence(String str, int index, char element){
        if(index == str.length()){
            System.out.println("First occr: "+first+"\nLast occr: "+last);
            return;
        }
        if(element == str.charAt(index)){
            if(first == -1)
                first = index;
            else
                last = index;
        }
        findOccurence(str, index+1, element);
    }
    public static void main(String args[]){
        // String str = "okayy..";
        //time complexity = O(n) = str.length
        // printRev(str, str.length()-1);

        String strr = "abaacdaefaah";
        findOccurence(strr, 0, 'a');

    }
}
