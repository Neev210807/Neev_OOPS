public class shape 
{
    
    abstract static class Shape {
        abstract double area();
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double area() {
            return length * width;
        }
    }

    static class Triangle extends Shape {
        double base;
        double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        double area() {
            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(546),
            new Rectangle(445, 645),
            new Triangle(3645, 845),
            new Circle(2456)
        };

        double total = 0;
        double largest = 0;

        for (Shape s : shapes) {

            double a = s.area();

            System.out.println(
                s.getClass().getSimpleName() + " Area = " + a
            );

            total = total + a;

            if (a > largest) {
                largest = a;
            }
        }

        System.out.println("Total Area = " + total);
        System.out.println("Largest Area = " + largest);
    }
}



