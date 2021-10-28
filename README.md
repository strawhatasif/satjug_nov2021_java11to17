## Java 11 to 17 
### Language Changes Showcase

### Purpose
* The motivation for this project is to demonstrate language features introduced by _Oracle_ between `Java 11` and `Java 17`.
* This was prepared for a presentation given in November 2021 at the **San Antonio Java Users Group** (JUG).

### Running the examples
* Each package has a class with a `main` method. Simply right click and click _run_

| Feature                 | Language Version   | Class with `main` method                           |
| ----------------------  | ----------------   | -----------------------------------------------    | 
| Switch Expressions      | Java 14            |  `com.fun.java.switchfun.SwitchExpressions`        |
| Text Blocks             | Java 15            |  `com.fun.java.textblock.TextBlock`        |
| Helpful `NullPointerException` messages             | Java 15            |  `com.fun.java.nullonpurpose.NullOnPurpose`        |
| Pattern matching for `instanceof`      | Java 16            |  `com.fun.java.pattern.Application`        |
| Record Classes          | Java 16            |  `com.fun.java.record.SpinningThatRecord`        |
| Sealed Classes          | Java 17             |  `com.fun.java.sealed.Application`        |
| Pattern matching for Switch Expressions*      | Java 17            |  `com.fun.java.preview.Application`        |

*This is a _preview_ feature. https://www.baeldung.com/java-preview-features for how to set language level in your favorite IDE.