package K_ObjectClass_String_class;

public class OTPGenerator {
    public static void main(String[] args) {
        // Generating a random OTP of length 6
        int otpLength = 6;
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < otpLength; i++) {
            int randomDigit = (int) (Math.random() * 10); // Generating a random digit (0-9)
            otp.append(randomDigit);
        }

        System.out.println("Generated OTP: " + otp.toString());
    }
}

