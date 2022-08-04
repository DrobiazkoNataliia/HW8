public class Rectangle extends Shape {
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void printT() {
        System.out.println("The name of the geometric shape is " + getName());
    }
}
