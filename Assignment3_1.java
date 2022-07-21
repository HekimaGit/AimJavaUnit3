public class Assignment3_1 {

    public static class rectangle {

        private double width = 1;
        private double height = 1;

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return width * 2 + height * 2;
        }

        public void setWidth(double w) {
            width = w;
        }

        public void setHeight(double h) {
            height = h;
        }

        public rectangle() {

        }

        public rectangle(double width, double height) {
            setWidth(width);
            setHeight(height);
        }
    }
    
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle(40, 4);
        rectangle rectangle2 = new rectangle(5, 3.5);

        System.out.print("This program creates two rectangle objects and displays the width, height, area and perimeter of each.\n");

        System.out.print("\nRectangle 1" + "\nwidth = " + String.format("%.2f", rectangle1.getWidth()) + "\nheight = " + String.format("%.1f", rectangle1.getHeight()) + "\narea = " + String.format("%.2f", rectangle1.getArea()) + "\nperimeter = " + String.format("%.2f", rectangle1.getPerimeter()) + "\n");

        System.out.print("\nRectangle 2" + "\nwidth = " + String.format("%.2f", rectangle2.getWidth()) + "\nheight = " + String.format("%.1f", rectangle2.getHeight()) + "\narea = " + String.format("%.2f", rectangle2.getArea()) + "\nperimeter = " + String.format("%.2f", rectangle2.getPerimeter()) + "\n");
    }
}
