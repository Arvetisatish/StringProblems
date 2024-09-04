public class no_of_words {
    public static void main(String[] args) {
        String s= "hii vroo broo tfghf hfgfd";
        int count=0;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
