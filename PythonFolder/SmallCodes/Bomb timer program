# countdown bomb timer program
import time

def countdownTimer():
    timeClock = int(input("Enter an amount if time in seconds:"))

    for i in range(timeClock, 0, -1):
        seconds = i % 60
        minutes = int(i / 60) % 60
        hours = int(i / 3600)
        print(f"{hours:02}:{minutes:02}:{seconds:02}")
        time.sleep(1)
    print("BOOOOOOOM!💣")
countdownTimer()
