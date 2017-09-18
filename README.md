# TestForInstincTools
---------------------
Данное приложение выполняет анализ текста. Результатом работы является проверка корректности расстановки скобок и вывод
топ-10 самых часто используемых слов.
This application performs text analysis. The result of this work is the verification of the correctness of the alignment
of the parentheses and the output top-10 most frequently used words.
-----------------------------------------------------------------------------------------------------------------------
Были реализованны такие классы как:
BalanceOfBrackets - в данном классе выполняется проверка на корректность расстановки скобок. Проверка проводится через Стек.
TextParsing - в данном классе реализован поиск десяти самых часто используемых слов.
ReadingFromFile - в данном классе реализовано считывание текста из файла.
ThreadForBrackets и ThreadForTextParsing - были реализованы для многопоточной работы методов из BalanceOfBrackets и TextParsing.
UsersInterface - в данном классе реализована совместная работа методов из классов BalanceOfBrackets,TextParsing,ReadingFromFile.
There were implemented such classes as:
BalanceOfBrackets - in this class, the correctness of the parentheses is checked. The check is carried out through the Stack.
TextParsing - this class implements search for the ten most frequently used words.
ReadingFromFile - this class reads text from a file.
ThreadForBrackets and ThreadForTextParsing - were implemented for multi-threaded workflow of methods from BalanceOfBrackets
and TextParsing.
UsersInterface - this class implements the work of methods from the classes BalanceOfBrackets, TextParsing, ReadingFromFile.
-----------------------------------------------------------------------------------------------------------------------------
В начале работы приложения нужно ввести путь к файлу (который будем проверять). По выполнению результат проверки будет выведен
в консоль.
At the beginning of the application, you need to enter the path to the file (which we will check). By execution,
the result of the test will be displayed in the console.
-------------------------------------------------------------------------------------------------------------------------------
