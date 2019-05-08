package assignment6;

import java.util.Scanner;

public class News implements INews {
    /*
    2. Tạo một lớp có tên News:

    a. Khai báo các thuộc tính bao gồm: ID (int), Title (String), PublishDate (String), Author (String), Content (String) và AverageRate (float).
     Tạo các phương thức setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ có getter.

    b. Thực thi giao diện INews.

    c. Phương thức Display() sẽ in ra Title, PublishDate, Author, Content và AverageRate của tin tức ra console.

    d. Khai báo một mảng có tên RateList kiểu int gồm 3 phần tử.

    e. Tạo một phương thức có tên Calculate() để thiết đặt thuộc tính AverageRate ở ý a là trung bình cộng của 3 phần tử của mảng RateList ở ý d.
            */
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public News() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void Display(){

        System.out.println(PublishDate+" "+Title+" "+Author + " "+Content+" "+" "+AverageRate);
    }

    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
        this.AverageRate = averageRate;
    }

    public int RataList []  = new int[3];

    public void Calculate() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Nhap phan tu cua mang ");
        for(int i = 0;i<3;i++){
            RataList[i] = sc.nextInt();
            sum += RataList[i];
        }
        AverageRate = sum/3;
        System.out.println("Gia tri trung binh la "+AverageRate);
    }
}
