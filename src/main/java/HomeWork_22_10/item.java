package HomeWork_22_10;

public class item {
    int art;
    String naimenovanie;
    int price = 1000;
    int quantity = 5;


    public item(int myArt, String myNaimenovanie, int myPrice, int myQuantity) {
        art = myArt;
        naimenovanie = myNaimenovanie;
        price = myPrice;
        quantity = myQuantity;
        System.out.println("\nАртикул - " + myArt + "\nНаменование - " + myNaimenovanie + "\nЦена - " + myPrice + "\nОстаток - " + myQuantity);


}
}