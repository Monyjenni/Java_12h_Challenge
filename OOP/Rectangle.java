class Rectangle {
    private float width;
    private float height;

    public Rectangle() {
        this.width = 1;
        this.height = 2;
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    //Area = Width * Height
    public float getArea() {
        return this.width * this.height;
    }
    //Perimeter = (Width + Height) * 2
    public float getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5f, 35.7f);

        System.out.println("1st Rectangle");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println("\nRectangle 2");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
