# Design Principles

## Single Responsibility Principle (SRP)

### Template

SRP: We assign `<class with SRP>` only one responsibility, which is `<responsibility of this class>`. This makes the class more cohesive and easier to change.

## Liskov Substitution Principle (LSP)

### Understanding

If a child is an upgraded version of the parent, when creating a method:

- Before creating the method, the child's environment should not be superior to the parent's environment (meaning, if there's an environment where the parent can run successfully, the child must also be able to run successfully).
- After creating the method, the child must do at least as much as the parent (meaning, if the parent's method accomplishes something, the child must also complete that task).

### When to use

1. Inheritance relationship between classes (using "extends" not "implements").
2. Class extends another class, whether it's abstract or not.
3. Method override is involved.

### Template

LSP: We make sure that `<subclass>` is substitutable for its `<superclass>`. This means that `<subclass>` follows the contract of `<superclass>` and does not break its functionality.

## Open-Close Principle (OCP)

### When to use

1. Multiple classes extend a common class.
2. Multiple classes implement one or more interfaces (usually after splitting ISP).

### Template

OCP: We design `<interface>` to be open for extension but closed for modification. This means that we can add new features by creating subclasses, without changing existing code.

## Interface Segregation Principle (ISP)

### Understanding

![ISP](./images/ISP.svg)

### What needs to be done

If an interface contains several methods, split it into multiple interfaces to let every interface contain only one method, and let the classes that need to implement the interface implement the corresponding interface.

### Template

ISP: We split the original interface `<original interface>` into several interfaces `<interfaces after splitting>`, so that subclasses only rely on specific interfaces they need. This avoids unnecessary implementation of methods and increases interface cohesion, making maintenance easier.

## Dependency Injection Principle (DIP)

### When to use
There is an interface, and a class uses this interface as a dependency.

### Template
DIP: We make the class that uses this interface depend on the interface itself rather than concrete implementations of it. This decouples the modules and makes them more flexible and testable.
