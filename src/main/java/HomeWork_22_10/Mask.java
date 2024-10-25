package HomeWork_22_10;

public class Mask {public static void main(String[] args) {
   String carNumber = "1234 5678 9012 3456";
   String mask  = carNumber.replace("1234567890123456", "1234 5678 9012 3456");
   String mask_1 = mask.replace("1234 5678 9012 3456", "**** **** **** 3456");
   System.out.println(mask_1);
}
}