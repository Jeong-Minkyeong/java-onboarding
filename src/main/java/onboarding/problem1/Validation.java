package onboarding.problem1;

public class Validation {

    private final int firstValue;
    private final int secondValue;

    public Validation(int firstValue, int secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void isValid() throws Exception {
        if (firstValue+1 != secondValue) {
            throw new Exception();
        }
    }
}
