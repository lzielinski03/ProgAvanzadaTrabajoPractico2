package ejercicio1.model;

/**
 * Created by leonardo on 03/04/2015.
 */
public class StringNumber {

    private int number;
    private String stringValue;

    public StringNumber() {
    }

    public StringNumber(int number, String stringValue) {
        this.number = number;
        this.stringValue = stringValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
