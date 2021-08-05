play='yes'
while(play=='yes'):
    player1Option=str(input("Player 1 Option: "))
    player2Option=str(input("Player 2 Option: "))
    player1Option.lower()
    player2Option.lower()
    if(player1Option==player2Option):
        print("Game is Tie")
    elif(player1Option=='rock'):
        if(player2Option=='paper'):
            print("Player 2 is Winner")
        else:
            print("Player 1 is Winner")
    elif(player1Option=='paper'):
        if(player2Option=='scissors'):
            print("Player 2 is Winner")
        else:
            print("Player 1 is Winner")
    elif(player1Option=='scissors'):
        if(player2Option=='rock'):
            print("Player 2 is Winner")
        else:
            print("Player 1 is Winner")
    else:
        print("None of the 3 valid options entered")
    play=str(input("Do you want to play again: "))
    play.lower()
    if(play=='no'):
        print("Game Ended")
        raise SystemExit
    elif(play!='yes'):
        print("Other than yes or no entered")
        raise SystemExit