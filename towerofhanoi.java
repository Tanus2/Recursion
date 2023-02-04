
public class towerofhanoi {

    public static void tower(int n, char x, char y, char z) {
        if (n == 1) {
            System.out.println(x + "to" + z);
            return;

        }
        tower(n - 1, x, z, y);
        System.out.println(x + "to" + z);
        tower(n - 1, y, x, z);

    }

    public static void main(String[] args) {
        int n = 3;
        tower(n, 'X', 'y', 'z');
    }

}
