package onboarding.problem1;

public class Winner {

    private final int firstUserScore;
    private final int secondUserScore;

    public Winner(int firsUserScore, int secondUserScore) {
        this.firstUserScore = firsUserScore;
        this.secondUserScore = secondUserScore;
    }

    public int isWinner(){

        if (firstUserScore > secondUserScore){
            return 1;
        }

        if (firstUserScore < secondUserScore){
            return 2;
        }

        return 0;
    }
}
