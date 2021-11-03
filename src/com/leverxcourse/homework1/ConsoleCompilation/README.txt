(Git Bash console)




A) Сompiling and running a program with multiple packages

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
   
   
   
   
B) Building the executable .jar file

1. Repeat all previous steps from point A

2. To create .jar file enter in console: 
   jar -cvf <filename>.jar <name of directory with .class files>
   
3. You should specify the main class of this <filename>.jar. Open archive
   <filename>.jar, open folder META-INF and open file MANIFEST.MF.
   Append to the end of the file "Main-Class: <path to the main class>"    
   
4. To run this .jar file enter in console: java -jar <filename>.jar
 
 
 
 
C) Сompiling and running a program with multiple packages and external .jar file

1. Repeat all previous steps from point A

2. To compile .java file which uses external library enter in console:
   javac <path to the library>.jar -d . <path to the java file>.java
   In this case enter in console:
   javac -cp external/commons-math3-3.6.1.jar -d . apachecommonsmath/ApacheMath.java
   
3. To run this program enter in console:
   java -cp external/commons-math3-3.6.1.jar com.leverxcourse.homework1.ConsoleCompilation.apachecommonsmath.ApacheMath

