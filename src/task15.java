import java.util.Arrays;

public class task15 {


    public static int[] bubbleSorting(int[] array) {
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length ; j++){

            if( array[j] < array[i] ){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                }
            }
        } return array;
    }

    public static void main(String[] args) {
        int mass[] = {2,10,8, 3 ,3, 5};
        int s[] = bubbleSorting(mass);
        System.out.println(Arrays.toString(s));
    }
}

