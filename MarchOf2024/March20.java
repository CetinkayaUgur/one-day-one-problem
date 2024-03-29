package MarchOf2024;

public class March20 {
    public static int fact(int number){
        int total = 1;
        if (number == 1) {
            return total;
        }
        total *= number;
        return fact(number-1);
    }
}
