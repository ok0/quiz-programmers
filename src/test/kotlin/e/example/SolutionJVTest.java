package e.example;

import e.example.SolutionJV;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionJVTest {
    @Test
    public void test() {
        SolutionJV s = new SolutionJV();
        String answer1 = s.solution("3(hi)");
        Assertions.assertEquals(answer1, "hihihi");
    }
}
