public class Triangle {

    double a;
    double b;
    double c;

    public void area(double a, double b, double c) {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Yч бурчтуктун аянты: "+area);
    }


}
