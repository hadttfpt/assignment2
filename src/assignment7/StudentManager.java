package assignment7;

import java.util.*;

public class StudentManager extends Student{
    public ArrayList<Student> List = new ArrayList<>();

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap name ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi ");
        String address = sc.nextLine();
        System.out.println("Nhap DTB ");
        Float gpa = sc.nextFloat();
        sc.nextLine();
        Student st = new Student(id,name,age,address,gpa);
        List.add(st);
        showStudent();

    }

    public void editStudent(int id) {
        for (Student st : List) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap id: ");
            id = sc.nextInt();
            if (st.id == id) {
                System.out.println("Nhap name ");
                String name = sc.nextLine();
                System.out.println("Nhap tuoi ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Nhap dia chi ");
                String address = sc.nextLine();
                System.out.println("Nhap DTB ");
                float gpa = sc.nextFloat();
                sc.nextLine();
                setId(id);
                setName(name);
                setAge(age);
                setAddress(address);
                setGpa(gpa);
                showStudent();
            }
        }
    }

    public void deleteStudent(int id) {
        for (Student s : List) {
            if (s.id == id) {
                List.remove(s);
                return;
            }
        }
    }

    public void showStudent() {
        for (Student s : List) {
            System.out.println( "Student " +s.id + ": " + s.name + " " + s.age + " " + s.address + " " + s.gpa);
        }
    }

    public void sortGPA() {
        Collections.sort(List, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.gpa.compareTo(o2.gpa);
            }
        });
        for (Student s : List) {
            System.out.println( "Student " +s.id + ": " + s.name + " " + s.age + " " + s.address + " " + s.gpa);
        }
    }

    public void sortName() {
        Collections.sort(List, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (Student s : List) {
            System.out.println( "Student " +s.id + ": " + s.name + " " + s.age + " " + s.address + " " + s.gpa);
        }
    }
}