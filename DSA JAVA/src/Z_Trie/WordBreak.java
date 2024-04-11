package Z_Trie;

public class WordBreak {
    static class Node{
        Trie.Node[] children;
        boolean eow;
        public Node(){
            children=new Trie.Node[26];  // a to z
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    //    Insert In Trie
    static Trie.Node root = new Trie.Node();
    public static void insert(String word) { //O(n)
        Trie.Node current=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(current.children[index]==null){
                current.children[index]=new Trie.Node();
            }
            if(i==word.length()-1) {
                current.children[index].eow = true;
            }
            current=current.children[index];
        }
    }


    public static boolean search(String key) { //O(n)
        Trie.Node current=root;
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

    public static boolean wordBreak(String key) {
        int len = key.length();
        if(len == 0) {
            return true;
        }
        for(int i=1; i<=len; i++) {
            String firstPart =key.substring(0, i);
            String secPart=key.substring(i);
            if(search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    String words[]={"i", "like", "sam", "samsung", "mobile"};
    String key="ilikesamsung";
    for(int i=0;i<words.length;i++){
        insert(words[i]);
    }
    System.out.println(wordBreak(key));

    }
}
