@echo off
cls
color 0c
title DiceGame CDIO part 2


echo.
echo    Welcome to the Dice Game
echo.   ************************
echo    Velkommen til terningespillet
echo.   ************************
echo    Bun venit la jocul de zaruri
echo.   ************************
echo    Ḍā'isa gēmē sbāgatama
echo.   ************************
echo.
echo    Roll the dice and see who wins!
echo.   ************************
echo    Kast terningerne og se, hvem der vinder!
echo.   ************************
echo    Dă cu zarurile și vezi cine câștigă
echo.   ************************
echo    Pāśā rōla ēbaṁ dēkhuna kē jitē!
echo.   ************************
echo.

pause

javac -cp . *.java
java DiceGame
pause
