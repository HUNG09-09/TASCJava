package demooop.superthis;

public class SuperChild extends SuperParent {
    int number = 10;

    // Ghi đè phương thức của lớp cha
    @Override
    public void display() {
        System.out.println("Phương thức từ lớp con.");
    }

    // Phương thức sử dụng super để truy cập thành phần của lớp cha
    public void show() {
        System.out.println("Giá trị của number trong lớp con: " + this.number);
        System.out.println("Giá trị của number trong lớp cha: " + super.number);

        // Gọi phương thức của lớp cha
        super.display();
    }
}
