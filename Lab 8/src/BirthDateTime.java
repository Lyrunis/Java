import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 2000, 2023);
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth", 1, 12);
        int day;
        switch (month) { //THIS CASE STATEMENT IS FOR THE MONTHS WITH WEIRD DAYS THAT ISN"T 31
            case 2:
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 29); //29 for leap years
                break;
            case 4:
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 30);
                break;
            case 6:
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 30);
                break;
            case 9:
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 30);
                break;
            case 11:
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 30);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 31);
                break;
        }
        int hours = SafeInput.getRangedInt(in, "Enter the hours of your birth", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter the minutes of your birth", 1, 59);

        System.out.println("Your birth date and time| Year: " + year + " | Month: " + month + " | Day: " + day + " | Hour: " + hours +  " | Minute: " + minutes);
    }
}
