class Main {
    public static void main(String[] args) {
        String n = "()()()()"; 
        int top = -1; // Declare top for stack operations
        char[] stack = new char[n.length()]; // Create a stack to store opening parentheses

        // Loop through each character in the string
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i); // Get the character at the current position
            if(c=='('){
                System.out.println("Balanced!");
                return ;
            }
            else{
                System.out.println("Unbalanced!");
                return;
            }

        }
        
        }
}
