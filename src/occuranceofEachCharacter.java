import java.util.Scanner;

public class occuranceofEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str="hlo bro vvooo";
        int totalCount=str.length();
        String num=sc.next();
        int charcCount=str.replace(num , "").length();
        int count=totalCount-charcCount;
        System.out.println(count);
    }
}
