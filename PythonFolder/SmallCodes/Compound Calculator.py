# Compound calculator with an initial amount and an interest over a period of years

def compoundCalculator():

    interestRate = 0
    initialAmount = 0
    years = 0

    while interestRate <= 0:
          interestRate = float(input("Enter an interest in %:"))
          if interestRate <= 0:
           print("Please enter a positive interest rate")
    while initialAmount <= 0:
          initialAmount = float(input("Enter an amount:"))
          if interestRate <= 0:
           print("Please enter a positive interest rate")
    while years <= 0:
          years = int(input("Enter an amount of years:"))
          if interestRate <= 0:
           print("Please enter a positive interest rate")
    while years != 0:
        initialAmount = initialAmount * (1 + interestRate / 100)
        years -= 1
    print(f"{initialAmount :.2f}")
