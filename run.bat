@echo off
cls
color 0c
title Gold Rush, CDIO part 2

:start
echo.
echo    IOOuterActive 
echo.
echo    Welcome to the Dice Game
echo.
echo    Roll the dice and see who wins!
echo.

echo.
echo    ENTER A BIG CAPITAL,  
echo.
echo    AS YOU CAN SEE LISTED,
echo.
echo    DOWN HER, AND CHOOSE 
echo. 
echo    WHICH LANGUAGE YOU WANT!
echo.

javac -cp . *.java
java DiceGame

:menu
echo.
echo    Game over! What would you like to do?
echo    1. Restart the game
echo    2. Exit

set /p choice=Enter the number of your choice: 

if "%choice%"== "1" (
    echo Restarting the game...
    goto start
)

if "%choice%"== "2" (
    echo Exiting the game...
    exit /b 0
)

echo Invalid choice, please try again...
goto menu
