# Quiz game with multiple choice questions

def quizGame():

    questions = ("What is the capital city of Lebanon?", "What is the capital city of Madagascar?",
                 "What is the capital city of Bhutan?", "What is the capital city of Malaysia?")

    choices = (("A:Beirut", "B:Tel-Aviv", "C:Amman", "D:Tehran"), ("A:Antananarivo", "B:Pretoria", "C:Port-Louis", "D:Victoria"),
               ("A:Dhaka", "B:Thimphu", "C:Lhasa", "D:Kathmandu"), ("A:Bangkok", "B:Jakarta", "C:Kuala Lumpur", "D:Hanoi"))

    answers = ("A", "A", "B", "C")

    score = 0


    for i in range (len(questions)):
     print("----------------------------")
     print(questions[i])
     for choice in choices[i]:
            print(choice, end=" ")
            print()
     answer = input("Enter the letter of the right answer (A, B, C, D):")
     if answer == answers[i]:
        print("Correct answer!")
        score += 1
     else:
        print(f"Incorrect answer. Answer is : {answers[i]}")

    grade = (score / 4) * 100
    print("----------------------------")
    print(f"Your final grade is {grade} %")

quizGame()
