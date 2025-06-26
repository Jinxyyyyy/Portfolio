# Concession stand program with a dictionary

def concession_stand():

    stand = {"hotdog":2.50, "hamburger":3.50, "popcorn":1.50, "cottoncandy":0.75,
             "fries":1.00, "chips":1.75, "soda": 2.00 }
    total = 0
    cart = []

    print("---------- MENU ----------")
    for key, value in stand.items():
        print(f"{key:15} :  {value:.2f}$")

    while True:
        purchase = input("Enter items to buy (q to quit):")
        if purchase == "q":
            break
        else:
            cart.append(purchase)
            total += stand[purchase]
    print("----------- YOUR ORDER -----------")
    for purchase in cart:
        print(purchase)
    print(f"You have bought for a total of {total:.2f}$")



concession_stand()
