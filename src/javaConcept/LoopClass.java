package javaConcept;

public class LoopClass {
    //while , do while , for , for -each

    public static void main(String[] args) {
        //foreach
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i :numbers){
            sum += i;
        }
        System.out.println(sum);

        for (int i =0 ;i<6; i++){
            if (i ==3){
                continue;
            }
            if(i ==5) {
                break;
            }
            System.out.println(i);
        }
    }

}
