package assignment5;

public class MainPerSon {
    public static void main(String[] args){
        Person pe = new Person();
        System.out.println("Nhap thong tin");
        pe.inputInfor();
        Student st = new Student();
        if(st.check()){
            System.out.println("Du 18 tuoi");
        }else{
            System.out.println("Chua du 18 tuoi");
        }
        System.out.println("In danh sach");
        pe.showInfor();
    }
}