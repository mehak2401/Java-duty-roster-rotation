import java.util.Arrays;

public class DutyRosterRotation {

    public static void main(String[] args) {
        String[] names1 = {"A", "B", "C", "D", "E"};
        int k1 = 2;
        System.out.println("Original: " + Arrays.toString(names1) + ", k = " + k1);
        System.out.println("Rotated:  " + Arrays.toString(rotateRoster(names1, k1)));

        System.out.println();

        String[] names2 = {"A", "B", "C", "D", "E"};
        int k2 = 7;
        System.out.println("Original: " + Arrays.toString(names2) + ", k = " + k2);
        System.out.println("Rotated:  " + Arrays.toString(rotateRoster(names2, k2)));
    }

    public static String[] rotateRoster(String[] names, int k) {
        if (names == null || names.length == 0) {
            return names;
        }

        int n = names.length;
        // Reduce k to eliminate full rotation cycles
        int effectiveK = (int) (k % n);

        String[] rotated = new String[n];

        for (int i = 0; i < n; i++) {
            int newPosition = (i + effectiveK) % n;
            rotated[newPosition] = names[i];
        }

        return rotated;
    }
}