package BridgeLabz.Method.Level3;

import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean validateUniqueOTPs(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }

        boolean unique = validateUniqueOTPs(otps);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}
