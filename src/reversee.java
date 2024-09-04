public class reversee {
    public static void main(String[] args) {
        String s= "Dinesh is erripooku";
        String [] arr= s.split(" ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }


    }
}