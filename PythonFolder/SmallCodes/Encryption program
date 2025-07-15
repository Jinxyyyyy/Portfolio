# Program that lets you enter a string then encodes it

import random
import string

chars = " " + string.punctuation + string.digits + string.ascii_letters
chars = list(chars)
key = chars.copy()

random.shuffle(key)

# ENCRYPTION

plainText = input("Enter a message to encrypt:")
cyphered = ""

for letter in plainText:
    index = chars.index(letter)
    cyphered += key[index]
    
print(f"original message {plainText}")
print(f"encrypted message: {cyphered}")

#
plainText = input("Enter a message to encrypt:")
cyphered = ""

for letter in plainText:
    index = chars.index(letter)
    cyphered += key[index]
    
print(f"encrypted message: {cyphered}")
print(f"original message {plainText}")





