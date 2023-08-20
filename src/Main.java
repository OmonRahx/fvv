public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double hightM = 1.73;
        int weightKg = 72;
        int Bmi = service.calculate(hightM, weightKg);
        System.out.println(Bmi);
    }
}