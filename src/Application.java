import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
//Tao ArrayList student1 cua Student , gan gia tri cho cac object sau do gan cac object vao student1
        ArrayList<Student> student1 = new ArrayList<>();
        student1.add(new Student("Binh1", "A01", "Binh01@gmail.com", "HN", true, 45, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh2", "A02", "Binh02@gmail.com", "HN", true, 44, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh3", "A03", "Binh03@gmail.com", "HN", true, 43, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh4", "A04", "Binh04@gmail.com", "HN", true, 42, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh5", "A05", "Binh05@gmail.com", "HN", true, 41, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh6", "A06", "Binh06@gmail.com", "HN", true, 40, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh7", "A07", "Binh07@gmail.com", "HN", true, 39, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh8", "A08", "Binh08@gmail.com", "HN", true, 37, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh9", "A09", "Binh09@gmail.com", "HN", true, 36, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh10", "A10", "Binh10@gmail.com", "HN", true, 35, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh11", "A11", "Binh11@gmail.com", "HN", true, 34, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh12", "A12", "Binh12@gmail.com", "HN", true, 33, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh13", "A13", "Binh13@gmail.com", "HN", true, 26, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh14", "A14", "Binh14@gmail.com", "HN", true, 27, "2022/06/30", "2025/06/30"));
        student1.add(new Student("Binh15", "A15", "Binh15@gmail.com", "HN", true, 28, "2022/06/30", "2025/06/30"));

//Tao ArrayList classes cua Class:
        ArrayList<Class> classes = new ArrayList<>();
        classes.add(new Class("A1", "ChuyenToan", true, "2022/06/30", "2025/06/30"));
        classes.add(new Class("A2", "ChuyenTin", true, "2022/06/30", "2025/06/30"));


//Sap xep student1 theo chieu giam dan cua mark:
        Collections.sort(student1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() == o2.getMark()) {
                    return 0;
                } else if (o1.getMark() < o2.getMark()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

//Tao ArrayList student2 cua Class Student
        ArrayList<Student> student2 = new ArrayList<>();


//Lay ra nhung sv  co diem lon hon 30 sau do nhet vao student2
        for (Student std : student1) {
            double mark = std.getMark();

            if (mark > 30) {


            }


        }


    }


}

