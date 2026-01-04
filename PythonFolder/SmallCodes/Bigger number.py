# Function that returns the bigger number of the two or a message if they are equal

def biggernumber(a,b):
    if a == b:          # Equal case
        print("Both numbers are equal")
    elif a > b:         # Non equal case
        print(a)
    else:
        print(b)
biggernumber(2,2)    
