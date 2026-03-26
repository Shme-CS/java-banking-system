@echo off
echo ================================
echo   Java Banking System Launcher
echo ================================
echo.

cd src

echo Compiling Java files...
javac *.java

if %errorlevel% neq 0 (
    echo.
    echo ERROR: Compilation failed!
    echo Please check your Java code for errors.
    pause
    exit /b 1
)

echo Compilation successful!
echo.
echo Starting Java Banking System...
echo.

java Main

echo.
echo Banking System has ended.
pause