public class StringManipulationTest{
    public static void main(String[] args){
        StringManipulation manipulator = new StringManipulation();
        String str = manipulator.trimAndConcat("    Hello    ", "    World    ");
        System.out.println(str);
        Integer a = manipulator.getIndexOrNull("Coding", 'o');
        Integer b = manipulator.getIndexOrNull("Hello World", 'o');
        Integer c = manipulator.getIndexOrNull("Hi", 'a');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulator.getIndexOrNull2(word, subString);
        Integer e = manipulator.getIndexOrNull2(word, notSubString);
        System.out.println(d);
        System.out.println(e);
    }
}