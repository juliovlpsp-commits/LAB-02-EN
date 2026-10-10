# LAB-02-EN - CoISA (English Version)

Academic Control System - Lab 02 Programming Lab 2 (UFCG). Java system for basic academic management: rest, online time, courses and summaries.

## overview

Simple `CLI` app in pure Java to practice `OOP` basics: classes, objects, encapsulation, `toString` and `javadoc`. `CoISA.java` is the entry point testing all features.

## classes

| class | description |
|---|---|
| `Rest` | rest status (`rested` if `avg >=26h/week` else `tired`) |
| `OnlineTime` | online hours per course (`0/120` default, `30` custom) and goal check |
| `Course` | `4 grades` (avg `>=7` approved) + weighted average support and study hours |
| `Summary` | data object `topic: content` |
| `SummaryRegistry` | circular buffer collection with sorted keyword `search` |
| `CoISA` | entry point with manual tests for all modules |

## technologies
- `java 17+`
- `javadoc`
- `plantuml`
- `git`

## structure
```
LAB-02-EN/
├── CoISA/lab2/
│   ├── CoISA.java
│   ├── Rest.java
│   ├── OnlineTime.java
│   ├── Course.java
│   ├── Summary.java
│   └── SummaryRegistry.java
└── docs/
    ├── Lab02_UML.puml
    └── Lab02_UML.png
```

## how to run
```bash
javac CoISA/lab2/*.java
java -cp CoISA lab2.CoISA
```

expected output:
```
tired
rested
tired
rested
-----
false
true
true
LP2 32/30
P2 0/120
-----
false
true
PROGRAMMING 2 4 7.0 [5.0, 6.0, 7.0, 10.0]
-----
Classes: Classes define a type and the code base for creating objects.
Type: Identifies the semantics (operations and meanings) of a data set.
- 2 summaries registered
- Classes | Type
true
false
```

## author
JULIO EDUARDO MONTEIRO SILVA - UFCG
