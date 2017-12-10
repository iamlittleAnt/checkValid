public class CheckValid {

    public static int validNumber() throws Exception {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter numer: ");
                int input = sc.nextInt();
                return (input);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Number only!!!");
            }
        }
    }

    public static int validPositionWithoutZero() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number: ");
                int input = sc.nextInt();
                try {
                    if (input <= 0) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Postive number only!!!");
                    continue;
                }
                return input;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Number only!!!");
            }
        }
    }
    
    public static int validPositive(){
        while (true) {            
            try {
                Scanner sc = new Scanner(System.in); 
                System.out.println("Enter number: ");
                int input = sc.nextInt();
                try {
                    if (input < 0){
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Positive number only!!!");
                    continue;
                }
                return input; 
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Number only!!!");
            }
        }
    }
}
