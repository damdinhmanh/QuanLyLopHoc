import java.time.LocalDate;

public class Person {
    private String id;
    private String name;
    private Gender gender;
    private LocalDate birthday;
    private String email;
    private String phoneNum;

    public Person(String id, String name, Gender gender, LocalDate birthday, String email, String phoneNum) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public void printInfo() {
        System.out.print(" id: " + id + ", name: " + name + ", gender: " + gender + ", birthday: " + birthday +
                            ", email: " + email + ", phoneNum: " + phoneNum);
    }

    public LocalDate getBirthDay() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public boolean hasString(String findStr) {
        if (name.contains(findStr) || email.contains(findStr) || phoneNum.contains(findStr)) {
            return true;
        } else {
            return false;
        }
    }
}