package gui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class cardTest {

    @Nested
    class CardValueTest {
        @Test
        @DisplayName("Test if Ace has value 11")
        public void aceTest() {
            Card ace = new Card("A", "H");
            assertThat(ace.getValue()).isEqualTo(11);
        }

        @Test
        @DisplayName("Test if Jack, Queen, King all have value 10")
        public void jackTest() {
            Card jack = new Card("J", "H");
            Card queen = new Card("Q", "H");
            Card king = new Card("K", "H");
            assertThat(jack.getValue()).isEqualTo(10);
            assertThat(queen.getValue()).isEqualTo(10);
            assertThat(king.getValue()).isEqualTo(10);
        }

    }
}
