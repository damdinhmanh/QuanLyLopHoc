import java.time.LocalDate;

public class Student extends Person{
    private boolean isOnline;
    private String background;

    public Student(String id, String name, Gender gender, LocalDate birthday, String email, String phoneNum,
                     boolean isOnline, String background) {
        super(id, name, gender, birthday, email, phoneNum);
        this.isOnline = isOnline;
        this.background = background;
    }

    @Override
    public void printInfo() {
        System.out.print("\nStudent info->");
        super.printInfo();
        System.out.printf(", isOnline: " + isOnline + ", background: " + background);
    }
}
