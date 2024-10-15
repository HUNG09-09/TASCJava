import demooop.Test;
import demooop.polymorphism.Child;
import demooop.polymorphism.Parent;
import demooop.superthis.SuperChild;

public class Main {
    public static void main(String[] args) {
//        Test test = new Test();
//        test.display();
//    }
//
//    Parent parent = new Parent();
//    Child child = new Child();
//
//    // Gọi phương thức display
//     parent.display(); // Kết quả: "Hiển thị từ lớp cha."
//     child.display();  // Kết quả: "Hiển thị từ lớp con."
//
//    // Gọi phương thức static
//     Parent.staticMethod(); // Kết quả: "Phương thức static từ lớp cha."
//     Child.staticMethod();  // Kết quả: "Phương thức static từ lớp con."


//    // Gọi phương thức showMessage
//        parent.showMessage(); // Kết quả: "Thông điệp từ lớp cha."
//        child.showMessage();  // Kết quả: "Thông điệp từ lớp cha."
//
//    // Gọi phương thức display
//        parent.display(); // Kết quả: "Hiển thị từ lớp cha."
//        child.display();  // Kết quả: "Hiển thị từ lớp con."
        SuperChild superChild = new SuperChild();
        superChild.show();

        // Kết quả:
        // "Giá trị của number trong lớp con: 10"
        // "Giá trị của number trong lớp cha: 20"
        // "Phương thức từ lớp cha.
    }
}
