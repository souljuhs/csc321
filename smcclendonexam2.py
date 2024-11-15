# Sidney Mcclendon
# csc321

import random

number = random.randint(10, 20)

tries = 0
maxtries = 3

print("Guess a number between 10 and 20. You only have 3 tries.")

while tries < maxtries:
    guess = int(input("Enter your guess: "))
    tries += 1

    if guess == number:
        print("Congratulations! You guessed the number")
        break
    else:
        print("Incorrect guess")

        if guess != number and tries == maxtries:
            print("Oops, you didn't guess the number. The correct number was:", number)
