@echo off
cls
color 0c
title Gold Rush, CDIO part 2

:start
echo.
echo    IOOuterActive 
echo.
echo    Welcome to the Gold Rush
echo.

javac -cp . *.java
java DiceGame

:menu
echo.
echo    Restart (y/n)
echo.

set /p choice=Enter the number of your choice: 

if "%choice%"== "y" (
    echo Restarting...
    goto start
) else if "%choice%"== "Y" (
    echo Restarting...
    goto start
) else if "%choice%"== "n" (
    echo Exiting...
    exit /b 0
) else if "%choice%"== "n" (
    echo Exiting...
    exit /b 0
)

echo Invalid choice, please try again...
goto menu
