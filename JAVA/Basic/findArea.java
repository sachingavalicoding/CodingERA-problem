public class findArea {
    public static double areaOfCircle(double radius) {
        return (radius * radius * 3.14);
    }

    public static void main(String args[]) {
    double CircleArea = areaOfCircle(5);
    System.out.println("Area of Circle is : "+ CircleArea);
    }
}
