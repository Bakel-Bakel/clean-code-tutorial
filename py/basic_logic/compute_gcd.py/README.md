
# 🧼 Clean GCD Tool — Refactoring Messy Code

This project presents a **clean code refactor** of a Python script that:
- Calculates the **GCD (Greatest Common Divisor)** of two numbers step-by-step
- Expresses a target number as a **linear combination** of two other integers (e.g., `c = a*x - b*y`)

The original code worked — but it was hard to read, extend, and maintain.  
This version applies **Clean Code principles** to improve clarity, structure, and usability.

---

## 🚫 The Original Code (What Needed Improvement)

```python
def brute(c,x,y,n):
    i=1
    while i < n:
        for a in range(1,n+1):
            c2 = a*x - i*y
            if c2 == c:
                print(c,"= "+str(a)+"."+str(x)+" - "+str(i)+"."+str(y))
        i+=1
```

### ❌ Problems:
- Function name `brute` is vague.
- Variables like `i`, `a`, `c2` are unclear.
- String concatenation with `+str()` is clunky.
- No comments or explanation of what's going on.
- Logic is tightly coupled with print statements.

---

## ✅ The Refactored Code

```python
def find_linear_combinations(target, x, y, limit=1000):
    print("🔍 Solving...")
    for i in range(1, limit):
        for a in range(1, limit + 1):
            result = a * x - i * y
            if result == target:
                print(f"{target} = {a}*{x} - {i}*{y}")
```

### ✅ Improvements:
- **Descriptive name**: `find_linear_combinations` tells you what it does.
- **Readable variables**: `target`, `result`, `limit` are self-explanatory.
- **Formatted strings**: `f"{a}*{x}"` is cleaner than `str(a)+"*"+str(x)`
- **Optional parameter**: `limit=1000` allows reuse with defaults.

---

## 🧠 Clear GCD Steps

```python
def gcd_steps(x, y):
    if x < y:
        x, y = y, x

    while y:
        print(f"{x} = {y} * {x // y} + {x % y}")
        x, y = y, x % y

    print(f"✅ GCD is {x}")
```

- This version shows **exactly what’s happening** at each division step.
- No nested function calls or confusing recursion.

---

## 🖥️ A Simple, Clean Menu Loop

```python
def main():
    while True:
        show_menu()
        choice = input("Enter your choice (1 or 2): ").strip()

        if choice == '1':
            ...
        elif choice == '2':
            ...
        else:
            print("❌ Invalid choice. Try again.")
```

- Replaces dangerous recursion (`inputs()` calling itself) with a **safe loop**
- Separates user interface (`main`) from logic (`gcd_steps`, `find_linear_combinations`)
- Easier to maintain and test

---

## ✨ Other Clean Code Improvements

| Problem in Original | Fix in Refactored Version |
|---------------------|----------------------------|
| Magic number `1000` | Parameterized as `limit`   |
| No structure        | Clearly defined `main()` entry point |
| No documentation    | Descriptive function names + structure |
| Inconsistent indentation | Uniform, readable layout |
| No separation of concerns | Logic and user input are clearly separated |

---

## 🧪 Try It Yourself

Clone the repo and run:

```bash
python compute_gcd.py
```

---

## 📚 What You Learn

This is a great exercise in:

- Turning working-but-messy code into professional-grade scripts
- Writing readable and self-explanatory Python
- Avoiding tightly coupled I/O and logic
- Structuring programs for real-world collaboration

---

## 🧼 Because messy code works... until it doesn’t.

Clean code doesn’t just run — it lasts.

#clean-code #refactoring #python #gcd #softwarequality
