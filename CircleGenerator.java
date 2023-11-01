public class CircleGenerator {
    public static String drawCircle(int radius, String symbol) {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return symbol;
    }

    public static void main(String[] args) {
        drawCircle(100, ".");
    }
}
