import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[8];
        persons[0] = new Teacher("001", "Nguyen Thi My Anh", Gender.FEMALE, LocalDate.of(1992, 7, 20),
                                     "myanh@gmail.com", "0988219555", 10, "front end");

        persons[1] = new Teacher("002", "Dang Thi Thuy", Gender.FEMALE, LocalDate.of(1992, 3, 21),
                                     "dangthuy@gmail.com", "0988219523", 8, "back end");

        persons[2] = new Student("003", "Nguyen Duy Anh", Gender.MALE, LocalDate.of(1993, 6, 13),
                                 "duyanh@gmail.com", "096362762", false, "working");
        persons[3] = new Student("004", "Pham van D", Gender.MALE, LocalDate.of(1999, 2, 10),
                                 "dpv@gmail.com", "02344262762", false, "studying");
        persons[4] = new Student("005", "Le van C", Gender.MALE, LocalDate.of(1997, 8, 24),
                                 "vanc@gmail.com", "0345343546", true, "working"); 
        persons[5] = new Student("006", "Tran Thi Dung", Gender.FEMALE, LocalDate.of(2003, 8, 7),
                                 "trandung@gmail.com", "096345762", false, "working");
        persons[6] = new Student("007", "Vu thi Binh", Gender.FEMALE, LocalDate.of(2001, 4, 3),
                                 "thibinh@gmail.com", "0963634534", false, "working");                         
        persons[7] = new Student("008", "Hoang Van Tuan", Gender.MALE, LocalDate.of(1994, 6, 3),
                                 "duyanh@gmail.com", "0963234523", false, "working");
        
        //Duyet mang in thong tin
        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                teacher.printInfo();
            } else if (person instanceof Student) {
                Student student = (Student) person;
                student.printInfo();
            }
        }
        
        //Find Person by keyword
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nInput find string: ");
        String fStr = sc.nextLine();
        sc.close();

        for (Person person : persons) {
            if (person.hasString(fStr)) {
                System.out.print("Found Person Infor: ");

                if (person instanceof Teacher) {
                    Teacher teacher = (Teacher) person;
                    teacher.printInfo();
                } else if (person instanceof Student) {
                    Student student = (Student) person;
                    student.printInfo();
                }
            }
        }

        //Sort by Name -> sort from start of fisrt string character-> end string name character

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return (p1.getName().compareTo(p2.getName()));
            }
        });

        System.out.print("\n\nSorted List by Name: ");

        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                teacher.printInfo();
            } else if (person instanceof Student) {
                Student student = (Student) person;
                student.printInfo();
            }
        }

        //Sort by Age decrease -> earlier Date of birth is Older person
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getBirthDay().isEqual(p2.getBirthDay())) {
                    return 0;
                }
        
                if (p1.getBirthDay().isBefore(p2.getBirthDay())) {
                    return -1;
                } else {
                    return 1;
                } 
            }
        });

        System.out.print("\n\nSorted List by Age: ");

        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                teacher.printInfo();
            } else if (person instanceof Student) {
                Student student = (Student) person;
                student.printInfo();
            }          
        }
    }
}
