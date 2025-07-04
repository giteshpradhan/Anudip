public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(8, 7);

        int area1 = rect1.calculateArea();
        int area2 = rect2.calculateArea();

        if (area1 > area2) {
            System.out.println("Rectangle1 > Rectangle2");
        } else if (area1 < area2) {
            System.out.println("Rectangle1 < Rectangle2");
        } else {
            System.out.println("They are equal");
        }
    }
}
