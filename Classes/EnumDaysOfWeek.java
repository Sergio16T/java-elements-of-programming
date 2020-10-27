package Classes;


enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumDaysOfWeek {
    Day day; 

    public EnumDaysOfWeek(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch(day) {
            case MONDAY: 
                System.out.println("Monday Blues");
                break;
            case FRIDAY: 
                System.out.println("Happy Friday!");
                break;
            default:
                System.out.println("You got this");
        }
    }
    public static void main(String[] args) {
        EnumDaysOfWeek firstDay = new EnumDaysOfWeek(Day.MONDAY);
        firstDay.tellItLikeItIs();
    }
}
