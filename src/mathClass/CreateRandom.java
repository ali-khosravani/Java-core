package mathClass;

/**
 * Author: Ali Khosravani
 * Date: 2023-04-30
 * Desc: Create Random number between 2 number.
 */
public class CreateRandom {
    public int RandomNumber(int a, int b){
        int random_number = (int)(Math.random()*(b-a+1)+a);
        return random_number;
    }
}
