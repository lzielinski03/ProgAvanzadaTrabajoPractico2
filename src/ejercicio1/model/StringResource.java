package ejercicio1.model;

/**
 * Created by leonardo on 04/04/2015.
 */
public enum StringResource {
    SIX(new StringNumber(6, "Six")),
    FIVE(new StringNumber(5, "Five")),
    FOUR(new StringNumber(4, "Four")),
    TREE(new StringNumber(3, "Tree")),
    TWO(new StringNumber(2, "Two")),
    ONE(new StringNumber(1, "One"));

    private StringNumber value;

    StringResource(StringNumber value) {
        this.value = value;
    }

    public StringNumber getStringNumber() {
        return this.value;
    }
}
