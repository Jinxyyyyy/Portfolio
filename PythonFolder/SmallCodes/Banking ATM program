# Program that simulates a banking ATM
import random


def bankingATM():

    userInterface()
    balance = random.randint(-1000,1000000)
    while True:
        try:
            choice = int(input("Please choose an option between 1-4:"))
            if choice == 1:
                showbalance(balance)
            elif choice == 2:
                balance = makeDeposit(balance)
            elif choice == 3:
                balance = makeWithdrawal(balance)
            elif choice == 4:
                print("Thank you for banking with us today!")
                break
            else:
                print("Number must be between 1 and 4")
        except ValueError:
            print("Invalid input! It must be an integer")

def userInterface():
    print(" ******************** \n",
          "  Banking Program \n",
          "******************** \n",
          "1.Show balance \n",
          "2.Deposit \n",
          "3.Withdraw \n",
          "4.Exit")

def showbalance(balance):
    print(f"Your current balance is {balance:.2f}")



def makeDeposit(balance):
        try:
            deposit = int(input("Type an amount to deposit: "))
            if deposit < 0:
                print("Cannot deposit a negative amount")
            else:
                balance += deposit
        except ValueError:
            print("Invalid input! Deposit must be an integer.")
        return balance


def makeWithdrawal(balance):
    try:
        withdraw = int(input("Type an amount to withdraw: "))
        if withdraw < 0:
            print("Cannot withdraw a negative amount")
        elif balance < 0:
            print("Cannot withdraw! Account in overdraft")
        elif withdraw > balance:
            print("Insufficient funds!")
        else:
            balance -= withdraw
    except ValueError:
        print("Invalid input! Withdrawal must be an integer.")
    return balance

bankingATM()











