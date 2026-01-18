public class TwelveDaysOfChrismas{
    public static void main (String[] args){
        
        for (int days = 1; days <= 12; days ++){
            System.out.print("On the ");

            switch (days) {
                case 1-> System.out.print("first" );
                case 2-> System.out.print("second" );
                case 3-> System.out.print("third" );
                case 4-> System.out.print("fourth" );
                case 5-> System.out.print("fifth" );
                case 6-> System.out.print("sixth" );
                case 7-> System.out.print("seventh" );
                case 8-> System.out.print("eight" );
                case 9-> System.out.print("ninth" );
                case 10-> System.out.print("tenth" );
                case 11-> System.out.print("eleventh" );
                case 12-> System.out.print("twelfth" );
            }

            System.out.println(" day of Chrismas ");
            System.out.println("My true love sent to me");

            for (int gifts = days; gifts >= 1; gifts --) {
                switch (gifts){
                    case 12-> System.out.println("Twelve drummers drumming");
                    case 11-> System.out.println("Eleven pipers piping");
                    case 10-> System.out.println("Ten lords a-leaping");
                    case 9-> System.out.println("Nine ladies dancing");
                    case 8-> System.out.println("Eight maids a-milking");
                    case 7-> System.out.println("Seven swans a-swimming");
                    case 6-> System.out.println("Six geese a-laying");
                    case 5-> System.out.println("Five golden rings");
                    case 4-> System.out.println("Four calling birds");
                    case 3-> System.out.println("Three French hens");
                    case 2-> System.out.print("Two turtle doves \nAnd " );
                    case 1-> System.out.println("A partridge in a pear tree");
                }
            }
            System.out.println();
        }
    }
}