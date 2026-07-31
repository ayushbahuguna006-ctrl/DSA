Architecture and Installation:

How java codes executes:

.java file(source code)=>compiler(Javac) compiles into .class file i.e. byte code=>interpreter converts this class file into machine code(0 & 1)

Points about .class file:
1)This code will not directly run on a sytem
2)we need JVM to run this but note that JVM is platform dependent 
3)reason why java is platform independent that byte code can run on all operating systems

Architecture of Java:
Java consists of JDK(Java development kit) and inside it is JRE(Java runtime environment) and library classes and inside is JVM(Java virtual machine) and inside it is JIT(Just in time).


JDK:
Provides environment to develop and run java program
package that includes:
    development tools
    JRE=to execute your program
    a compiler=javac
    interpreter/loader
  
JRE:
provides an environment to only run the program
it consistes of :
deployment technologies
user interface toolkits
Integration libraries , base libraries , JVM

1)Class loader loads all classes needed to execute the program
2)JVM sends code to byte code verifier to check the format of code

How JVM works?
JVM verifies the .class file and allocate memory for class variables and default values
