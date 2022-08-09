import java.time.LocalDate;

public class Teacher extends Person{
    private int yearOfExperiences;
    private String speciality;

    public Teacher(String id, String name, Gender gender, LocalDate birthday, String email, String phoneNum,
                    int yearofExp, String specialtity) {
        super(id, name, gender, birthday, email, phoneNum);
        this.yearOfExperiences = yearofExp;
        this.speciality = specialtity;
    }

    @Override
    public void printInfo() {
        System.out.print("\nTeacher info->");
        super.printInfo();
        System.out.printf(", yearOfEXP: " + yearOfExperiences + ", speciality: " + speciality);
    }
}