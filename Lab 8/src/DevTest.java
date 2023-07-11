import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your Phone (XXX-XXX-XXXX)", "^\\d{3}-\\d{3}-\\d{4}$");
        System.out.println("Phone: " + ssn);
    }
}