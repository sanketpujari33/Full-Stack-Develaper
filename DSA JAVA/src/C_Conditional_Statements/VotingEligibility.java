package C_Conditional_Statements;

public class VotingEligibility {
    public static void main(String[] args) {
        int age = 20; // Example value of age
        boolean eligible = checkVotingEligibility(age);

        if (eligible) {
            System.out.println("The person with age " + age + " is eligible to vote.");
        } else {
            System.out.println("The person with age " + age + " is not eligible to vote.");
        }
    }

    public static boolean checkVotingEligibility(int age) {
        return age > 18;
    }
}
