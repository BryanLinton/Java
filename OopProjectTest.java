
public class OopProjectTest {
    public static void main(String[] args) {
        OopProject one = new OopProject();
        OopProject two = new OopProject("Lift");
        OopProject three = new OopProject("Lift2", "A box that rises up through a buildings");
        OopProject four = new OopProject("lift3", "A bigger box that rises up through a building", 1000000);

        one.elevatorPitch();
        two.elevatorPitch();
        three.elevatorPitch();
        four.elevatorPitch();
    }
}