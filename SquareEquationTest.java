import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareEquationTest {

    // Ссылка на класс SquareEquation
    private SquareEquation se;

    @BeforeEach
    void setUp() throws Exception {
        // Этот метод вызывается первым.
        // Создать экземпляр класса SquareEquation
        se = new SquareEquation(1, -6, 8); // x^2 - 6x + 8 = 0
    }

    @Test
    void testSolution() {
        // Объявить экземпляр класса Roots
        Rootss rt = se.Solution();

        // Проверка решения x1
        assertEquals(rt.x1, 2.0);

        // Проверка решения x2
        assertEquals(rt.x2, 4.0);
    }
}
