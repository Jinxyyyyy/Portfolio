# number guessing game between 1 and 100 program
import random

def numberGuess():

    print("Welcome to the number guessing game!")

    lowBound = int(input("Enter the lowest bound:"))
    highBound = int(input("Enter the highest bound:"))

    number = random.randint(lowBound, highBound)

    while True:
       try:
        guess = int(input(f"Enter a number between {lowBound} and {highBound}:"))
       except ValueError:
           print("Invalid input! Must be a number!")
           continue

       if guess < lowBound or guess > highBound:
            print(f"Your number is not between {lowBound} and {highBound}")
       elif guess > number:
            print("Your number is too high")
       elif guess < number:
            print("Your number is too low")
       else:
            break

    print(f"Good job! You guessed the correct number {number}!")

numberGuess()
