public class StringIdentifier {
    public static void main(String[] args) {
        String str = "OpenAI";
        int id = str.hashCode();
        System.out.println("Unique identifier for \"" + str + "\" is: " + id);
    }
}
