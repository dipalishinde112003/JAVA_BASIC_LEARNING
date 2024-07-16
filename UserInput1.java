public class UserInput1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number:");

        // Read the input byte
        int input = System.in.read();

        // Check if the input is a digit (ASCII values for '0' to '9' are 48 to 57)
        
            System.out.println(input-48);
        

        // Consume the newline character
       // System.in.read();
    }
}
