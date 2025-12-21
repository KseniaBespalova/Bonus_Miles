public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int miles;
        if (price >= 1000) {
            miles = price / bonus;
        } else {
            miles = 0;
        }
        return miles;
    }
}