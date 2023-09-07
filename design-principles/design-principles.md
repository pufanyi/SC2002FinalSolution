# Design Principles

## Single Responsibility Principle (SRP)

### Template

SRP: We assign only one responsibility to a class, which is `<class with SRP>`. This makes the class more cohesive and easier to change.

## Liskov Substitution Principle (LSP)

### Understanding

If a child is an upgraded version of the parent, when creating a method:

- Before creating the method, the child's environment should not be superior to the parent's environment (meaning, if there's an environment where the parent can run successfully, the child must also be able to run successfully).
- After creating the method, the child must do at least as much as the parent (meaning, if the parent's method accomplishes something, the child must also complete that task).

### When to use

Inheritance relationship between classes (using "extends" not "implements").

Class extends another class, whether it's abstract or not.
Method override is involved.

### Template

LSP: We make sure that a subclass is substitutable for its superclass. This means that the subclass follows the contract of the superclass and does not break its functionality.

- Pre-condition: No stronger
- Post-condition: No weaker

## Open-Close Principle (OCP)

### When to use
Multiple classes extend a common class.
Multiple classes implement one or more interfaces (usually after splitting ISP).

### Template
OCP: We design an interface to be open for extension but closed for modification. This means that we can add new features by creating subclasses, without changing existing code.

## Interface Segregation Principle (ISP)

### Understanding

What needs to be done

If an interface contains several methods, split it into multiple interfaces and change them to end with "able."

### Template
ISP: We split the original interface __ into several interfaces __, so that subclasses only rely on specific interfaces they need. This avoids unnecessary implementation of methods and increases interface cohesion, making maintenance easier.

## Dependency Injection Principle (DIP)

### When to use
There is an interface, and a class uses this interface as a dependency.

### Template
DIP: We make the class that uses this interface depend on the interface itself rather than concrete implementations of it. This decouples the modules and makes them more flexible and testable.
