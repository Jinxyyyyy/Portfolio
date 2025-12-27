# Program that simulates an alarm clock

import time
import datetime
import pygame


def setAlarmTime(userTime):
    print(f"Alarm has been set for {userTime}")
    alarmSoundFile = "Alarm Clock.mp3"
    isRunning = True

    while isRunning:
        currentTime = datetime.datetime.now().strftime("%H:%M:%S")
        print(currentTime)

        if currentTime == userTime:
            print("WAKE UP!!")

            pygame.mixer.init()
            pygame.mixer.music.load(alarmSoundFile)
            pygame.mixer.music.play()

            while pygame.mixer.music.get_busy():
                time.sleep(1)

            isRunning = False

        time.sleep(1)

if __name__ == "__main__":
    userTime = input("Enter the time in a Hours:Minute:Seconds format:")
    setAlarmTime(userTime)
