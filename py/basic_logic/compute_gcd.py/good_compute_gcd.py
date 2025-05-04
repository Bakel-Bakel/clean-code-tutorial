#!/usr/bin/env python3

def find_linear_combinations(target, x, y, limit=1000):
    print("🔍 Solving...")
    for i in range(1, limit):
        for a in range(1, limit + 1):
            result = a * x - i * y
            if result == target:
                print(f"{target} = {a}*{x} - {i}*{y}")
    
    for j in range(limit):
        for a in range(1, limit + 1):
            result = a * y - j * x
            if result == target:
                print(f"{target} = {a}*{y} - {j}*{x}")

    print("\nNo more solutions. Increase engine depth if needed.\n")

def gcd_steps(x, y):
    if x < y:
        x, y = y, x  # ensure x >= y

    while y:
        print(f"{x} = {y} * {x // y} + {x % y}")
        x, y = y, x % y
    
    print(f"GCD is {x}\n")

def show_menu():
    print("="*70)
    print("Clean GCD Tool by Bakel")
    print("1. Show GCD steps")
    print("2. Express number as linear combination")
    print("="*70)

def main():
    while True:
        show_menu()
        choice = input("Enter your choice (1 or 2): ").strip()

        if choice == '1':
            a = int(input("Enter first number: "))
            b = int(input("Enter second number: "))
            gcd_steps(a, b)

        elif choice == '2':
            c = int(input("Enter target number (to express): "))
            x = int(input("Enter first number: "))
            y = int(input("Enter second number: "))
            limit = input("Set engine depth (default 1000): ").strip()
            limit = int(limit) if limit else 1000
            find_linear_combinations(c, x, y, limit)

        else:
            print("Invalid choice. Try again.")

if __name__ == "__main__":
    main()
