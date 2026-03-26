#!/bin/bash

echo "================================"
echo "   Java Banking System Launcher"
echo "================================"
echo

cd src

echo "Compiling Java files..."
javac *.java

if [ $? -ne 0 ]; then
    echo
    echo "ERROR: Compilation failed!"
    echo "Please check your Java code for errors."
    exit 1
fi

echo "Compilation successful!"
echo
echo "Starting Java Banking System..."
echo

java Main

echo
echo "Banking System has ended."