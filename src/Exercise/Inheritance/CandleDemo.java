package Exercise.Inheritance;

class Candle{
    private String color;
    protected double height, price;

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        final double PER_INCH = 2;
        this.height = height;
        price = height * PER_INCH;
    }
}

class ScentCandle extends Candle{
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(double height) {
        final double PER_INCH = 3;
//        this.height = height;
        super.setHeight(height);
        price = height * PER_INCH;
    }
}
public class CandleDemo {
    public static void main(String[] args) {
        Candle candle = new Candle();
        candle.setColor("Pink");
        candle.setHeight(2);
        System.out.println("The "+candle.getHeight()+" inch "+candle.getColor()+" candle costs $"+candle.getPrice());
        ScentCandle scentCandle = new ScentCandle();
        scentCandle.setColor("Purple");
        scentCandle.setScent("Lavender");
        scentCandle.setHeight(3);
        System.out.println("The "+scentCandle.getHeight()+" inch "+scentCandle.getScent()+" "+scentCandle.getColor()+" candle costs $"+scentCandle.getPrice());
    }
}
