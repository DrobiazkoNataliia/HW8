public class Rhombus extends Shape {
    public String getName() {
        return "Rhombus";
    }

    @Override
    public void printT() {
        System.out.println("The name of the geometric shape is " + getName());
    }
}
