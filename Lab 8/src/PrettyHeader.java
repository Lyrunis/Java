import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in a message for the header");
        String msg = in.nextLine();
        SafeInput.prettyHeader(msg);
    }
}