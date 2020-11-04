package generic;

public class BoxingMethodExam {
    public static void main(String[] args) {

        Box<Integer> box1 = Util.boxing();
        box1.setT(100);
        int value = box1.getT();
        System.out.println(value);

        Box<String> box2 = Util.boxing();
        box2.setT("abc");
        String values = box2.getT();
        System.out.println(values);
    }
}
