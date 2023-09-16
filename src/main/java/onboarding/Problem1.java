package onboarding;

import onboarding.problem1.Page;
import onboarding.problem1.PagePair;
import onboarding.problem1.Validation;
import onboarding.problem1.Winner;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = 0;

        try {
            Validation pobiValidation = new Validation(pobi.get(0), pobi.get(1));
            Validation crongValidation = new Validation(crong.get(0), crong.get(1));

            pobiValidation.isValid();
            crongValidation.isValid();

            PagePair pobiPagePair = new PagePair(
                    new Page(pobi.get(0)),
                    new Page(pobi.get(1))
            );

            PagePair crongPagePair = new PagePair(
                    new Page(crong.get(0)),
                    new Page(crong.get(1))
            );

            Winner winner  = new Winner(pobiPagePair.calculateScore(), crongPagePair.calculateScore());
            answer = winner.isWinner();

            return answer;

        } catch (Exception e){

            System.out.println("유효하지 않은 페이지 입니다.");
            answer = -1;
            return answer;
        }
    }
}
