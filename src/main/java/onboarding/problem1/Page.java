package onboarding.problem1;

public class Page {
    private final int value;

    public Page(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
    public int calculateScore() {
        return Math.max(calculateSumScore(), calculateMultiplyScore());
    }

    private int calculateSumScore() {
        String valueString = Integer.toString(value);
        int sum = 0;
        for (int i = 0; i<valueString.length();i++){
            sum += Integer.parseInt(valueString.substring(i, i+1));
        }
        // System.out.println(sum);
        return sum;
    }

    private int calculateMultiplyScore() {
        String valueString = Integer.toString(value);
        int sum = 1;
        for (int i = 0; i<valueString.length();i++){
            sum *= Integer.parseInt(valueString.substring(i, i+1));
        }
        // System.out.println(sum);
        return sum;
    }
}
