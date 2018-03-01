package iloveyouboss;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class ProfileTest {

        private Profile profile;
        private BooleanQuestion question;
        private Criteria criteria;

        @Before
        public void create() {
            profile = new Profile("Bull Hockey, Inc.");
            question = new BooleanQuestion(1, "Got bonuses?");
            criteria = new Criteria();
        }
        @Test
        public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
            Answer profileAnswer = new Answer(question, Bool.FALSE); profile.add(profileAnswer);
            Answer criteriaAnswer = new Answer(question, Bool.TRUE);
            Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch); criteria.add(criterion);
            boolean matches = profile.matches(criteria); assertFalse(matches);
        }
        @Test
        public void matchAnswersTrueForAnyDontCareCriteria() {
            Answer profileAnswer = new Answer(question, Bool.FALSE); profile.add(profileAnswer);
            Answer criteriaAnswer = new Answer(question, Bool.TRUE);
            Criterion criterion = new Criterion(criteriaAnswer, Weight.DontCare); criteria.add(criterion);
            boolean matches = profile.matches(criteria); assertTrue(matches);
        }


}

