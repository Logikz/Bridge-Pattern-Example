# CS665 Summer 2018 Assignment 7

This is assignment 7 for CS665 Summer 2018.  The following readme can be used to guide the user 
to install and run the application using Java.  

-Nick Cuneo

# Implementation Description
For the class project, assignment 7, I will cover the bridge pattern.  For more details on the
assignment, see the powerpoint and the video file covering a presentation of the bridge pattern
and my assignment.


# Setup
 
You need to install Apache Maven (https://maven.apache.org/)  on your system.

# Compilation 

Compilation and packaging is done with maven, and is easily ran from windows or linux with one of
the following scripts.

## Windows
```bash
compile.bat
```

## Linux

```bash
./compile.sh
```


# Running

The application can be ran by executing one of the following scripts on windows or linux.

## Windows

```bash
run.bat
```

## Linux

```bash
./run.sh 
```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```

# Run Checkstyle 

To analyse this example using CheckStyle run 

```bash
mvn checkstyle:check
```


CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. You can change it to other styles like sun checkstyle. 

# Unit Tests

Difficulty was found in attempting to write unit tests for this very simple UI application with almost
no logic to be tested. Unit tests were skipped for this assignment due to time constraints.




