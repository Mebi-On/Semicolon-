println("""
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



        mainMenuInput = int(input())
        match (mainMenuInput) {
            case 1 -> {
                println(
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
                        """
                );
                int phoneBookMenuInput = int(input())
                switch (phoneBookMenuInput) {
                    case 1 ->
                        println("Search selected.");
                    case 2 ->
                        println("Service Nos. selected.");
                    case 3 ->
                        println("Add name selected.");
                    case 4 ->
                        println("Erase selected.");
                    case 5 ->
                        println("Edit selected.");
                    case 6 ->
                        println("Assign tone selected.");
                    case 7 ->
                        println("Send b'card selected.");
                    case 8 -> {
                        println(
                                """
                    Options selected.
                    Phone book Options menu:
                    1. Type of view
                    2. Memory status
                    0. Back to previous menu.
                        """
                        );

                        int phoneBookOptionsMenuInput = int(input())
                        switch (phoneBookOptionsMenuInput) {
                            case 1 ->
                                println("Type of view selected.");
                            case 2 ->
                                println("Memory status selected.");
                            case 0 ->
                                println("Returning to previous menu.");
                            default ->
                                println("Invalid, Please try again.");

                        }
                    }
                    case 9 ->
                        println("Speed dials selected.");
                    case 10 ->
                        println("Voice tags selected.");
                    case 0 ->
                        println("Returning to previous menu.");
                    default ->
                        println("Invalid, Please try again.");
                }
            }

            case 2 -> {
                println(
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

                    Enter here:
                        """
                );
                int messagesMenuInput = int(input())
                switch (messagesMenuInput) {
                    case 1 ->
                        println("Write messages selected.");
                    case 2 ->
                        println("Inbox selected.");
                    case 3 ->
                        println("Outbox selected.");
                    case 4 ->
                        println("Picture messages selected.");
                    case 5 ->
                        println("Templates selected.");
                    case 6 ->
                        println("Smileys selected.");
                    case 7 -> {
                        println(
                                """
                            Message settings selected.
                            Message setting menu:
                            1. Set 1^2
                            2. Common^3
                            0. Back to previous menu.
                                """
                        );

                        int messagaeSettingMenuInput = int(input())
                        switch (messagaeSettingMenuInput) {
                            case 1 -> {
                                println(
                                        """
                            Set 1^2 selected.
                            Set 1^2 menu:
                            1. Message center number
                            2. Messages sent as
                            3. Message validity
                            0. Back to previous menu.
                            """
                                );

                                int set1MenuInput = int(input())
                                switch (set1MenuInput) {
                                    case 1 ->
                                        println("Message center number selected.");
                                    case 2 ->
                                        println("Messages sent as");
                                    case 3 ->
                                        println("Message validity");
                                    case 0 ->
                                        println("Returning to previous menu.");
                                    default ->
                                        println("Invalid, Please try again.");

                                }
                            }
                            case 2 -> {
                                println(
                                        """
                                    Common^3 selected.
                                    Common^3 menu:
                                    1. Delivery reports
                                    2. Reply via same center
                                    3. Character support
                                    0. Back to previous menu.
                                    """
                                );

                                int common3MenuInput = int(input())
                                switch (common3MenuInput) {
                                    case 1 ->
                                        println("Delivery reports");
                                    case 2 ->
                                        println("Reply via same center");
                                    case 3 ->
                                        println("Character support");
                                    case 0 ->
                                        println("Returning to previous menu.");
                                    default ->
                                        println("Invalid, Please try again.");

                                }
                            }
                            case 0 ->
                                println("Returning to previous menu.");
                            default ->
                                println("Invalid, Please try again.");

                        }
                    }
                    case 8 ->
                        println("Info Service selected.");
                    case 9 ->
                        println("Voice mailbox number selected.");
                    case 10 ->
                        println("Service command editor selected.");
                    case 0 ->
                        println("Returning to previous menu.");
                    default ->
                        println("Invalid, Please try again.");
                }
            }
            case 3 ->
                println("Chat selected.");
            case 4 -> {
                println(
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

                    Enter here:
                        """
                );
                int callRegisterMenuInput = int(input())
                switch (callRegisterMenuInput) {
                    case 1 ->
                        println("Missed calls selected.");
                    case 2 ->
                        println("Recived calls selected.");
                    case 3 ->
                        println("Dialled number selected.");
                    case 4 ->
                        println("Erase recent call lists selected.");
                    case 5 -> {
                        println(
                                """
                            Show call duration selected.
                            Show call duration menu:
                            1. Last call duration
                            2. All calls' duration
                            3. Recivied call' duration
                            4. Dialled calls' duration 
                            5. Clear timeers
                            0. Back to previous menu.

                            Enter here:
                                """
                        );
                        int callDurationMenuInput = int(input())
                        switch (callDurationMenuInput) {
                            case 1 ->
                                println("Last call duration selected.");
                            case 2 ->
                                println("All calls' duration selected.");
                            case 3 ->
                                println("Recivied call' duration selected.");
                            case 4 ->
                                println("Dialled calls' duration selected.");
                            case 5 ->
                                println("Clear timers selected.");
                            case 0 ->
                                println("Returning to previous menu.");
                            default ->
                                println("Invalid, Please try again.");
                        }
                    }
                    case 6 -> {
                        println(
                                """
                            Show call costs selected.
                            Show call costs menu:
                            1. Last call cost
                            2. All calls' cost
                            3. Clear counters
                            0. Back to previous menu.
                            """
                        );

                        int callCostMenuInput = int(input())
                        switch (callCostMenuInput) {
                            case 1 ->
                                println("Last call cost selected.");
                            case 2 ->
                                println("All calls' cost selected.");
                            case 3 ->
                                println("Clear counters");
                            case 0 ->
                                println("Returning to previous menu.");
                            default ->
                                println("Invalid, Please try again.");

                        }
                    }
                    case 7 -> {
                        println(
                                """
                            Call cost settings selected.
                            Call cost setting menu:
                            1. Call cost limit
                            2. Show cost in
                            0. Back to previous menu.
                                """
                        );

                        int callCostSettingMenuInput = int(input())
                        switch (callCostSettingMenuInput) {
                            case 1 ->
                                println("Call cost limit selected.");
                            case 2 ->
                                println("Show call cost in selected.");
                            case 0 ->
                                println("Returning to previous menu.");
                            default ->
                                println("Invalid, Please try again.");

                        }
                    }
                    case 8 ->
                        println("Prepaid credit selected.");
                    case 0 ->
                        println("Returning to previous menu.");
                    default ->
                        println("Invalid, Please try again.");
                }
            }
            case 5 -> {
                println(
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
                        """
                );
                int tonesMenuInput = int(input())
                switch (tonesMenuInput) {
                    case 1 ->
                        println("Ringing tone selected.");
                    case 2 ->
                        println("Ringing volume selected.");
                    case 3 ->
                        println("Incoming call alert selected.");
                    case 4 ->
                        println("Composer selected.");
                    case 5 ->
                        println("Message alert tone selected.");
                    case 6 ->
                        println("Keypad tones selected.");
                    case 7 ->
                        println("Warning and game tones selected.");
                    case 8 ->
                        println("Vibrating alert menu:");
                    case 9 ->
                        println("Screen saver selected.");
                    case 0 ->
                        println("Returning to previous menu.");
                    default ->
                        println("Invalid, Please try again.");
                }
            }
            case 6 -> {
                println(
                        """
                    Settings selected.
                    Settings menu:
                    1. Call settings
                    2. Phone settings
                    3. Security settings
                    4. Restore factory settings
                    0. Back to previous menu.
                        """
                );
                int settingsMenuInput = int(input())
                switch (settingsMenuInput) {
                    case 1 -> {
                        println(
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
    
                                """
                        );
                        int callSettingMenuInput = int(input())
                        switch (callSettingMenuInput) {
                            case 1 ->
                                println("Automatic redial selected.");
                            case 2 ->
                                println("Ringing volume selected.");
                            case 3 ->
                                println("Call waiting options selected.");
                            case 4 ->
                                println("Own number sending selected.");
                            case 5 ->
                                println("Phone line in use selected.");
                            case 6 ->
                                println("Automatic answer selected.");
                            case 0 ->
                                println("Returning to previous menu.");
                            default ->
                                println("Invalid, Please try again.");
                        }

                    }
                    case 2 -> {
                        println(
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
                            """
                        );
                        int phoneSettingMenuInput = int(input())
                        switch (phoneSettingMenuInput) {
                            case 1 ->
                                println("Language selected.");
                            case 2 ->
                                println("Cell info display selected.");
                            case 3 ->
                                println("Welcome note selected.");
                            case 4 ->
                                println("Network selection selected.");
                            case 5 ->
                                println("Lights selected.");
                            case 6 ->
                                println("Confirm SIM service actions selected.");
                            case 0 ->
                                println("Returning to previous menu.");
                            default ->
                                println("Invalid, Please try again.");
                        }

                    }
                    case 3 -> {
                        println(
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
                            
                                        """
                        );
                        int securitySettingMenuInput = int(input())
                        switch (securitySettingMenuInput) {
                            case 1 ->
                                println("PIN code request selected.");
                            case 2 ->
                                println("Call barring service selected.");
                            case 3 ->
                                println("Fixed dialling selected.");
                            case 4 ->
                                println("Closed user group selected.");
                            case 5 ->
                                println("Phone security selected.");
                            case 6 ->
                                println("Change access codes selected.");
                            case 0 ->
                                println("Returning to previous menu.");
                            default ->
                                println("Invalid, Please try again.");
                        }
                    }
                    case 4 ->
                        println("Restore factory settings.");
                    case 0 ->
                        println("Returning to previous menu.");
                    default ->
                        println("Invalid, Please try again.");
                }
            }
            case 7 ->
                println("Call divert selected.");
            case 8 ->
                println("Games selected.");
            case 9 ->
                println("Calculator selected.");
            case 10 ->
                println("Reminders selected.");
            case 11 -> {
                println(
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
                        """
                );
                int clockMenuInput = int(input())
                switch (clockMenuInput) {
                    case 1 ->
                        println("Alarm clock selected.");
                    case 2 ->
                        println("Clock settings selected.");
                    case 3 ->
                        println("Date settings selected.");
                    case 4 ->
                        println("Stop watch selected.");
                    case 5 ->
                        println("Countdown timer selected.");
                    case 6 ->
                        println("Auto update of date and time selected.");
                    case 0 ->
                        println("Returning to previous menu.");
                    default ->
                        println("Invalid, Please try again.");
                }
            }
            case 12 ->
                println("Profiles selected.");
            case 13 ->
                println("SIM services selected.");
            default ->
                println("Invalid, Please try again.");
        }

    }
}
