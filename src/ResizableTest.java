public class ResizableTest {
    public static void main(String[] args) {
        Shape[] sh = new Shape[3];
        sh[0] = new Rectangle(20.0, 10.0,"red",true);
        sh[1] = new Square(15.0, "pink", false);
        sh[2] = new Circle(25.0, "blue", true);

        for (Shape a: sh) {
            System.out.println(a);
        }

        for (Shape a: sh) {
            a.resize(Math.random() * 100);
        }

        System.out.println("\n");
        for (Shape a: sh) {
            System.out.println(a);
        }
    }
}
