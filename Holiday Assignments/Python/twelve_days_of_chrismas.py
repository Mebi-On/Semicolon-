for days in range (1, 13):
    print("On the", end = " ")

    match days:
        case 1: print("first", end = " ")
        case 2: print("second", end = " ")
        case 3: print("third", end = " ")
        case 4: print("fourth", end = " ")
        case 5: print("fifth", end = " ")
        case 6: print("sixth", end = " ")
        case 7: print("seventh", end = " ")
        case 8: print("eight", end = " ")
        case 9: print("ninth", end = " ")
        case 10: print("tenth", end = " ")
        case 11: print("eleventh", end = " ")
        case 12: print("twelfth", end = " ")


    print("day of Chrismas ")
    print("My true love sent to me")

    for gifts in range(days, 0, -1):
        match gifts:
            case 12: print("Twelve drummers drumming")
            case 11: print("Eleven pipers piping")
            case 10: print("Ten lords a-leaping")
            case 9: print("Nine ladies dancing")
            case 8: print("Eight maids a-milking")
            case 7: print("Seven swans a-swimming")
            case 6: print("Six geese a-laying")
            case 5: print("Five golden rings")
            case 4: print("Four calling birds")
            case 3: print("Three French hens")
            case 2: print("Two turtle doves \nAnd", end = " ")
            case 1: print("A partridge in a pear tree")
        
    print()
        
        
        
        