import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "1234abcd";
        int mid = str.length() / 2;
        String[] parts = {
                str.substring(0, mid),
                str.substring(mid),
        };
        System.out.println(Arrays.toString(parts));

    }
}
