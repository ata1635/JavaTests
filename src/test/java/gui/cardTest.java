package gui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class cardTest {

    @Nested
    class CardValueTest {
        @Test
        @DisplayName("Value is 11 when card is Ace")
        public void aceTest() {
            Card ace = new Card("A", "H");
            assertThat(ace.getValue()).isEqualTo(11);
        }

        @Test
        @DisplayName("Value is 10 when card is Jack, Queen or King")
        public void jackTest() {
            Card jack = new Card("J", "H");
            Card queen = new Card("Q", "H");
            Card king = new Card("K", "H");
            assertThat(jack.getValue()).isEqualTo(10);
            assertThat(queen.getValue()).isEqualTo(10);
            assertThat(king.getValue()).isEqualTo(10);
        }
    }

    @Test
    @DisplayName("Is image path to Five of Clubs correct?")
    void getImagePathTest() {
        Card club5 = new Card("5", "C");
        assertThat(club5.getImagePath()).isEqualTo("/cards/5-C.png");
    }
}
