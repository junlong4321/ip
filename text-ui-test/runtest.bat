@ECHO OFF

REM create bin directory if it doesn't exist
if not exist ..\bin mkdir ..\bin

REM delete output from previous run
del ACTUAL.TXT

REM reset duke.txt for every run so that we will not carry forward the previous test state
break > data/duke.txt

REM compile the code into the bin folder
dir /s /B ..\src\main\java\*.java > sources.txt
javac -cp ..\src -Xlint:none -d ..\bin ..\src\main\java\datetime\*.java ..\src\main\java\exception\*.java ..\src\main\java\parser\*.java ..\src\main\java\storage\*.java ..\src\main\java\task\*.java ..\src\main\java\task\tasks\*.java ..\src\main\java\ui\*.java
IF ERRORLEVEL 1 (
    echo ********** BUILD FAILURE **********
    exit /b 1
)
REM no error here, errorlevel == 0

REM run the program, feed commands from input.txt file and redirect the output to the ACTUAL.TXT
java -classpath ..\bin Duke < input.txt > ACTUAL.TXT

REM compare the output to the expected output
FC ACTUAL.TXT EXPECTED.TXT
