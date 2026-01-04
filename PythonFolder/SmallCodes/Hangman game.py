# Program of a hangman guessing word game
import random

wordList = ("beaver","castle","coin","escape","stairway","haven","heaven","combination","triangle","circle","market",
         "onion","uncle","sister","brother","wasteland","alleyway","golfing","ambition","contemplation","abuse",
         "trends","movies","shipwreck","mast","pirate","flying","hockey","shopping","dressing","imagine","meanwhile",
         "sometimes","stone","rocks","mountains","autumn","fall","spring","summer","equinox","planets","system","solar",
         "stars","house","mouse","cats","rats","hills","giant","rockets","nuggets","panthers","tigers","elephants")

hangmanDrawing = {0: ("  ",
                      "  ",
                      "  "),
                  1: (" o ",
                      "  ",
                      "  "),
                  2: (" o ",
                      " | ",
                      "   "),
                  3: (" o ",
                      "/| ",
                      "   "),
                  4: (" o ",
                      "/|\ ",
                      "   "),
                  5: (" o ",
                      "/|\ ",
                      "/   "),
                  6: (" o ",
                      "/|\ ",
                      "/ \ ")}
isrunning = True
word = random.choice(wordList)
placeholder = ["_"] * len(word)
displayText = "".join(placeholder)
index = 0


while isrunning:
    print("**************")
    for rows in hangmanDrawing[index]:
            print(rows)
    print("**************")
    print(displayText)
    letter = input("Guess a letter in the word:")
    if letter not in word:
        index += 1
        if index == 6:
            break
        continue
    else:
        for i in range(len(word)):
            if word[i] == letter:
                placeholder[i] = letter

        displayText = "".join(placeholder)
print("GAME OVER!!!")
print(f"The word was {word}")
