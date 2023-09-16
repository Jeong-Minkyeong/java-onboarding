package onboarding.problem1;

public class PagePair {
    private final Page leftPage;
    private final Page rightPage;

    public PagePair(Page leftPage, Page rightPage) {
        this.leftPage = leftPage;
        this.rightPage = rightPage;
    }

    public PagePair(int leftPage, int rightPage) {
        this.leftPage = new Page(leftPage);
        this.rightPage = new Page(rightPage);
    }

    public int calculateScore() {
        return Math.max(leftPage.calculateScore(), rightPage.calculateScore());
    }
}
