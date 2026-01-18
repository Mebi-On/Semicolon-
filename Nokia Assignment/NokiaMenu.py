
def getNokiaMenu():
    while True:
                print(
"""
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
                        )

                main_menu_input = int(input())
                match main_menu_input:
                    case 1 :

                        while True:
                            print(
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
                                    )

                            phone_book_menu_input = int(input())
                            match phone_book_menu_input:
                                case 1 :
                                    print("Search selected.")
                                    return
                                case 2 :
                                    print("Service Nos. selected.")
                                    return
                                case 3 :
                                    print("Add name selected.")
                                    return
                                case 4 :
                                    print("Erase selected.")
                                    return
                                case 5 :
                                    print("Edit selected.")
                                    return
                                case 6 :
                                    print("Assign tone selected.")
                                    return
                                case 7 :
                                    print("Send b'card selected.")
                                    return
                                case 8 :

                                    while True:

                                        print(
"""
Options selected.
Phone book Options menu:
1. Type of view
2. Memory status
0. Back to previous menu.

Enter here: """
                                                )
                                        
                                        phone_book_options_menu_input = int(input())
                                        match phone_book_options_menu_input:
                                            case 1 :
                                                print("Type of view selected.")
                                                return
                                            case 2 :
                                                print("Memory status selected.")
                                                return
                                            case 0 :
                                                print("Returning to previous menu.")
                                                break
                                            case _ :
                                                print("Invalid, Please try again.")

                                case 9 :
                                    print("Speed dials selected.")
                                    return
                                case 10 :
                                    print("Voice tags selected.")
                                    return
                                case 0 :
                                    print("Returning to previous menu.")
                                    break
                                case _ :
                                    print("Invalid, Please try again.")

                    case 2 :

                        while True:
                            print(
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
                                    )

                            messages_menu_input = int(input())
                            match messages_menu_input:
                                case 1 :
                                    print("Write messages selected.")
                                    return
                                case 2 :
                                    print("Inbox selected.")
                                    return
                                case 3 :
                                    print("Outbox selected.")
                                    return
                                case 4 :
                                    print("Picture messages selected.")
                                    return
                                case 5 :
                                    print("Templates selected.")
                                    return
                                case 6 :
                                    print("Smileys selected.")
                                    return
                                case 7 :
                        
                                    while True:
                                        print(
"""
Message settings selected.
Message setting menu:
1. Set 1^2
2. Common^3
0. Back to previous menu.

Enter here: """
                                                )

                                        messagae_setting_menu_input = int(input())
                                        match messagae_setting_menu_input:
                                            case 1 :
                                                
                                                while True:
                                                    print(
"""
Set 1^2 selected.
Set 1^2 menu:
1. Message center number
2. Messages sent as
3. Message validity
0. Back to previous menu.

Enter here: """
                                                            )

                                                    set1_menu_input = int(input())
                                                    match set1_menu_input:
                                                        case 1 :
                                                            print("Message center number selected.")
                                                            return
                                                        case 2 :
                                                            print("Messages sent as")
                                                            return
                                                        case 3 :
                                                            print("Message validity")
                                                            return
                                                        case 0 :
                                                            print("Returning to previous menu.")
                                                            break
                                                        case _ :
                                                            print("Invalid, Please try again.")

                                            case 2 :

                                                while True:
                                                    print(
"""
Common^3 selected.
Common^3 menu:
1. Delivery reports
2. Reply via same center
3. Character support
0. Back to previous menu.

Enter here: """
                                                        )

                                                    common3_menu_input = int(input())
                                                    match common3_menu_input:
                                                        case 1 :
                                                            print("Delivery reports")
                                                            return
                                                        case 2 :
                                                            print("Reply via same center")
                                                            return
                                                        case 3 :
                                                            print("Character support")
                                                            return
                                                        case 0 :
                                                            print("Returning to previous menu.")
                                                            break
                                                        case _ :
                                                            print("Invalid, Please try again.")

                                            case 0 :
                                                print("Returning to previous menu.")
                                                break 
                                            
                                            case _ :
                                                print("Invalid, Please try again.")
                                
                                case 8 :
                                    print("Info Service selected.")
                                    return
                                case 9 :
                                    print("Voice mailbox number selected.")
                                    return
                                case 10 :
                                    print("Service command editor selected.")
                                    return
                                case 0 :
                                    print("Returning to previous menu.")
                                    break 
                                case _ :
                                    print("Invalid, Please try again.")

                    case 3 :
                        print("Chat selected.")
                        return
                    case 4 :

                        while True:
                            print(
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
                                    )

                            call_register_menu_input = int(input())
                            match call_register_menu_input:
                                case 1 :
                                    print("Missed calls selected.")
                                    return
                                case 2 :
                                    print("Recived calls selected.")
                                    return
                                case 3 :
                                    print("Dialled number selected.")
                                    return
                                case 4 :
                                    print("Erase recent call lists selected.")
                                    return
                                case 5 :
                                
                                    while True:
                                        print(
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
                                                )

                                        call_duration_menu_input = int(input())
                                        match call_duration_menu_input:
                                            case 1 :
                                                print("Last call duration selected.")
                                                return
                                            case 2 :
                                                print("All calls' duration selected.")
                                                return
                                            case 3 :
                                                print("Recivied call' duration selected.")
                                                return
                                            case 4 :
                                                print("Dialled calls' duration selected.")
                                                return
                                            case 5 :
                                                print("Clear timers selected.")
                                                return
                                            case 0 :
                                                print("Returning to previous menu.")
                                                break 
                                            case _ :
                                                print("Invalid, Please try again.")

                                case 6 :
        
                                    while True:
                                        print(
"""
Show call costs selected.
Show call costs menu:
1. Last call cost
2. All calls' cost
3. Clear counters
0. Back to previous menu.
Enter here: """
                                                )

                                        call_cost_menu_input = int(input())
                                        match call_cost_menu_input:
                                            case 1 :
                                                print("Last call cost selected.")
                                                return
                                            case 2 :
                                                print("All calls' cost selected.")
                                                return
                                            case 3 :
                                                print("Clear counters")
                                                return
                                            case 0 :
                                                print("Returning to previous menu.")
                                                break 
                                            case _ :
                                                print("Invalid, Please try again.")

                                case 7 :

                                    while True:
                                        print(
"""
Call cost settings selected.
Call cost setting menu:
1. Call cost limit
2. Show cost in
0. Back to previous menu.
Enter here: """
                                                )

                                        call_cost_setting_menu_input = int(input())
                                        match call_cost_setting_menu_input:
                                            case 1 :
                                                print("Call cost limit selected.")
                                                return
                                            case 2 :
                                                print("Show call cost in selected.")
                                                return
                                            case 0 :
                                                print("Returning to previous menu.")
                                                break 
                                            case _ :
                                                print("Invalid, Please try again.")

                                case 8 :
                                    print("Prepaid credit selected.")
                                    return
                                case 0 :
                                    print("Returning to previous menu.")
                                    break 
                                
                                case _ :
                                    print("Invalid, Please try again.")

                    case 5 :
            
                        while True:
                            print(
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
                                    )

                            tones_menu_input = int(input())
                            match tones_menu_input:
                                case 1 :
                                    print("Ringing tone selected.")
                                    return
                                case 2 :
                                    print("Ringing volume selected.")
                                    return
                                case 3 :
                                    print("Incoming call alert selected.")
                                    return
                                case 4 :
                                    print("Composer selected.")
                                    return
                                case 5 :
                                    print("Message alert tone selected.")
                                    return
                                case 6 :
                                    print("Keypad tones selected.")
                                    return
                                case 7 :
                                    print("Warning and game tones selected.")
                                    return
                                case 8 :
                                    print("Vibrating alert menu:")
                                    return
                                case 9 :
                                    print("Screen saver selected.")
                                    return
                                case 0 :
                                    print("Returning to previous menu.")
                                    break 
                                case _ :
                                    print("Invalid, Please try again.")

                    case 6 :

                        while True:
                            print(
"""
Settings selected.
Settings menu:
1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings
0. Back to previous menu.
Enter here: """
                                    )

                            settings_menu_input = int(input())
                            match settings_menu_input:
                                case 1 :
                            
                                    while True:
                                        print(
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
                                                )

                                        call_setting_menu_input = int(input())
                                        match call_setting_menu_input:
                                            case 1 :
                                                print("Automatic redial selected.")
                                                return
                                            case 2 :
                                                print("Ringing volume selected.")
                                                return
                                            case 3 :
                                                print("Call waiting options selected.")
                                                return
                                            case 4 :
                                                print("Own number sending selected.")
                                                return
                                            case 5 :
                                                print("Phone line in use selected.")
                                                return
                                            case 6 :
                                                print("Automatic answer selected.")
                                                return
                                            case 0 :
                                                print("Returning to previous menu.")
                                                break 
                                            case _ :
                                                print("Invalid, Please try again.")

                                case 2 :

                                    while True:
                                        print(
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
                                        )

                                        phone_setting_menu_input = int(input())
                                        match phone_setting_menu_input:
                                            case 1 :
                                                print("Language selected.")
                                                return
                                            case 2 :
                                                print("Cell info display selected.")
                                                return
                                            case 3 :
                                                print("Welcome note selected.")
                                                return
                                            case 4 :
                                                print("Network selection selected.")
                                                return
                                            case 5 :
                                                print("Lights selected.")
                                                return
                                            case 6 :
                                                print("Confirm SIM service actions selected.")
                                                return
                                            case 0 :
                                                print("Returning to previous menu.")
                                                break 
                                            case _ :
                                                print("Invalid, Please try again.")

                                case 3 :

                                    while True:
                                        print(
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
                                                )

                                        security_setting_menu_input = int(input())
                                        match security_setting_menu_input:
                                            case 1 :
                                                print("PIN code request selected.")
                                                return
                                            case 2 :
                                                print("Call barring service selected.")
                                                return
                                            case 3 :
                                                print("Fixed dialling selected.")
                                                return
                                            case 4 :
                                                print("Closed user group selected.")
                                                return
                                            case 5 :
                                                print("Phone security selected.")
                                                return
                                            case 6 :
                                                print("Change access codes selected.")
                                                return
                                            case 0 :
                                                print("Returning to previous menu.")
                                                break
                                            case _ :
                                                print("Invalid, Please try again.")

                                case 4 :
                                    print("Restore factory settings.")
                                    return
                                case 0 :
                                    print("Returning to previous menu.")
                                    break 
                                
                                case _ :
                                    print("Invalid, Please try again.")

                    case 7 :
                        print("Call divert selected.")
                        return
                    case 8 :
                        print("Games selected.")
                        return
                    case 9 :
                        print("Calculator selected.")
                        return
                    case 10 :
                        print("Reminders selected.")
                        return
                    case 11 :
            
                        while True:
                            print(
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
                                    )

                            clock_menu_input = int(input())
                            match clock_menu_input:
                                case 1 :
                                    print("Alarm clock selected.")
                                    return
                                case 2 :
                                    print("Clock settings selected.")
                                    return
                                case 3 :
                                    print("Date settings selected.")
                                    return
                                case 4 :
                                    print("Stop watch selected.")
                                    return
                                case 5 :
                                    print("Countdown timer selected.")
                                    return
                                case 6 :
                                    print("Auto update of date and time selected.")
                                    return
                                case 0 :
                                    print("Returning to previous menu.")
                                    break 
                                case _ :
                                    print("Invalid, Please try again.")

                    case 12 :
                        print("Profiles selected.")
                        return
                    case 13 :
                        print("SIM services selected.")
                        return
                    case 0 :
                        print("Exiting Nokia Menu. Goodbye!")
                        break 
                    
                    case _ :
                        print("Invalid, Please try again.")

getNokiaMenu()
