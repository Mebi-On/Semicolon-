import random

def bookSuggesstionSystem():
    book_list = ["Brave king", "The Hobbit", "The Mystery", "Animal Farm"]
    continue_suggestion = True
    while True:
                print(
"""
Welcome to the Book Suggestion System!
1. Get Suggestions
2. Add Book
3. Remove Book
4. Update book
5. Show all books
0. Exit

Enter here: """
                        )

                book_selection_input = int(input())
                match book_selection_input:
                    case 1 :
                        while continue_suggestion == True:

                            print("Get Suggestions selected")
                            print("Book of the day:")
                            book_index = random.randint(0, len(book_list) - 1)
                            page_number = random.randint(1, 100)
                            print("Book Title: ",book_list[book_index])
                            print("Page: ", page_number)
                            continue_input = input("Would you like to get another suggestion? (yes/no): ").lower()
                            
                            if continue_input == "no":
                                 continue_suggestion = False
                                 break
                            elif continue_input == "yes":
                                continue_suggestion = True
                                continue
                            else:
                                 print("Invalid input")
                                 break

                    case 2 :
                        print("Add Book selected.")
                        book_addition_name_input = input("Book Title: ").title()

                        if book_addition_name_input in book_list:
                             print("Book already here")
                        else:
                            book_list.append(book_addition_name_input)
                            print("Book added successfully")
                     
                    case 3 :
                        print("Remove Book selected.")
                        book_removal_name_input = input("Enter the book title to remove: ")
                        
                        if book_removal_name_input in book_list:
                             book_list.remove(book_removal_name_input)
                             print("Book removed sucessfully!")
                        else:
                             print("Book not here")

                    case 4 :
                        print("Update Book selected.")
                        book_update_name_input_old = input("Enter the old title: ")
                        book_update_name_input_new = input("Enter the new title: ")

                        if book_update_name_input_old in book_list:
                             index = book_list.index(book_update_name_input_old)
                             book_list[index] = book_update_name_input_new
                             print("Book updated successfully!")
                        else:
                             print("Book not found")
                     
                    case 5 :
                        print("Show all books selected.")
                        for index in range (len(book_list)):
                             print (index + 1, ". ", book_list[index], sep = "")

                    case 0 :
                        print("Ending program")
                        return
                    case _ :
                        print("Invalid, Please try again.")

bookSuggesstionSystem()