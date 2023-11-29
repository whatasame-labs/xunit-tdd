# xUnit TDD

This project is a TDD implementation of the xUnit testing framework using pure Java.

## Feature

Supported features:

- [x] Run testable method
    - [x] Support annotation based test
    - [ ] Throw exception if test method is not found
- [x] Run setUp() before testable method
    - [x] Must be run before each testable method
- [x] Run tearDown() after testable method
    - [ ] Must be run even if the testable method fails
- [x] Collect testable results
    - [ ] Collect failed test method names and causes.
- [x] Run TestSuite a collection of testable cases and testable suites
    - [x] Collect testable cases
    - [x] Collect testable suites

## About

### Implementation environment

- Java 17

### References

- [Test-Driven Development: By Example](https://www.yes24.com/Product/Goods/12246033)
- [xUnit 테스팅 프레임워크를 TDD로 만들어보자](https://www.youtube.com/watch?v=tdKFZcZSJmg)
- [테스팅 프레임워크는 직접 만들어 써보자](https://toby.epril.com/5)
