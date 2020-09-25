## Project for TDD

### Prerequirement

* Git
* JDK 8
* Gradle: `brew install gradle`

### Initialize

```bash
mkdir tdd-fibonacci-numbers
cd tdd-fibonacci-numbers
gradle init
    - groovy
    - junit
touch README.md
git init
git add .
git commit -m "Initialize."
```

### Fibonacci Numbers

- First `50` Fibonacci Numbers
- `1 1 2 3 5 8 13 21 34 55 89 144 … 12_586_269_025L`

### Contents

* TDD
    - `Tasking`
    - `Red`
    - `Green`
    - `Refactor: Blue`
* BDD
    - `GIVEN`
    - `WHEN`
    - `THEN`
* Test cases
    - `< 0`
    - `= 1`
    - `= 2`
    - `>= 3 & < 50`
    - `= 50`
    - `> 50`
* Recursion -> Loop -> Stream
