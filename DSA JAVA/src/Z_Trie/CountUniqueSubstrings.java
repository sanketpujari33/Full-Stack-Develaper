package Z_Trie;

public class CountUniqueSubstrings {
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children=new Node[26];  // a to z
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    //    Insert In Trie
    static Node root = new Node();

    public static void insert(String word) { //O(n)
        Node current=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(current.children[index]==null){
                current.children[index]=new Node();
            }
            if(i==word.length()-1) {
                current.children[index].eow = true;
            }
            current=current.children[index];
        }
    }


    public static boolean search(String key) { //O(n)
        Node current=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(current.children[index]==null){
                return false;
            }
            if(i==key.length()-1 && current.children[index].eow==true){
                return true;
            }
            current=current.children[index];
        }
        return false;
    }
    public static int countUniqueSubstring(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countUniqueSubstring(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String args[]) {
        String str ="ababa";

        for (int i = 0; i < str.length(); i++) {
            String Suffix = str.substring(i);
            insert(Suffix);
//            System.out.println(Suffix);
        }
        System.out.println(countUniqueSubstring(root));
    }
}
