package application.session.manager;
/*
 * @author vikram wankhede
 * @date 4/5/2015
 */

// Enum datatype is used to store different languages
public enum Language {
    English(0),
    Dutch(1),
    French(2),
    German(3),
    Arabic(4),
    Italian(5),
    Greek(6),
    Portugeese(7),
    Russian(8),
    Swedish(9),
    Hebrew(10),
    Danish(11),
    Norwegian(12),
    Finnish(13),
    Chinese(14);

    private int value;

    private Language(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }
}
