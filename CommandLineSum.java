 class CommandLineSum {
    public static void main(String[] args) {
        int sum = 0;
        
        // Loop through all the command line arguments
        for (int i = 0; i < args.length; i++) {
            try {
                // Parse the argument as an integer and add it to the sum
                int num = Integer.parseInt(args[i]);
                sum += num;
            } catch (NumberFormatException e) {
                // If the argument is not a valid integer, ignore it
                System.out.println("Argument \"" + args[i] + "\" is not a valid integer. Ignoring it.");
            }
        }
        
        System.out.println("Sum of integers passed from command line: " + sum);
    }
}
