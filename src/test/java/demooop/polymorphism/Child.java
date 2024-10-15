package demooop.polymorphism;

public class Child extends Parent{
    // Overriding phương thức display
//    @Override
//    public void display() {
//        System.out.println("Hiển thị từ lớp con.");
//    }
//
//    // Hiding phương thức static
//    @Override
//    public static void staticMethod() {
//        System.out.println("Phương thức static từ lớp con.");
//    }
//
//    @Override
//    // Phương thức private (không thể overriding)
//    private void privateMethod() {
//        System.out.println("Phương thức private từ lớp cha.");
//    }

    // Không thể overriding phương thức showMessage vì nó là final
    // @Override
    // public void showMessage() {
    //     System.out.println("Thông điệp từ lớp con.");
    // }
}
