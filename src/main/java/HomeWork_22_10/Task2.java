package HomeWork_22_10;

public class Task2 {
    public static void main(String[] args) {
        Flat seller = new Flat();
        seller.hallway = 6;
        seller.bathroom = 33;
        seller.furniture = true;
        seller.kithen = 12;
        seller.room = 12;
        double sum = (seller.hallway + seller.bathroom + seller.kithen + seller.room);
        System.out.println("Квартира: " + sum + " кв.м" + "\nНаличие мебели: " + seller.furniture);
    }
}
