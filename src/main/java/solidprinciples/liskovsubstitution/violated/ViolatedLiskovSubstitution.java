package solidprinciples.liskovsubstitution.violated;

/**
 * We should be to substitute base class objects with child class objects.
 * This should not alter behaviour/characteristics of program.
 */
class ViolatedLiskovSubstitution {

    static class Rectangle {

        private int height;
        private int width;

        public Rectangle(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int computeArea() {
            return height * width;
        }
    }

    /**
     * Because of overriding, in our main class, we get error.
     * It is violating of Liskov-Substitution principle.
     */
    static class Square extends Rectangle {

        public Square(int side) {
            super(side, side);
        }

        @Override
        public void setWidth(int width) {
            setSide(width);
        }

        @Override
        public void setHeight(int height) {
            setSide(height);
        }

        public void setSide(int side) {
            super.setWidth(side);
            super.setHeight(side);
        }
    }

    static class Main {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(10, 20);
            System.out.println(rectangle.computeArea());

            Square square = new Square(10);
            System.out.println(square.computeArea());

            useRectangle(rectangle);
            useRectangle(square);
        }

        private static void useRectangle(Rectangle rectangle) {
            rectangle.setHeight(20);
            rectangle.setWidth(30);
            assert rectangle.getHeight() == 20 : "Height Not equal to 20";
            assert rectangle.getWidth() == 30 : "Width Not equal to 30";
        }
    }

}
