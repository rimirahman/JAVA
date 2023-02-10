import java.util.Scanner;

public class EncryptString {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            System.out.println(stringFormatting(s1));

        }

        public static String stringFormatting(String s1) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);

                if(c==122) {
                    c = (char) (c - 25);
                }
                else {
                    c = (char) (c+5);
                    sb.append(c);
                    }

            }

            return sb.toString();
        }


}
