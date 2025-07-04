import java.util.Arrays;

public class DuplicateCounter {
    public static long countDuplicates(int[] arr) {
        return arr.length - Arrays.stream(arr).distinct().count();
    }

    public static void main(String[] args) {
        System.out.println(countDuplicates(new int[]{1, 1, 1}));
        System.out.println(countDuplicates(new int[]{1, 2, 1}));
        System.out.println(countDuplicates(new int[]{1, 2, 3}));
    }
}
