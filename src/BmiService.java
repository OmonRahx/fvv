public class BmiService {
    public int calculate(double hightM, int weightKg) {
        return (int) (weightKg / (hightM * hightM));
    }
}

