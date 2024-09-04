class isomaophic{
    public static void iso(String s1 , String s2){
        if (s1.length()!=s2.length()){
            System.out.println("not an isomorphic");

        }
        int [] arr= new int[256];
        int [] arr1 = new int[256];
        for (int i=0 ; i<s1.length()&& i<s2.length();i++){
            char s =s1.charAt(i);
            char y = s2.charAt(i);
            if (arr[s]!=arr1[y]){
                System.out.println("false");
                return;
            }
            arr[s]=i+1;
            arr1[y]=i+1;

        }
        System.out.println("true");

    }
    public static void main(String[] args) {
        iso("h@@" , "b@@");
    }
}