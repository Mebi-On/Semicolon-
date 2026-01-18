import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BookSuggestionSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        

    List<String> bookList = new ArrayList<>();
    bookList.add("Brave King");
    bookList.add("The Hobbit");
    bookList.add("The Mystery");
    bookList.add("Animal Farm");

    boolean continueSuggestion = true;

    mainloop:
    while (true){
                System.out.println(
                        """
                        Welcome to the Book Suggestion System!
                        1. Get Suggestions
                        2. Add Book
                        3. Remove Book
                        4. Update book
                        5. Show all books
                        0. Exit

                        Enter here: """
                        );

                int bookSelectionInput = input.nextInt();
                input.nextLine();
                
                switch (bookSelectionInput){
                    case 1 -> {
                        while (continueSuggestion == true){

                            System.out.println("Get Suggestions selected");
                            System.out.println("Book of the day:");
                            int bookIndex = random.nextInt(bookList.size());
                            int pageNumber = random.nextInt(100) + 1;

                            System.out.println("Book Title: " + bookList.get(bookIndex));
                            System.out.println("Page: " + pageNumber);
                            System.out.print("Would you like to get another suggestion? (yes/no): ");
                            String continueInput = input.nextLine().toLowerCase();
                            
                            if (continueInput.equals("no")){
                                 continueSuggestion = false;
                            }
                            else if (continueInput.equals("yes")){
                                continueSuggestion = true;
                            }
                            else{
                                 System.out.println("Invalid input");
				 break;
                                }
                            }
                            System.out.println();
                        }
                    

                    case 2 -> {
                        System.out.println("\nAdd Book selected.");
                        System.out.print("Book Title: ");
                        String bookAdditionNameInput = input.nextLine();

                        if (bookList.contains(bookAdditionNameInput)) {
                        System.out.println("Book already here");
                    } 
                        else {
                        bookList.add(bookAdditionNameInput);
                        System.out.println("Book added successfully");
                    }
                    System.out.println();
                }
                     
                    case 3 -> {
                        System.out.println("\nRemove Book selected.");
                        System.out.print("Enter the book title to remove: ");
                        String bookRemovalNameInput = input.nextLine();
                    
                        if (bookList.contains(bookRemovalNameInput)) {
                            bookList.remove(bookRemovalNameInput);
                            System.out.println("Book removed successfully!");
                        } else {
                            System.out.println("Book not here");
                        }
                        System.out.println();
                    }

                    case 4 -> {
                        System.out.println("\nUpdate Book selected.");
                        System.out.print("Enter the old title: ");
                        String bookUpdateNameInputOld = input.nextLine();
                        System.out.print("Enter the new title: ");
                        String bookUpdateNameInputNew = input.nextLine();
                        
                        if (bookList.contains(bookUpdateNameInputOld)) {
                            int index = bookList.indexOf(bookUpdateNameInputOld);
                            bookList.set(index, bookUpdateNameInputNew);
                            System.out.println("Book updated successfully!");
                        } else {
                            System.out.println("Book not found");
                        }
                        System.out.println();
                    }
                    
                    case 5 -> {
                        System.out.println("Show all books selected.");
                        for (int index = 0; index < bookList.size(); index++) {
                            System.out.println((index + 1) + ". " + bookList.get(index));
                        }
                        System.out.println();
                    }
                
                    case 0 -> {
                        System.out.println("Ending program");
                        input.close();
                        break mainloop;
                    }
                    default -> {
                        System.out.println("Invalid, Please try again.");
			System.out.pritnln(" ")
                    }
                }
        }
    }
}
