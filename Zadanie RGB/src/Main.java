public class Main {
    public static void main(String[] args) {
        colorRGB red = new colorRGB(1, 0, 0);
        colorRGB blue = new colorRGB(0, 0, 1);
        colorRGB purple = colorRGB.mix(red, blue, 0.5f);
        System.out.println(purple);
    }
}
