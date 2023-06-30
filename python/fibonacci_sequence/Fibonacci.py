class Fibonacci:
    def fibonacci(n):
        sequence = []
        a, b = 0, 1

        while len(sequence) < n:
            sequence.append(a)
            a, b = b, a + b
        return sequence


fibonacci = Fibonacci()