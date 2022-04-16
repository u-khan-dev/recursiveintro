# Problem: Given a non-negative integer n (e.g., 0, 1, 2, 3,...), find n! (n-factorial)
#
# n! = n(n-1)(n-2)...1
# example: 4! = 4*3*2*1 = 24
# Note: 0! = 1

# FACTORIAL(n)
#   if n = 0
#     then return 1
#   else
#     return n * FACTORIAL(n-1)

def factorial(n):
    if n == 0:
        return 1

    return n * factorial(n - 1)


def main():
    num = 5
    print("Factorial of ", num, "is ", factorial(num))


if __name__ == '__main__':
    main()

