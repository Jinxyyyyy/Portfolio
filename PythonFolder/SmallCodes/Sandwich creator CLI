# Program that allows you to customize your Subways' sandwich


bread_list = {0: "White bread", 1:"Italian herbs and cheese bread", 2:"Brown bread", 3:"Flatbread", 4:"Honey oat bread"}
cheese_list = {0:"Swiss cheese", 1:"Cheddar cheese",2:"Monterey jack"}
meat_list = {0:"Turkey",1:"Ham", 2:"Roast beef", 3:"Chicken", 4:"Steak", 5:"Meatball", 6:"Tuna", 7:"Cold cut combo", 8:"Vegetarian"}
temperature_list = {0:"Hot", 1:"Cold"}
vegetables_list = {0:"Salad", 1:"Tomatoes", 2:"Olives", 3:"Onions", 4:"Pickles", 5:"Cucumbers", 6:"Peppers"}
sauce_list = {0:"Chipotle", 1:"Light mayonnaise", 2:"Mayonnaise", 3:"Honey mustard", 4:"Barbecue sauce", 5:"Hot sauce", 6:"Ranch sauce", 7:"Mustard", 8:"Ketchup"}


def choose_bread():
    while True:
        try:
            print("*******************************************")
            print("0 - White bread")
            print("1 - Italian herbs and cheese bread")
            print("2 - Brown bread")
            print("3 - Flatbread")
            print("4 - Honey oat bread")
            bread_choice = int(input("Enter a number to choose your bread 🥖:"))
            print("*******************************************")
            bread = bread_list[bread_choice]
            return bread.lower()
        except (ValueError, KeyError):
            print("‼️Please enter a number from 0 to 4‼️")


def choose_cheese():
    while True:
        try:
            print("*******************************************")
            print("0 - Swiss cheese")
            print("1 - Cheddar cheese")
            print("2 - Monterey jack")
            cheese_choice = int(input("Enter a number to choose your cheese 🧀:"))
            print("*******************************************")
            cheese = cheese_list[cheese_choice]
            return cheese.lower()
        except(ValueError, KeyError):
            print("‼️Please enter a number from 0 to 2‼️")

def choose_meat():
    while True:
        try:
             print("*******************************************")
             print("0 - Turkey")
             print("1 - Ham")
             print("2 - Roast beef")
             print("3 - Chicken")
             print("4 - Steak")
             print("5 - Meatball")
             print("6 - Tuna")
             print("7 - Cold cut combo")
             print("8 - Vegetarian")
             meat_choice = int(input("Enter a number to choose your meat 🥩:"))
             print("*******************************************")
             meat = meat_list[meat_choice]
             return meat.lower()
        except(ValueError, KeyError):
            print("‼️Please enter a number from 0 to 8‼️")

def choose_temperature():
    while True:
        try:
            print("*******************************************")
            print("0 - Hot")
            print("1 - Cold")
            temperature_choice = int(input("Enter a number to choose a temperature 🌡️:"))
            print("*******************************************")
            temperature = temperature_list[temperature_choice]
            return temperature.lower()
        except(ValueError, KeyError):
            print("‼️Please enter a number from 0 to 1‼️️")


def choose_vegetables():
    while True:
        try:
            print("*******************************************")
            print("0 - Salad")
            print("1 - Tomatoes")
            print("2 - Olives")
            print("3 - Onions")
            print("4 - Pickles")
            print("5 - Cucumbers")
            print("6 - Peppers")
            print("7 - Done(to continue)")
            choosing = True
            vegetables = set()
            while choosing:
                vegetables_choice = int(input("Enter a number to choose vegetables 🥬:"))
                if vegetables_choice == 7:
                    choosing = False
                else:
                    vegetables.add(vegetables_list[vegetables_choice])
            print("*******************************************")
            vegetables = vegetable_parser(vegetables)
            return vegetables.lower()
        except(ValueError, KeyError):
            print("*******************************************")
            print("‼️Please enter a number from 0 to 7‼️")

def choose_sauce():
    while True:
        try:
            print("*******************************************")
            print("0 - Chipotle")
            print("1 - Light mayonnaise")
            print("2 - Mayonnaise")
            print("3 - Honey mustard")
            print("4 - Barbecue sauce")
            print("5 - Hot sauce")
            print("6 - Ranch")
            print("7 - Mustard")
            print("8 - Ketchup")
            print("9 - Done(to continue)")
            choosing = True
            sauces = set()
            while choosing:
                sauces_choice = int(input("Enter a number to choose sauces 🫙:"))
                if sauces_choice == 9:
                    choosing = False
                else:
                    sauces.add(sauce_list[sauces_choice])
            print("*******************************************")
            sauces = sauce_parser(sauces)
            return sauces.lower()
        except(ValueError,KeyError):
            print("*******************************************")
            print("‼️Please enter a number from 0 to 9‼️")

def vegetable_parser(vegetables):
    vegetable_string = ""
    vegetable_index = 0
    for vegetable in vegetables:
        if len(vegetables) == 0:
            vegetable_string = "no vegetables"
            return vegetable_string
        elif vegetable_index == len(vegetables) - 2:
            vegetable_string = vegetable_string + vegetable + " "
            vegetable_index += 1
        elif vegetable_index < len(vegetables) - 1:
            vegetable_string = vegetable_string + vegetable + "," + " "
            vegetable_index += 1
        else:
            vegetable_string = vegetable_string + "and" + " " + vegetable
    return vegetable_string

def sauce_parser(sauces):
    sauce_string = ""
    sauce_index = 0
    for sauce in sauces:
        if len(sauces) == 0:
            sauce_string = "no sauces"
            return sauce_string
        elif sauce_index == len(sauces) - 2:
            sauce_string = sauce_string + sauce + " "
            sauce_index += 1
        elif sauce_index < len(sauces) - 1:
            sauce_string = sauce_string + sauce + "," + " "
            sauce_index += 1
        else:
            sauce_string = sauce_string + "and" + " " + sauce
    return sauce_string


def sandwich_maker():
    print("Welcome to Subway's!")
    bread = choose_bread()
    print(f"You have selected {bread} ✅")
    cheese = choose_cheese()
    print(f"You have selected {cheese} ✅")
    meat = choose_meat()
    print(f"You have selected {meat} ✅")
    temperature = choose_temperature()
    print(f"You have selected {temperature} ✅")
    vegetables = choose_vegetables()
    print(f"You have selected {vegetables} ✅")
    sauces = choose_sauce()
    print(f"You have selected {sauces} ✅")
    print("*******************************************")
    print(f"Your sandwich is a {temperature} {meat} in a {bread} with {cheese} topped with {vegetables} seasoned with {sauces}")


if __name__ == "__main__":
    sandwich_maker()
