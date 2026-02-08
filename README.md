# Java Learning Repository 📚

A comprehensive Java learning repository containing practical examples, data structure implementations, and mini-projects. This repository serves as a complete reference guide for Java fundamentals, collections framework, object-oriented programming concepts, and real-world applications.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Repository Structure](#repository-structure)
- [Topics Covered](#topics-covered)
  - [Arrays](#arrays)
  - [ArrayList](#arraylist)
  - [LinkedList](#linkedlist)
  - [Collections Framework](#collections-framework)
  - [Set Interface](#set-interface)
  - [Map Interface](#map-interface)
  - [Strings](#strings)
  - [Object-Oriented Programming](#object-oriented-programming)
  - [Access Modifiers](#access-modifiers)
- [Projects](#projects)
- [Getting Started](#getting-started)
- [How to Use This Repository](#how-to-use-this-repository)
- [Learning Path](#learning-path)

---

## 🎯 Overview

This repository is a structured collection of Java programs designed to help beginners and intermediate learners understand core Java concepts through hands-on examples. Each program is self-contained and focuses on specific Java features or data structures.

**Key Features:**
- ✅ Comprehensive examples for Java Collections Framework
- ✅ Real-world mini-projects demonstrating OOP principles
- ✅ Clean, commented code following Java best practices
- ✅ Organized package structure for easy navigation
- ✅ Practical implementations of common algorithms and data structures

---

## 📁 Repository Structure

```
├── Arrays/
│   ├── ArrayClassesOrFunctions.java
│   ├── MoreAdvanceJaggedArray.java
│   ├── UserInputJaggedArray.java
│   └── ObjectArray.java
├── ArrayList/
│   ├── BasicsOfArrayList.java
│   ├── AddallArrayList.java
│   ├── CapacityArrayList.java
│   ├── CloneArrayList.java
│   ├── IteratorArrayList.java
│   ├── ListInterface.java
│   ├── LoopsOfArrayList.java
│   ├── OthersArrayListTypes.java
│   ├── RemoveALL.java
│   ├── RemoveAllWithValues.java
│   ├── RemoveIfarrayList.java
│   ├── ReplaceMethod.java
│   └── SortingArrayListElements.java
├── LinkedList/
│   └── BasicsOfLinkedList.java
├── CollectionsBasics/
│   └── CollectionsBasicsMethods.java
├── SET/
│   ├── HashSetPrograms.java
│   ├── LinkedHashSetPrograms.java
│   └── TreeSetPrograms.java
├── Map/
│   ├── BasicsOfHashMap.java
│   ├── LinkedHashMapBasics.java
│   └── TreeMapBasics.java
├── Strings/
│   ├── StringBufferProgram.java
│   └── StringBuilderPrograms.java
├── Objectclass/
│   ├── ObjectClassRevision.java
│   ├── SetterGetterProgram.java
│   ├── OverloadingConstructor.java
│   └── Bank.java
├── AccessModifiers/
│   └── SetterGetterEx.java
├── Projects/
│   ├── Applicant.java
│   ├── EmployeePayrollSystem.java
│   └── KBC.java
└── Java/
    ├── Applicant.java
    ├── EmployeePayRoll.java
    ├── MovieTicket.java
    ├── ReportCard.java
    ├── Studentcourse.java
    ├── Tax.java
    ├── Test.java
    └── TransportDemo.java
```

---

## 📚 Topics Covered

### Arrays

Comprehensive array operations and advanced concepts:

#### `ArrayClassesOrFunctions.java`
Demonstrates built-in Java array utilities from `java.util.Arrays` class:
- `asList()` - Convert arrays to lists
- `sort()` - Sort arrays
- `binarySearch()` - Search in sorted arrays
- `compare()` / `compareUnsigned()` - Array comparison
- `copyOf()` / `copyOfRange()` - Array copying
- `deepEquals()` / `deepHashCode()` / `deepToString()` - Multi-dimensional array operations
- `fill()` - Fill arrays with values
- `mismatch()` - Find first mismatch between arrays
- `parallelSort()` - Parallel sorting for performance

#### `MoreAdvanceJaggedArray.java`
- Creating jagged (ragged) arrays with varying row sizes
- Dynamic memory allocation for 2D arrays
- Triangle pattern generation

#### `UserInputJaggedArray.java`
- Interactive jagged array creation with user input
- Dynamic array sizing based on user specifications
- Scanner class usage for input handling

#### `ObjectArray.java`
- Arrays of custom objects
- Object creation and storage in arrays
- Accessing object properties from arrays

---

### ArrayList

Complete ArrayList implementation examples:

#### `BasicsOfArrayList.java` - Core Operations
```java
// Adding elements
name.add("Element");
name.add(index, "Element");
name.addFirst("First");
name.addLast("Last");

// Accessing elements
name.get(index);
name.getFirst();
name.getLast();
name.indexOf("value");

// Modifying
name.set(index, "newValue");

// Removing
name.remove(index);
name.removeLast();
name.clear();

// Checking
name.contains("value");
name.isEmpty();
name.size();
```

#### Advanced ArrayList Features
- **`AddallArrayList.java`** - Merging ArrayLists using `addAll()`
- **`CapacityArrayList.java`** - Managing ArrayList capacity with `ensureCapacity()`
- **`CloneArrayList.java`** - Deep copying ArrayLists with `clone()`
- **`IteratorArrayList.java`** - Iterating with `Iterator` and `ListIterator`
- **`LoopsOfArrayList.java`** - Different loop types (for, for-each, forEach with lambda)
- **`RemoveIfarrayList.java`** - Conditional removal using `removeIf()` with predicates
- **`ReplaceMethod.java`** - Batch updates using `replaceAll()` with lambda expressions
- **`SortingArrayListElements.java`** - Sorting with `Collections.sort()`

---

### LinkedList

#### `BasicsOfLinkedList.java`
Comprehensive LinkedList operations including:
- Add/Remove operations (first, last, at index)
- Cloning and iteration (Iterator, ListIterator)
- Conditional operations (`removeIf`, `retainAll`)
- Sorting and sub-list operations
- Converting to arrays with `toArray()`

**Key Methods Covered:**
```java
LinkedList<String> list = new LinkedList<>();
list.addFirst() / list.addLast()
list.removeFirst() / list.removeLast()
list.clone()
list.retainAll() // Keep only common elements
list.subList(start, end)
list.sort(null) // Natural ordering
```

---

### Collections Framework

#### `CollectionsBasicsMethods.java`
Essential utility methods from `java.util.Collections`:

```java
// Sorting and Searching
Collections.sort(list);
Collections.binarySearch(list, "element");
Collections.reverseOrder(); // Comparator for reverse sorting

// Min/Max operations
Collections.max(list);
Collections.min(list);

// Manipulation
Collections.shuffle(list); // Randomize order
Collections.swap(list, index1, index2);
Collections.frequency(list, element); // Count occurrences
```

---

### Set Interface

**No duplicate elements, unordered (HashSet) or sorted (TreeSet)**

#### `HashSetPrograms.java` - HashSet Basics
- Fast lookup with O(1) average time complexity
- No guaranteed order
- Basic operations: `add()`, `contains()`, `remove()`, `size()`

#### `LinkedHashSetPrograms.java` - Insertion Order
- Maintains insertion order
- Slightly slower than HashSet but predictable iteration

#### `TreeSetPrograms.java` - Sorted Set
- Elements stored in sorted order
- Implements NavigableSet interface
- O(log n) time complexity for operations

**Common Operations:**
```java
Set<String> set = new HashSet<>();
set.add("element");
set.contains("element"); // returns boolean
set.remove("element");
set.size();
set.clear();
```

---

### Map Interface

**Key-value pair storage with different implementations**

#### `BasicsOfHashMap.java` - HashMap Deep Dive

**Core Operations:**
```java
HashMap<String, String> map = new HashMap<>();
map.put(key, value);
map.get(key);
map.remove(key);
map.containsKey(key);
map.containsValue(value);
```

**Advanced Methods:**
```java
// Iteration
map.keySet();    // Get all keys
map.values();    // Get all values
map.entrySet();  // Get key-value pairs

// Computation
map.compute(key, (k, v) -> newValue);
map.computeIfAbsent(key, k -> defaultValue);
map.computeIfPresent(key, (k, v) -> updatedValue);

// Merging
map.merge(key, value, (oldVal, newVal) -> mergedValue);
map.getOrDefault(key, defaultValue);

// Bulk operations
map.putAll(anotherMap);
map.forEach((k, v) -> { /* action */ });
```

#### `LinkedHashMapBasics.java` - Predictable Iteration Order
- Maintains insertion order
- Useful for LRU cache implementation

#### `TreeMapBasics.java` - Sorted Map
- Keys sorted in natural order or by Comparator
- Implements NavigableMap interface

---

### Strings

#### `StringBufferProgram.java` - Thread-Safe Mutable Strings

**Key Features:**
- Thread-safe (synchronized)
- Mutable string operations
- Better performance than String concatenation in loops

```java
StringBuffer sb = new StringBuffer();
sb.append("text");
sb.insert(index, "text");
sb.replace(start, end, "text");
sb.delete(start, end);
sb.reverse();
sb.capacity(); // Current capacity
sb.charAt(index);
sb.deleteCharAt(index);
```

#### `StringBuilderPrograms.java` - Fast Mutable Strings
- Not thread-safe (no synchronization overhead)
- Faster than StringBuffer for single-threaded operations
- Same methods as StringBuffer

**When to Use:**
- **StringBuilder**: Single-threaded applications (most common)
- **StringBuffer**: Multi-threaded applications where thread safety is required

---

### Object-Oriented Programming

#### `ObjectClassRevision.java`
Basic object creation and instantiation with constructors.

#### `SetterGetterProgram.java`
**Encapsulation demonstration:**
- Private fields
- Public getter/setter methods
- `toString()` method override
- Constructor initialization

#### `OverloadingConstructor.java`
**Constructor Overloading:**
- Default constructor
- Parameterized constructors (1, 2, 3 parameters)
- Method overloading demonstration
- Constructor chaining concepts

#### `Bank.java`
**Interface Implementation:**
```java
interface Account {
    void acc();
    int amount();
}

class SavingAccount implements Account { /* implementation */ }
class FdAccount implements Account { /* implementation */ }
```
Demonstrates polymorphism and interface-based design.

---

### Access Modifiers

#### `SetterGetterEx.java`
**Encapsulation with Access Modifiers:**
- `private` fields for data hiding
- `public` getter/setter methods for controlled access
- Demonstrates why encapsulation matters

```java
class Employee {
    private String name;  // Cannot be accessed directly
    private int id;
    
    public void setName(String n) { this.name = n; }
    public String getName() { return name; }
}
```

---

## 🚀 Projects

Real-world applications demonstrating OOP principles and Java concepts.

### 1. **Applicant Admission System**
**Files:** `Projects/Applicant.java`, `Java/Applicant.java`

**Features:**
- Category-based admission system (GENERAL, OBC, SC, ST)
- Different cutoff marks for each category
- Eligibility checking based on marks
- Comprehensive applicant report generation
- Summary statistics (total, selected, not selected)

**Concepts Demonstrated:**
- Object-oriented design
- Switch-case statements
- Method encapsulation
- Array iteration
- Business logic implementation

**Key Methods:**
```java
checkEligibility()     // Returns boolean based on category cutoff
getCutoff()            // Returns cutoff for specific category
DisplayApplicantReport() // Prints detailed applicant information
```

---

### 2. **Employee Payroll System**
**Files:** `Projects/EmployeePayrollSystem.java`, `Java/EmployeePayRoll.java`

**Features:**
- Employee record management
- Hourly wage calculation
- Overtime pay (1.5x rate after 40 hours)
- Payroll report generation
- Total payroll expense calculation

**Business Logic:**
```java
Salary = (hoursWorked ≤ 40) 
    ? hoursWorked × hourlyRate
    : (40 × hourlyRate) + ((hoursWorked - 40) × hourlyRate × 1.5)
```

**Concepts Demonstrated:**
- ArrayList for dynamic employee storage
- Ternary operator for conditional logic
- Getter methods for encapsulation
- Aggregation relationship (PayRollSystem has Employee)

---

### 3. **KBC Quiz Game**
**File:** `Projects/KBC.java`

**Features:**
- User registration system with ID validation
- Multiple-choice quiz questions
- Point-based scoring system
- Dynamic prize calculation based on points
- Input validation

**Game Flow:**
1. User registration with ID verification
2. Sequential question answering
3. Point increment for correct answers
4. Point decrement for wrong answers (if points > 0)
5. Prize calculation based on final score

**Prize Structure:**
- 3 points: $4000
- 2 points: $2500
- 1 point: $1000

---

### 4. **Movie Ticket Booking System**
**File:** `Java/MovieTicket.java`

**Features:**
- Movie management (title, rating, price)
- Customer ticket booking
- Automatic discount calculation (10% for >5 tickets)
- Detailed ticket receipt generation

**Classes:**
- `Movie`: Stores movie details
- `Customer`: Handles customer information and booking

**Discount Logic:**
```java
if (numberOfTickets > 5) {
    totalCost = totalCost × 0.9;  // 10% discount
}
```

---

### 5. **Student Report Card System**
**File:** `Java/ReportCard.java`

**Features:**
- Multi-subject marks management
- Total and average calculation
- Grade assignment based on average
- Comprehensive report card generation

**Grading System:**
- A: ≥90%
- B: ≥80%
- C: ≥70%
- D: ≥60%
- F: <60%

**Concepts:**
- Array handling for multiple subjects
- Aggregate calculations
- Conditional grading logic

---

### 6. **Student Course Enrollment**
**File:** `Java/Studentcourse.java`

**Features:**
- Course catalog management
- Student enrollment tracking
- Enrollment details display
- Many-to-many relationship demonstration

**Classes:**
- `Course`: Course ID, name, fees
- `Student`: Student info and enrolled course

---

### 7. **Tax Calculation System**
**File:** `Java/Tax.java`

**Features:**
- Abstract class implementation
- Different tax rates for individuals and companies
- Individual: 10% tax if income > ₹500,000
- Company: 30% tax on all income

**OOP Concepts:**
- Abstract classes and methods
- Method overriding
- Polymorphism
- Type casting

```java
abstract class TaxPayer {
    abstract double calculateTax();
}

class Individual extends TaxPayer { /* 10% tax */ }
class Company extends TaxPayer { /* 30% tax */ }
```

---

### 8. **Transport Fare System**
**File:** `Java/TransportDemo.java`

**Features:**
- Polymorphic fare calculation
- Different rates for Bus, Train, Flight
- Method overriding demonstration

**Fare Rates:**
- Bus: ₹10/km
- Train: ₹8/km
- Flight: ₹50/km

**Concepts:**
- Inheritance hierarchy
- Method overriding
- Polymorphism
- Parent class reference to child objects

---

## 🏁 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or text editor
- Basic understanding of programming concepts

### Installation

1. **Clone the repository:**
```bash
git clone <your-repository-url>
cd java-learning-repository
```

2. **Compile a Java file:**
```bash
javac <PackageName>/<FileName>.java
```

3. **Run the program:**
```bash
java <PackageName>.<FileName>
```

### Example:
```bash
# Compile
javac ArrayList/BasicsOfArrayList.java

# Run
java ArrayList.BasicsOfArrayList
```

---

## 💡 How to Use This Repository

### For Beginners:
1. **Start with basics**: Begin with `ObjectClass` and `Arrays` packages
2. **Move to Collections**: Progress through `ArrayList`, `LinkedList`, `Set`, and `Map`
3. **Practice Projects**: Try the mini-projects to apply learned concepts
4. **Modify and Experiment**: Change values, add features, break things and fix them

### For Intermediate Learners:
1. **Focus on specific topics**: Jump to the package you want to learn
2. **Compare implementations**: Study different Set and Map implementations
3. **Analyze projects**: Understand the design patterns and OOP principles used
4. **Extend projects**: Add new features to existing projects

### For Revision:
1. **Quick reference**: Use this README as a quick lookup guide
2. **Code snippets**: Copy-paste snippets for common operations
3. **Concept review**: Each section explains the "why" behind the code

---

## 🛤️ Learning Path

### Level 1: Fundamentals
1. ✅ Basic syntax and data types (`Test.java`)
2. ✅ Arrays (`Arrays/` package)
3. ✅ Object-Oriented Programming (`Objectclass/` package)
4. ✅ Access Modifiers (`AccessModifiers/` package)

### Level 2: Collections Framework
1. ✅ ArrayList operations (`ArrayList/` package)
2. ✅ LinkedList basics (`LinkedList/` package)
3. ✅ Collections utility (`CollectionsBasics/` package)
4. ✅ Set implementations (`SET/` package)
5. ✅ Map implementations (`Map/` package)

### Level 3: Advanced Topics
1. ✅ String manipulation (`Strings/` package)
2. ✅ Interfaces and Abstract classes (`Bank.java`, `Tax.java`)
3. ✅ Polymorphism (`TransportDemo.java`)

### Level 4: Real-World Applications
1. ✅ Complete the mini-projects in `Projects/` and `Java/` directories
2. ✅ Understand business logic implementation
3. ✅ Learn project structure and design patterns

---

## 📝 Code Examples

### Quick ArrayList Example
```java
import java.util.ArrayList;

ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

for (String fruit : fruits) {
    System.out.println(fruit);
}
```

### Quick HashMap Example
```java
import java.util.HashMap;

HashMap<String, Integer> scores = new HashMap<>();
scores.put("Alice", 95);
scores.put("Bob", 87);

System.out.println("Alice's score: " + scores.get("Alice"));
```

### Quick Object Example
```java
class Student {
    private String name;
    private int rollNo;
    
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

// Usage
Student s = new Student("John", 101);
s.display();
```

---

## 🤝 Contributing

Feel free to contribute to this repository by:
- Adding more examples
- Improving documentation
- Fixing bugs
- Adding new projects
- Suggesting improvements

---

## 📄 License

This repository is open for educational purposes. Feel free to use, modify, and distribute the code for learning.

---

## 📧 Contact

For questions, suggestions, or discussions about this repository, feel free to reach out!

---

## 🎓 Additional Resources

### Recommended Learning Resources:
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Java Collections Framework Guide](https://docs.oracle.com/javase/tutorial/collections/)
- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java/9780134686097/)

### Practice Platforms:
- [LeetCode](https://leetcode.com/)
- [HackerRank](https://www.hackerrank.com/domains/java)
- [Codewars](https://www.codewars.com/)

---

**Happy Coding! 🚀**

*Last Updated: February 2026*
