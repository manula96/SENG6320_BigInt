# SENG6320: Software Verification and Validation
## Assignment 1
### Team Members:

- **C3410266:** Don Manula Ransika Udugahapattuwa
- **C3411903:** Abin Antony Kalloothra
- **C3421072:** Asad Ulla Awan
- **C3395327:** Ahsan Moin

---

## Overview:

This repository contains the code and documentation for Assignment 1 of the SENG6320 course, Software Verification and Validation.

### Test Environment:

- **Operating System:** Windows 10
- **Java Version:** OpenJDK 20
- **Testing Framework:** JUnit 4.12
- **IDE:** IntelliJ IDEA
---

## Codebase:

- **[src/](src/)**: This directory contains the source code for Assignment 1.
- **[src/test](src/test)**: Contains the JUnit test cases for all sections.
- **src/test/BigIntegerTestMagnitude.java**: JUnit test cases for Method: BigInteger(int signum,byte[] magnitude).
- **src/test/BigIntegerTestRadix.java**: JUnit test cases for Method: BigInteger(String val, int radix).
- **src/test/BigIntegerTestVal.java**: JUnit test cases for Method: compareTo(BigInteger val).
- **src/test/GCDTest.java**: JUnit test cases for Method: BigInteger gcd(BigInteger y)
- **src/test/CTTest.java**: JUnit test cases for Method: compareTo(BigInteger x, BigInteger y)
- **src/test/Part3/CompareToTestAllDefs.java**: All-Defs JUnit test cases for Method: compareTo(BigInteger x, BigInteger y)
- **src/test/Part3/CompareToTestAllUses.java**: All-Uses JUnit test cases for Method: compareTo(BigInteger x, BigInteger y)
- **src/test/Part3/GcdTestAllDefs.java**: All-Defs JUnit test cases for Method: gcd(BigInteger y)
- **src/test/Part3/GCDTestAllUses.java**: All-Uses JUnit test cases for Method: gcd(BigInteger y)
- **src/test/LongToByteConversion.java**: Method to achieve Long To Byte Conversion


---

## Getting Started:

To get started with the project, follow these steps:

1. Clone this repository to your local machine:
2. Navigate to the project directory
3. java -cp "test/*:src" org.junit.platform.console.ConsoleLauncher --scan-classpath

