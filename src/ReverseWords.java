class ReverseWords{
    public static void main(String[] args) {
        String str="erripouku eter";
        String finalStr="";
        String[] arr=str.split(" ");
        for (String words:arr){
            String reverseWors="";
            for (int i=words.length()-1;i>=0;i--){
                reverseWors=reverseWors+words.charAt(i);
            }
            finalStr+=reverseWors+" ";
        }
        System.out.println(finalStr);
    }
}