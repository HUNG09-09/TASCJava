package demooop.superthis;

public class ThisExample {
        private int number;

        // Constructor với tham số trùng tên với biến instance
        public ThisExample(int number) {
            this.number = number; // 'this' dùng để tham chiếu đến biến instance
        }

        // Gọi phương thức của đối tượng hiện tại
        public void display() {
            System.out.println("Giá trị của number là: " + this.number);
        }

        public static void main(String[] args) {
            ThisExample example = new ThisExample(10);
            example.display(); // Kết quả: "Giá trị của number là: 10"
        }

}
