package v1.stock.alpaca;

public class alpacaIndicatorData {
    private double point;
    public alpacaIndicatorData(double point){
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
