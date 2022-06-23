public class Main {
    public static void main(String[] args) {
        BlackPrinter blackPrinter = new BlackPrinter();
        blackPrinter.print();
        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print();
        colorPrinter.print("Green");
    }
}
