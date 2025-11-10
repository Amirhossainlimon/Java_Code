public class InsertString {
    public static void main(String[] args) {
        String original = "I love Java.";
        String insert = "really ";
        
        int position = original.indexOf(" ") + 1; 

        String result = original.substring(0, position) 
         + insert + original.substring(position);
        System.out.println("After insertion: " + result);
    }
}
