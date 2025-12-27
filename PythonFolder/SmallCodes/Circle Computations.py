# Program to compute measurements of a circle
import math

def circleComputations():
    pi = math.pi
    radius = input(f"Enter the circle's radius:")
    circumference = 2 * pi * float(radius)
    area = pi * float(radius) ** 2
    diameter = 2 * float(radius)
    print(f"The circumference is {circumference} and the area is {area} and the diameter is {diameter}")

circleComputations()
