public class SquareEquation {
    private double a, b, c;

    public SquareEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Rootss Solution() {
        Rootss result = new Rootss();
        if(a==0){
            result.x1 = -c/b;
            return result;
        }
        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("Solution has no roots.");
            throw new ArithmeticException("Solution has no roots.");
        }



        result.x1 = (-b - Math.sqrt(d)) / (2 * a);
        result.x2 = (-b + Math.sqrt(d)) / (2 * a);

        return result;
    }
}
