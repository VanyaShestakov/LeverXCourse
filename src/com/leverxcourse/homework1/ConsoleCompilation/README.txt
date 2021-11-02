(Git Bash console)

Сompiling and running a program with multiple packages

1. Go to the directory with three packages (Interfaces, KindsOfClasses, Runner)

2. Enter in console:  javac -d . Interfaces/Function.java 
   (to create a directory tree with classes and compile Function.java)

3. Enter in console:  javac -d . KindsOfClasses/SimpleClass.java
   (to compile SimpleClass.java)
   
4. Enter in console:  javac -d . Runner/Runner.java
   (to compile Runner.java)
   
5. To run this program enter in console: 
   java com.leverxcourse.homework1.ConsoleCompilation.Runner.Runner

6. To view the byte code of the compiled file enter in console:
   javap -c <path to compiled file .classjar cvf sample.jar *.class> 
   
Building the executable .jar file

1. Repeat all previous steps

2. To create .jar file enter in console: 
   jar -cvf <filename>.jar <name of directory with .class files>
   
3. You should specify the main class of this <filename>.jar.     