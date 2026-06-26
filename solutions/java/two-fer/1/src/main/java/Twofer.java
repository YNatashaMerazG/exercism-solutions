public class Twofer {
    public String twofer(String name) {
        // One for Do-yun, one for me.
        //One for you, one for me

        if (name == null){
            return "One for you, one for me.";
        } else {
            return "One for " + name + ", one for me.";
        }
    }
}
