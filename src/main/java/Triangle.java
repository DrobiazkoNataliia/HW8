public class Triangle extends Shape {
    public String getName() {
        return "Triangle";
    }

    @Override
    public void printT() {
        System.out.println("The name of the geometric shape is " + getName());
    }
}
