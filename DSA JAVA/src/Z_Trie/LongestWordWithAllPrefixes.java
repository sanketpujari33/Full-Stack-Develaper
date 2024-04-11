package Z_Trie;

public class LongestWordWithAllPrefixes {
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
    public static String ans = "";

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
    public static void longestWord(Node root, StringBuilder curr) {
        if (root==null){
            return;
        }
        for(int i=0; i<26; i++) {
            if(root.children[i] != null && root.children[i].eow == true) {
                curr.append((char)(i+'a'));
                if(curr.length() > ans.length()) {
                    ans = curr.toString();
                }
                longestWord(root.children[i], curr);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }


    public static void main(String args[]) {
        String words[]={"a", "banana","app", "appl", "ap", "apply", "apple"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
