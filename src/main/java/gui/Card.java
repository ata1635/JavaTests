package gui;

public class Card {
    String value;
    String type;

    Card(String value, String type) {
        this.value = value;
        this.type = type;
    }

    public String toString() {
        return value + "-" + type;
    }

    public int getValue() {
        if ("AJQK".contains(value)) { //Ace Jack Queen King
            if (value == "A") {
                return 11;
            }
            return 10;
        }
        return Integer.parseInt(value); //values 2-10
    }

    public boolean isAce() {
        return value == "A";
    }

    public String getImagePath() {
        return "/cards/" + toString() + ".png";
    }
}
