package assignment7;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        StudentManager s = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        do{
            int choice;
            System.out.println("1. Add a student");
            System.out.println("2. Delete a student by ID");
            System.out.println("3. Edit a student by ID");
            System.out.println("4. Sort student by GPA");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");
            do {
                System.out.println("Nhap lua chon cua ban ");
                choice = scanner.nextInt();
            } while (choice > 7 || choice < 0);
            switch (choice) {
                case 1:
                    s.addStudent();
                    break;
                case 2:
                    System.out.println("Nhap id sinh vien muon xoa ");
                    int id = scanner.nextInt();
                    s.deleteStudent(id);
                    break;
                case 3:
                    System.out.println("Nhap id sinh vien muon edit ");
                    int idEdit = scanner.nextInt();
                    s.deleteStudent(idEdit);
                    break;
                case 4:
                    s.sortGPA();
                    break;
                case 5:
                    s.sortName();
                    break;
                case 6:
                    s.showStudent();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    break;
            }
        }while (true);
    }
}
