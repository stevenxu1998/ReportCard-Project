# ReportCard-Project
Description: This program asks the user to enter test/quiz/exam marks and process multiple calculations to calculate the student’s mark for a specific course. Each test will have a specific weight factor and the mark of the subject will be calculated based on the weight factor. There will be 2 quizzes, 2 tests and 1 one exam for each course/subject. The student has a total of 8 subjects that he/she is taking so therefore the input is repeated 8 times, one for each subject. The subjects will be english, Calculus, Advanced functions, chemistry, physics, computer science, accounting, and french. The marks can also be changed by the user if they want to go back and edit. The number of students can also be chosen from 1 student to  maximum 10 students by the user and enter the names of the students must be inputted by the user. The program will also repeat itself if the user wants to retry the program.

Programming concepts: if statements/decision making, objects, repetition, methods, creating files, writing in those files, and overloading files, arrays, formula calculations, and constant variables 
   
IPO (Input, Processing, Output):

Input:
- Number of students (between 1 and 10) and the variable will be int num
- Names of the students (String Name)
- Marks of each evaluation for each subject (int mark)
- ask user if he/she would like to repeat the program (char ask)
- ask the user if they want to amend the file (char ask2)

Processing:
- The formula of mark*weight+mark*weight+ mark* weight +.....= final mark is required to calculate the final mark of the subject
- The subjects must be split up into objects/methods in order to simplify everything
- Bullet proofing of the inputed marks are necessary to make sure no negatives are put in and the marks do not exceed 100
- If statements are needed to ask the user if they want to repeat the program, re-enter a mark, or enter an invalid mark
- Create a file to store all the test marks, names of the students, and finals marks inside
- amend the file for overloading stuff 


Output:
- Final mark for each subject of each student
- Name of the student
- English final mark
- Calculus final mark
- Advanced Functions final mark
- Chemistry final mark
- Physics final mark
- Computer science final mark
- Accounting final mark
- French final mark
- This format could repeat depend on the number of students



