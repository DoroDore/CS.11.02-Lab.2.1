public class Main {

    public static void main(String[] args) {
        int add = add(5,2);
        System.out.println(add);
        int addFour = add(5,2,3,4);
        System.out.println(addFour);
        String morningGreeting = morningGreeting("Theo");
        System.out.println(morningGreeting);
        String afternoonGreeting = afternoonGreeting("朱奕哲"); //For reference that is my chinese name
        System.out.println(afternoonGreeting);
        String tripleWord = triple("Repeat");
        System.out.println(tripleWord);
        double halfNum = half(4);
        System.out.println(halfNum);
        double roundPositiveNum = roundPositiveValueToNearestInteger(5.7);
        System.out.println(roundPositiveNum);
        double roundNegativeNum = roundNegativeValueToNearestInteger(-4.8);
        System.out.println(roundNegativeNum);
    }
    // 1. add
    public static int add(int numOne,int numTwo) {
        return numOne+numTwo;
    }
    // 2. addFour
    public static int add(int numOne, int numTwo, int numThree, int numFour) {
        int firstTwoNums = add(numOne, numTwo);
        int secondTwoNums = add(numThree, numFour);
        int addAll = add(firstTwoNums, secondTwoNums);
        return addAll;
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