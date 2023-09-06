public class Main {

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2,3,4,5));
    }
    // 1. add
    public static int add(int numOne,int numTwo) {
        return numOne+numTwo;
    }
    // 2. addFour
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        return numOne+numTwo+numThree+numFour;
    }

    // 3. morningGreeting
    public static String morningGreeting(String morningGreeting) {
        return "早上好, "+morningGreeting+"!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String afternoonGreeting) {
        return "下午好, "+afternoonGreeting+"!";
    }

    // 5. triple
    public static String triple(String tripleInput) {
        return tripleInput+tripleInput+tripleInput;
    }

    // 6. half
    public static double half(double numInput) {
        return numInput/2;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double numInput) {
        return (int)(numInput+.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger (double numInput) {
        return (int)(numInput-.5);
    }
}