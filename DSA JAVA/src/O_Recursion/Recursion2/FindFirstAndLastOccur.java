package O_Recursion.Recursion2;

public class FindFirstAndLastOccur {
    public static  int frist =-1;
    public static int last=-1;
    public static void findOccurrence(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println("frist = "+frist+" "+"last = "+last);
            return;
        }
        char currentChar= str.charAt(idx);
        if(currentChar==element){
            if(frist==-1){
                frist=idx;
            }else{
                last=idx;
            }
        }
        findOccurrence(str,idx+1,element);
    }
    public static void main(String[] args) {
    String str="abaacdaefaah";
    findOccurrence(str,0,'a');
    }
}
