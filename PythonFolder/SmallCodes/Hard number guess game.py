import random

def numberGuess():
    
    number = random.randint(1, 100)

    while True:
        guess = int(input("Enter a number between 1 and 100:"))
        if guess < 1 or guess > 100:
            print("Your number is not between 1 and 100")
        else:
            if guess == number:
                break
            else:
                print("Wrong number! Try again!")

    print("Good job! You guessed the correct number!")

numberGuess()
