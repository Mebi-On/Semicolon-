import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        mainloop:
            while (true) {

            System.out.println("""
        getNokiaMenu
        1. Phone book
        2. Messages
        """);

            int mainMenuInput = input.nextInt();
            switch (mainMenuInput) {
                case 1 -> {
                
                        System.out.println(
                                """
                    Phone book selected.
                    Phone book menu:
                    1. Search
                    2. Service Nos.
                    3. Add name
                    4. Erase
                    5. Edit
                    6. Assign tone
                    7. Send b'card
                    0. Back to previous menu.
                    
                        """
                        );
                        phonebookLoop:
                        while (true) {
                        int phoneBookMenuInput = input.nextInt();
                        switch (phoneBookMenuInput) {
                            case 1 ->{
                                System.out.println("Search selected.");
                                continue phonebookLoop;
                            }
                            case 2 ->{
                                System.out.println("Service Nos. selected.");
                            }
                            case 3 ->{
                                System.out.println("Add name selected.");
                            }
                            case 4 ->{
                                System.out.println("Erase selected.");
                            }
                            case 5 ->{
                                System.out.println("Edit selected.");
                            }
                            case 6 ->
                                System.out.println("Assign tone selected.");
                            case 7 ->
                                System.out.println("Send b'card selected.");
                            case 0->
                                {System.out.println("Returning to previous menu.");
                                break phonebookLoop;
                            }
                            default ->
                                System.out.println("Invalid, Please try again.");
                            
                                // while (true); break
                        }
                    }
                }
                    case 2 -> 
                        System.out.println("Messages selected.");

                    case 0 -> {
                        System.out.println("Exiting program. Goodbye!");
                    }
            
                default -> 
                        System.out.println("Invalid, Please try again.");
                }
            }
        }
    }
    
