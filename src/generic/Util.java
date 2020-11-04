package generic;

public class Util {

    public static <T> Box<T> boxing() {

        Box<T> box = new Box();

        return box;
    }
}
