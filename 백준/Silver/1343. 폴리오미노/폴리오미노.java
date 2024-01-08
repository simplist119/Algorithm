import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = str.replace("XXXX", "AAAA");
        String str3 = str2.replace("XX", "BB");
        if(str3.contains("X")) str3 = "-1";
        System.out.println(str3);
    }
}