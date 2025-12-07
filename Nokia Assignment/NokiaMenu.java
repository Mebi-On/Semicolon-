
import java.util.Scanner;

public class NokiaMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        mainloop:
        while (true) {
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

        Enter here: """
            );

            int mainMenuInput = input.nextInt();
            switch (mainMenuInput) {
                case 1 -> {
                    phonebookLoop:
                    while (true) {

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
                    0. Back to previous menu.

                    Enter here: """
                        );

                        int phoneBookMenuInput = input.nextInt();
                        switch (phoneBookMenuInput) {
                            case 1 ->
                                System.out.println("Search selected.");
                            case 2 ->
                                System.out.println("Service Nos. selected.");
                            case 3 ->
                                System.out.println("Add name selected.");
                            case 4 ->
                                System.out.println("Erase selected.");
                            case 5 ->
                                System.out.println("Edit selected.");
                            case 6 ->
                                System.out.println("Assign tone selected.");
                            case 7 ->
                                System.out.println("Send b'card selected.");
                            case 8 -> {
                                phoneBookOptionsLoop:
                                while (true) {

                                    System.out.print(
                                            """
                    Options selected.
                    Phone book Options menu:
                    1. Type of view
                    2. Memory status
                    0. Back to previous menu.

                    Enter here: """
                                    );

                                    int phoneBookOptionsMenuInput = input.nextInt();
                                    switch (phoneBookOptionsMenuInput) {
                                        case 1 ->
                                            System.out.println("Type of view selected.");
                                        case 2 ->
                                            System.out.println("Memory status selected.");
                                        case 0 -> {
                                            System.out.println("Returning to previous menu.");
                                            break phoneBookOptionsLoop;
                                        }
                                        default ->
                                            System.out.println("Invalid, Please try again.");

                                    }
                                }
                            }
                            case 9 ->
                                System.out.println("Speed dials selected.");
                            case 10 ->
                                System.out.println("Voice tags selected.");
                            case 0 -> {
                                System.out.println("Returning to previous menu.");
                                break phonebookLoop;
                            }
                            default ->
                                System.out.println("Invalid, Please try again.");
                        }
                    }
                }

                case 2 -> {
                    messagesLoop:
                    while (true) {

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
                    0. Back to previous menu.

                    Enter here: """
                        );

                        int messagesMenuInput = input.nextInt();
                        switch (messagesMenuInput) {
                            case 1 ->
                                System.out.println("Write messages selected.");
                            case 2 ->
                                System.out.println("Inbox selected.");
                            case 3 ->
                                System.out.println("Outbox selected.");
                            case 4 ->
                                System.out.println("Picture messages selected.");
                            case 5 ->
                                System.out.println("Templates selected.");
                            case 6 ->
                                System.out.println("Smileys selected.");
                            case 7 -> {
                                messageSettingsLoop:
                                while (true) {
                                    System.out.print(
                                            """
                            Message settings selected.
                            Message setting menu:
                            1. Set 1^2
                            2. Common^3
                            0. Back to previous menu.

                            Enter here: """
                                    );

                                    int messagaeSettingMenuInput = input.nextInt();
                                    switch (messagaeSettingMenuInput) {
                                        case 1 -> {
                                            set1Loop:
                                            while (true) {

                                                System.out.print(
                                                        """
                            Set 1^2 selected.
                            Set 1^2 menu:
                            1. Message center number
                            2. Messages sent as
                            3. Message validity
                            0. Back to previous menu.

                            Enter here: """
                                                );

                                                int set1MenuInput = input.nextInt();
                                                switch (set1MenuInput) {
                                                    case 1 ->
                                                        System.out.println("Message center number selected.");
                                                    case 2 ->
                                                        System.out.println("Messages sent as");
                                                    case 3 ->
                                                        System.out.println("Message validity");
                                                    case 0 -> {
                                                        System.out.println("Returning to previous menu.");
                                                        break set1Loop;
                                                    }
                                                    default ->
                                                        System.out.println("Invalid, Please try again.");

                                                }
                                            }
                                        }
                                        case 2 -> {
                                            common3Loop:
                                            while (true) {

                                                System.out.print(
                                                        """
                                    Common^3 selected.
                                    Common^3 menu:
                                    1. Delivery reports
                                    2. Reply via same center
                                    3. Character support
                                    0. Back to previous menu.

                                    Enter here: """
                                                );

                                                int common3MenuInput = input.nextInt();
                                                switch (common3MenuInput) {
                                                    case 1 ->
                                                        System.out.println("Delivery reports");
                                                    case 2 ->
                                                        System.out.println("Reply via same center");
                                                    case 3 ->
                                                        System.out.println("Character support");
                                                    case 0 -> {
                                                        System.out.println("Returning to previous menu.");
                                                        break common3Loop;
                                                    }
                                                    default ->
                                                        System.out.println("Invalid, Please try again.");

                                                }
                                            }
                                        }
                                        case 0 -> {
                                            System.out.println("Returning to previous menu.");
                                            break messageSettingsLoop;
                                        }
                                        default ->
                                            System.out.println("Invalid, Please try again.");

                                    }
                                }
                            }
                            case 8 ->
                                System.out.println("Info Service selected.");
                            case 9 ->
                                System.out.println("Voice mailbox number selected.");
                            case 10 ->
                                System.out.println("Service command editor selected.");
                            case 0 -> {
                                System.out.println("Returning to previous menu.");
                                break messagesLoop;
                            }
                            default ->
                                System.out.println("Invalid, Please try again.");
                        }
                    }
                }
                case 3 ->
                    System.out.println("Chat selected.");
                case 4 -> {
                    callRegisterLoop:
                    while (true) {
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
                    0. Back to previous menu.

                    Enter here: """
                        );

                        int callRegisterMenuInput = input.nextInt();
                        switch (callRegisterMenuInput) {
                            case 1 ->
                                System.out.println("Missed calls selected.");
                            case 2 ->
                                System.out.println("Recived calls selected.");
                            case 3 ->
                                System.out.println("Dialled number selected.");
                            case 4 ->
                                System.out.println("Erase recent call lists selected.");
                            case 5 -> {
                                callDurationLoop:
                                while (true) {
                                    System.out.print(
                                            """
                            Show call duration selected.
                            Show call duration menu:
                            1. Last call duration
                            2. All calls' duration
                            3. Recivied call' duration
                            4. Dialled calls' duration 
                            5. Clear timeers
                            0. Back to previous menu.

                            Enter here: """
                                    );

                                    int callDurationMenuInput = input.nextInt();
                                    switch (callDurationMenuInput) {
                                        case 1 ->
                                            System.out.println("Last call duration selected.");
                                        case 2 ->
                                            System.out.println("All calls' duration selected.");
                                        case 3 ->
                                            System.out.println("Recivied call' duration selected.");
                                        case 4 ->
                                            System.out.println("Dialled calls' duration selected.");
                                        case 5 ->
                                            System.out.println("Clear timers selected.");
                                        case 0 -> {
                                            System.out.println("Returning to previous menu.");
                                            break callDurationLoop;
                                        }
                                        default ->
                                            System.out.println("Invalid, Please try again.");
                                    }
                                }
                            }
                            case 6 -> {
                                callCostLoop:
                                while (true) {
                                    System.out.print(
                                            """
                            Show call costs selected.
                            Show call costs menu:
                            1. Last call cost
                            2. All calls' cost
                            3. Clear counters
                            0. Back to previous menu.
                            Enter here: """
                                    );

                                    int callCostMenuInput = input.nextInt();
                                    switch (callCostMenuInput) {
                                        case 1 ->
                                            System.out.println("Last call cost selected.");
                                        case 2 ->
                                            System.out.println("All calls' cost selected.");
                                        case 3 ->
                                            System.out.println("Clear counters");
                                        case 0 -> {
                                            System.out.println("Returning to previous menu.");
                                            break callCostLoop;
                                        }
                                        default ->
                                            System.out.println("Invalid, Please try again.");

                                    }
                                }
                            }
                            case 7 -> {
                                callCostSettingLoop:
                                while (true) {
                                    System.out.print(
                                            """
                            Call cost settings selected.
                            Call cost setting menu:
                            1. Call cost limit
                            2. Show cost in
                            0. Back to previous menu.
                                Enter here: """
                                    );

                                    int callCostSettingMenuInput = input.nextInt();
                                    switch (callCostSettingMenuInput) {
                                        case 1 ->
                                            System.out.println("Call cost limit selected.");
                                        case 2 ->
                                            System.out.println("Show call cost in selected.");
                                        case 0 -> {
                                            System.out.println("Returning to previous menu.");
                                            break callCostSettingLoop;
                                        }
                                        default ->
                                            System.out.println("Invalid, Please try again.");

                                    }
                                }
                            }
                            case 8 ->
                                System.out.println("Prepaid credit selected.");
                            case 0 -> {
                                System.out.println("Returning to previous menu.");
                                break callRegisterLoop;
                            }
                            default ->
                                System.out.println("Invalid, Please try again.");
                        }
                    }
                }
                case 5 -> {
                    tonesLoop:
                    while (true) {
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
                    0. Back to previous menu.

                    Enter here: """
                        );

                        int tonesMenuInput = input.nextInt();
                        switch (tonesMenuInput) {
                            case 1 ->
                                System.out.println("Ringing tone selected.");
                            case 2 ->
                                System.out.println("Ringing volume selected.");
                            case 3 ->
                                System.out.println("Incoming call alert selected.");
                            case 4 ->
                                System.out.println("Composer selected.");
                            case 5 ->
                                System.out.println("Message alert tone selected.");
                            case 6 ->
                                System.out.println("Keypad tones selected.");
                            case 7 ->
                                System.out.println("Warning and game tones selected.");
                            case 8 ->
                                System.out.println("Vibrating alert menu:");
                            case 9 ->
                                System.out.println("Screen saver selected.");
                            case 0 -> {
                                System.out.println("Returning to previous menu.");
                                break tonesLoop;
                            }
                            default ->
                                System.out.println("Invalid, Please try again.");
                        }
                    }
                }
                case 6 -> {
                    settingsLoop:
                    while (true) {
                        System.out.print(
                                """
                    Settings selected.
                    Settings menu:
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
                    0. Back to previous menu.
                    Enter here: """
                        );

                        int settingsMenuInput = input.nextInt();
                        switch (settingsMenuInput) {
                            case 1 -> {
                                callSettingMenuLoop:
                                while (true) {
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
                                0. Back to previous menu.
    
                                Enter here: """
                                    );

                                    int callSettingMenuInput = input.nextInt();
                                    switch (callSettingMenuInput) {
                                        case 1 ->
                                            System.out.println("Automatic redial selected.");
                                        case 2 ->
                                            System.out.println("Ringing volume selected.");
                                        case 3 ->
                                            System.out.println("Call waiting options selected.");
                                        case 4 ->
                                            System.out.println("Own number sending selected.");
                                        case 5 ->
                                            System.out.println("Phone line in use selected.");
                                        case 6 ->
                                            System.out.println("Automatic answer selected.");
                                        case 0 -> {
                                            System.out.println("Returning to previous menu.");
                                            break callSettingMenuLoop;
                                        }
                                        default ->
                                            System.out.println("Invalid, Please try again.");
                                    }

                                }
                            }
                            case 2 -> {
                                phoneSettingLoop:
                                while (true) {
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
                                0. Back to previous menu.
                                Enter here: """
                                    );

                                    int phoneSettingMenuInput = input.nextInt();
                                    switch (phoneSettingMenuInput) {
                                        case 1 ->
                                            System.out.println("Language selected.");
                                        case 2 ->
                                            System.out.println("Cell info display selected.");
                                        case 3 ->
                                            System.out.println("Welcome note selected.");
                                        case 4 ->
                                            System.out.println("Network selection selected.");
                                        case 5 ->
                                            System.out.println("Lights selected.");
                                        case 6 ->
                                            System.out.println("Confirm SIM service actions selected.");
                                        case 0 -> {
                                            System.out.println("Returning to previous menu.");
                                            break phoneSettingLoop;
                                        }
                                        default ->
                                            System.out.println("Invalid, Please try again.");
                                    }

                                }
                            }
                            case 3 -> {
                                securitySettingLoop:
                                while (true) {
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
                                0. Back to previous menu.
                            
                                Enter here:"""
                                    );

                                    int securitySettingMenuInput = input.nextInt();
                                    switch (securitySettingMenuInput) {
                                        case 1 ->
                                            System.out.println("PIN code request selected.");
                                        case 2 ->
                                            System.out.println("Call barring service selected.");
                                        case 3 ->
                                            System.out.println("Fixed dialling selected.");
                                        case 4 ->
                                            System.out.println("Closed user group selected.");
                                        case 5 ->
                                            System.out.println("Phone security selected.");
                                        case 6 ->
                                            System.out.println("Change access codes selected.");
                                        case 0 -> {
                                            System.out.println("Returning to previous menu.");
                                            break securitySettingLoop;
                                        }
                                        default ->
                                            System.out.println("Invalid, Please try again.");
                                    }
                                }
                            }
                            case 4 ->
                                System.out.println("Restore factory settings.");
                            case 0 -> {
                                System.out.println("Returning to previous menu.");
                                break settingsLoop;
                            }
                            default ->
                                System.out.println("Invalid, Please try again.");
                        }
                    }
                }
                case 7 ->
                    System.out.println("Call divert selected.");
                case 8 ->
                    System.out.println("Games selected.");
                case 9 ->
                    System.out.println("Calculator selected.");
                case 10 ->
                    System.out.println("Reminders selected.");
                case 11 -> {
                    clockMenuLoop:
                    while (true) {
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
                    0. Back to previous menu.
                    Enter here: """
                        );

                        int clockMenuInput = input.nextInt();
                        switch (clockMenuInput) {
                            case 1 ->
                                System.out.println("Alarm clock selected.");
                            case 2 ->
                                System.out.println("Clock settings selected.");
                            case 3 ->
                                System.out.println("Date settings selected.");
                            case 4 ->
                                System.out.println("Stop watch selected.");
                            case 5 ->
                                System.out.println("Countdown timer selected.");
                            case 6 ->
                                System.out.println("Auto update of date and time selected.");
                            case 0 -> {
                                System.out.println("Returning to previous menu.");
                                break clockMenuLoop;
                            }
                            default ->
                                System.out.println("Invalid, Please try again.");
                        }
                    }
                }
                case 12 ->
                    System.out.println("Profiles selected.");
                case 13 ->
                    System.out.println("SIM services selected.");
                case 0 -> {
                    System.out.println("Exiting Nokia Menu. Goodbye!");
                    break mainloop;
                }
                default ->
                    System.out.println("Invalid, Please try again.");
            }
        }

    }
}
