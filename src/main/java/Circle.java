public class Circle extends Shape {
    public String getName() {
        return "Circle";
    }

    @Override
    public void printT() {
        System.out.println("The name of the geometric shape is " + getName());
    }

}
