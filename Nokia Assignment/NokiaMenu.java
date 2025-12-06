
import java.util.Scanner;

public class NokiaMenu {

    public static void main(String[] args) {
        System.out.print("""
        getNokiaMenu
        1. Phone book
        2. Messages
        3. Chat
        4. Call register
        5. Tones
        6. Settings
        7. Call divert
        8. Games
        9. Calculator
        10. Reminders
        11. Clock
        12. Profiles
        13. SIM services
        """);

        Scanner input = new Scanner(System.in);

        int mainMenuInput = input.nextInt();
        switch (mainMenuInput) {
            case 1 -> {
                System.out.print(
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
                    8. Options
                    9. Speed dials
                    10. Voice tags
                    0. Back to main menu
                        """
                );
                int phoneBookMenuInput = input.nextInt();
                switch (phoneBookMenuInput) {
                    case 1 ->
                        System.out.print("Search selected.");
                    case 2 ->
                        System.out.print("Service Nos. selected.");
                    case 3 ->
                        System.out.print("Add name selected.");
                    case 4 ->
                        System.out.print("Erase selected.");
                    case 5 ->
                        System.out.print("Edit selected.");
                    case 6 ->
                        System.out.print("Assign tone selected.");
                    case 7 ->
                        System.out.print("Send b'card selected.");
                    case 8 -> {
                        System.out.print(
                                """
                    Options selected.
                    Phone book Options menu:
                    1. Type of view
                    2. Memory status
                    0. Back to main menu
                        """
                        );

                        int phoneBookOptionsMenuInput = input.nextInt();
                        switch (phoneBookOptionsMenuInput) {
                            case 1 ->
                                System.out.print("Type of view selected.");
                            case 2 ->
                                System.out.print("Memory status selected.");
                            case 0 ->
                                System.out.print("Returning to main menu.");
                            default ->
                                System.out.print("Invalid, Please try again.");

                        }
                    }
                    case 9 ->
                        System.out.print("Speed dials selected.");
                    case 10 ->
                        System.out.print("Voice tags selected.");
                    case 0 ->
                        System.out.print("Returning to main menu.");
                    default ->
                        System.out.print("Invalid, Please try again.");
                }
            }

            case 2 -> {
                System.out.print(
                        """
                    Messages selected.
                    Messages menu:
                    1. Write messages
                    2. Inbox
                    3. Outbox
                    4. Picture messages
                    5. Templates
                    6. Smileys
                    7. Message settings 
                    8. Info Service
                    9. Voice mailbox number
                    10. Service command editor
                    0. Back to main menu

                    Enter here:
                        """
                );
                int messagesMenuInput = input.nextInt();
                switch (messagesMenuInput) {
                    case 1 ->
                        System.out.print("Write messages selected.");
                    case 2 ->
                        System.out.print("Inbox selected.");
                    case 3 ->
                        System.out.print("Outbox selected.");
                    case 4 ->
                        System.out.print("Picture messages selected.");
                    case 5 ->
                        System.out.print("Templates selected.");
                    case 6 ->
                        System.out.print("Smileys selected.");
                    case 7 -> {
                        System.out.print(
                                """
                            Message settings selected.
                            Message setting menu:
                            1. Set 1^2
                            2. Common^3
                            0. Back to main menu
                                """
                        );

                        int messagaeSettingMenuInput = input.nextInt();
                        switch (messagaeSettingMenuInput) {
                            case 1 -> {
                                System.out.print(
                                        """
                            Set 1^2 selected.
                            Set 1^2 menu:
                            1. Message center number
                            2. Messages sent as
                            3. Message validity
                            0. Back to main menu
                            """
                                );

                                int set1MenuInput = input.nextInt();
                                switch (set1MenuInput) {
                                    case 1 ->
                                        System.out.print("Message center number selected.");
                                    case 2 ->
                                        System.out.print("Messages sent as");
                                    case 3 ->
                                        System.out.print("Message validity");
                                    case 0 ->
                                        System.out.print("Returning to main menu.");
                                    default ->
                                        System.out.print("Invalid, Please try again.");

                                }
                            }
                            case 2 -> {
                                System.out.print(
                                        """
                                    Common^3 selected.
                                    Common^3 menu:
                                    1. Delivery reports
                                    2. Reply via same center
                                    3. Character support
                                    0. Back to main menu
                                    """
                                );

                                int common3MenuInput = input.nextInt();
                                switch (common3MenuInput) {
                                    case 1 ->
                                        System.out.print("Delivery reports");
                                    case 2 ->
                                        System.out.print("Reply via same center");
                                    case 3 ->
                                        System.out.print("Character support");
                                    case 0 ->
                                        System.out.print("Returning to main menu.");
                                    default ->
                                        System.out.print("Invalid, Please try again.");

                                }
                            }
                            case 0 ->
                                System.out.print("Returning to main menu.");
                            default ->
                                System.out.print("Invalid, Please try again.");

                        }
                    }
                    case 8 ->
                        System.out.print("Info Service selected.");
                    case 9 ->
                        System.out.print("Voice mailbox number selected.");
                    case 10 ->
                        System.out.print("Service command editor selected.");
                    case 0 ->
                        System.out.print("Returning to main menu.");
                    default ->
                        System.out.print("Invalid, Please try again.");
                }
            }
            case 3 ->
                System.out.print("Chat selected.");
            case 4 -> {
                System.out.print(
                        """
                    Call register selected.
                    Call register menu:
                    1. Missed calls
                    2. Received calls
                    3. Dialled number
                    4. Erase recent call lists
                    5. Show call duration
                    6. Show call costs
                    7. Call cost settings
                    8. Prepaid credit
                    0. Back to main menu

                    Enter here:
                        """
                );
                int callRegisterMenuInput = input.nextInt();
                switch (callRegisterMenuInput) {
                    case 1 ->
                        System.out.print("Missed calls selected.");
                    case 2 ->
                        System.out.print("Recived calls selected.");
                    case 3 ->
                        System.out.print("Dialled number selected.");
                    case 4 ->
                        System.out.print("Erase recent call lists selected.");
                    case 5 -> {
                        System.out.print(
                                """
                            Show call duration selected.
                            Show call duration menu:
                            1. Last call duration
                            2. All calls' duration
                            3. Recivied call' duration
                            4. Dialled calls' duration 
                            5. Clear timeers
                            0. Back to main menu

                            Enter here:
                                """
                        );
                        int callDurationMenuInput = input.nextInt();
                        switch (callDurationMenuInput) {
                            case 1 ->
                                System.out.print("Last call duration selected.");
                            case 2 ->
                                System.out.print("All calls' duration selected.");
                            case 3 ->
                                System.out.print("Recivied call' duration selected.");
                            case 4 ->
                                System.out.print("Dialled calls' duration selected.");
                            case 5 ->
                                System.out.print("Clear timers selected.");
                            case 0 ->
                                System.out.print("Returning to main menu.");
                            default ->
                                System.out.print("Invalid, Please try again.");
                        }
                    }
                    case 6 -> {
                        System.out.print(
                                """
                            Show call costs selected.
                            Show call costs menu:
                            1. Last call cost
                            2. All calls' cost
                            3. Clear counters
                            0. Back to main menu
                            """
                        );

                        int callCostMenuInput = input.nextInt();
                        switch (callCostMenuInput) {
                            case 1 ->
                                System.out.print("Last call cost selected.");
                            case 2 ->
                                System.out.print("All calls' cost selected.");
                            case 3 ->
                                System.out.print("Clear counters");
                            case 0 ->
                                System.out.print("Returning to main menu.");
                            default ->
                                System.out.print("Invalid, Please try again.");

                        }
                    }
                    case 7 -> {
                        System.out.print(
                                """
                            Call cost settings selected.
                            Call cost setting menu:
                            1. Call cost limit
                            2. Show cost in
                            0. Back to main menu
                                """
                        );

                        int callCostSettingMenuInput = input.nextInt();
                        switch (callCostSettingMenuInput) {
                            case 1 ->
                                System.out.print("Call cost limit selected.");
                            case 2 ->
                                System.out.print("Show call cost in selected.");
                            case 0 ->
                                System.out.print("Returning to main menu.");
                            default ->
                                System.out.print("Invalid, Please try again.");

                        }
                    }
                    case 8 ->
                        System.out.print("Prepaid credit selected.");
                    case 0 ->
                        System.out.print("Returning to main menu.");
                    default ->
                        System.out.print("Invalid, Please try again.");
                }
            }
            case 5 -> {
                System.out.print(
                        """
                    Tones selected.
                    Tones menu:
                    1. Ringing tone
                    2. Ringing volume
                    3. Incoming call alert
                    4. Composer
                    5. Message alert tone
                    6. Keypad tones
                    7. Warning and game tones
                    8. Vibrating alert
                    9. Screen saver
                    0. Back to main menu
                        """
                );
                int tonesMenuInput = input.nextInt();
                switch (tonesMenuInput) {
                    case 1 ->
                        System.out.print("Ringing tone selected.");
                    case 2 ->
                        System.out.print("Ringing volume selected.");
                    case 3 ->
                        System.out.print("Incoming call alert selected.");
                    case 4 ->
                        System.out.print("Composer selected.");
                    case 5 ->
                        System.out.print("Message alert tone selected.");
                    case 6 ->
                        System.out.print("Keypad tones selected.");
                    case 7 ->
                        System.out.print("Warning and game tones selected.");
                    case 8 ->
                        System.out.print("Vibrating alert menu:");
                    case 9 ->
                        System.out.print("Screen saver selected.");
                    case 0 ->
                        System.out.print("Returning to main menu.");
                    default ->
                        System.out.print("Invalid, Please try again.");
                }
            }
            case 6 -> {
                System.out.print(
                        """
                    Settings selected.
                    Settings menu:
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
                    0. Back to main menu
                        """
                );
                int settingsMenuInput = input.nextInt();
                switch (settingsMenuInput) {
                    case 1 -> {
                        System.out.print(
                                """
                                Call settings selected."
                                Call settings menu:
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                0. Back to main menu
    
                                """
                        );
                        int callSettingMenuInput = input.nextInt();
                        switch (callSettingMenuInput) {
                            case 1 ->
                                System.out.print("Automatic redial selected.");
                            case 2 ->
                                System.out.print("Ringing volume selected.");
                            case 3 ->
                                System.out.print("Call waiting options selected.");
                            case 4 ->
                                System.out.print("Own number sending selected.");
                            case 5 ->
                                System.out.print("Phone line in use selected.");
                            case 6 ->
                                System.out.print("Automatic answer selected.");
                            case 0 ->
                                System.out.print("Returning to main menu.");
                            default ->
                                System.out.print("Invalid, Please try again.");
                        }

                    }
                    case 2 -> {
                        System.out.print(
                                """
                                Phone settings selected.
                                Phone settings menu:
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                0. Back to main menu
                            """
                        );
                        int phoneSettingMenuInput = input.nextInt();
                        switch (phoneSettingMenuInput) {
                            case 1 ->
                                System.out.print("Language selected.");
                            case 2 ->
                                System.out.print("Cell info display selected.");
                            case 3 ->
                                System.out.print("Welcome note selected.");
                            case 4 ->
                                System.out.print("Network selection selected.");
                            case 5 ->
                                System.out.print("Lights selected.");
                            case 6 ->
                                System.out.print("Confirm SIM service actions selected.");
                            case 0 ->
                                System.out.print("Returning to main menu.");
                            default ->
                                System.out.print("Invalid, Please try again.");
                        }

                    }
                    case 3 -> {
                        System.out.print(
                                """
                                Security settings selected.
                                Security settings menu:
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                0. Back to main menu
                            
                                        """
                        );
                        int securitySettingMenuInput = input.nextInt();
                        switch (securitySettingMenuInput) {
                            case 1 ->
                                System.out.print("PIN code request selected.");
                            case 2 ->
                                System.out.print("Call barring service selected.");
                            case 3 ->
                                System.out.print("Fixed dialling selected.");
                            case 4 ->
                                System.out.print("Closed user group selected.");
                            case 5 ->
                                System.out.print("Phone security selected.");
                            case 6 ->
                                System.out.print("Change access codes selected.");
                            case 0 ->
                                System.out.print("Returning to main menu.");
                            default ->
                                System.out.print("Invalid, Please try again.");
                        }
                    }
                    case 4 ->
                        System.out.print("Restore factory settings.");
                    case 0 ->
                        System.out.print("Returning to main menu.");
                    default ->
                        System.out.print("Invalid, Please try again.");
                }
            }
            case 7 ->
                System.out.print("Call divert selected.");
            case 8 ->
                System.out.print("Games selected.");
            case 9 ->
                System.out.print("Calculator selected.");
            case 10 ->
                System.out.print("Reminders selected.");
            case 11 -> {
                System.out.print(
                        """
                    Clock selected.
                    Clock menu:
                    1. Alarm clock
                    2. Clock settings
                    3. Date settings
                    4. Stop watch
                    5. Countdown timer
                    6. Auto update of date and time
                    0. Back to main menu
                        """
                );
                int clockMenuInput = input.nextInt();
                switch (clockMenuInput) {
                    case 1 ->
                        System.out.print("Alarm clock selected.");
                    case 2 ->
                        System.out.print("Clock settings selected.");
                    case 3 ->
                        System.out.print("Date settings selected.");
                    case 4 ->
                        System.out.print("Stop watch selected.");
                    case 5 ->
                        System.out.print("Countdown timer selected.");
                    case 6 ->
                        System.out.print("Auto update of date and time selected.");
                    case 0 ->
                        System.out.print("Returning to main menu.");
                    default ->
                        System.out.print("Invalid, Please try again.");
                }
            }
            case 12 ->
                System.out.print("Profiles selected.");
            case 13 ->
                System.out.print("SIM services selected.");
            default ->
                System.out.print("Invalid, Please try again.");
        }

    }
}
