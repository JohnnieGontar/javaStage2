package hm02;

public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException() {
        super("Invalid array size, required 4x4");
    }

}
