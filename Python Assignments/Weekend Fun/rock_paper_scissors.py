print("Question 7: Rock-Paper-Scissors")
p_1 = input("Player 1 enter rock, paper or scissors: ").lower
p_2 = input("Player 2 enter rock, paper or scissors: ").lower

if p_1 != p_2:
    if p_1 == "scissors":
        if p_2 == "rock":
            print("Player 2 won")
        else:
            print("Player 1 won")

    elif p_1 == "rock":
        if p_2 == "paper":
            print("Player 2 won")
        else:
            print("Player 1 won")

    elif p_1 == "paper":
        if p_2 == "scissors":
            print("Player 2 won")
        else:
            print("Player 1 won")
else:
    print("Tie")
print()