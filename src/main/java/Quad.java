public class Quad extends Shape {
    public String getName() {
        return "Quad";
    }

    @Override
    public void printT() {
        System.out.println("The name of the geometric shape is " + getName());
    }
}
