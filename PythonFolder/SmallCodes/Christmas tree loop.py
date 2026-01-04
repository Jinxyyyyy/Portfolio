# Christmas tree program

def christmasTree():

    height = int(input("Enter the tree height:"))

    for i in range (1,height * 2,2):
       print(height * " " + i * "*")
       height -= 1


christmasTree()
