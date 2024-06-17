package main.java.solution;
/**
 * @author Ali Khosravani
 * @since 1403/03/20
 * @version 1.0.0
 *
 * */
public class Rabbit {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        do {
            sum += 2;
            if (sum >= 10) {
                count++;
                break;
            }
            else{
                count++;
            }
            sum -= 1;
        }
        while (sum < 10);
        System.out.println(count + " Count for jump to up ");
    }
}
