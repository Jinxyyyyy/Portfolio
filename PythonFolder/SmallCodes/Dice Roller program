import random


def diceRoller():

    totalSum = 0
    diceTotal = 0
    diceArray = []
    dice_art = {
        1: ("┌─────────┐",
            "│         │",
            "│    ●    │",
            "│         │",
            "└─────────┘"),
        2: ("┌─────────┐",
            "│  ●      │",
            "│         │",
            "│      ●  │",
            "└─────────┘"),
        3: ("┌─────────┐",
            "│  ●      │",
            "│    ●    │",
            "│      ●  │",
            "└─────────┘"),
        4: ("┌─────────┐",
            "│  ●   ●  │",
            "│         │",
            "│  ●   ●  │",
            "└─────────┘"),
        5: ("┌─────────┐",
            "│  ●   ●  │",
            "│    ●    │",
            "│  ●   ●  │",
            "└─────────┘"),
        6: ("┌─────────┐",
            "│  ●   ●  │",
            "│  ●   ●  │",
            "│  ●   ●  │",
            "└─────────┘")
    }

    repeat = int(input("Enter the number of different dices you want:"))

    while diceTotal != repeat:
        randomDiceValue = random.choice(list(dice_art.keys()))
        randomDice = dice_art[randomDiceValue]

        if randomDice not in diceArray:
            diceArray.append(randomDice)
            for rows in randomDice:
                print(rows)
            diceTotal += 1
            totalSum += randomDiceValue
        else:
            continue

    print(f"The total sum of the die is {totalSum}")

diceRoller()
