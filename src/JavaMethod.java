/**
 * Created by ASteezy1 on 6/22/15.
 */
public class JavaMethod {

    public static void main(String[] args) {

        int a = 11;
        int b = 6;
        int c = minFunction(a, b);

        System.out.println("MinValue = " + c);

    }
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }
}
