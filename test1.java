
import static org.junit.Assert.*;
import org.junit.Test;

public class test1 {

    QuizOneJunit quizOneJunit = new QuizOneJunit();

    @Test
    public void testSquare() {
        
        assertEquals(4, quizOneJunit.square(2));
    }

    @Test
    public void testCountLetterA() {
        
        assertEquals(2, quizOneJunit.countLetterA("baA"));
    }

    @Test 
    public void testCheckTwoLetter() { 
        
        assertFalse(quizOneJunit.checkTwoLetter("a")); 
    } 
}
