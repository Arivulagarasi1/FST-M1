def fibo(n):
    if n<=1:
        return 1
    else:
        return (fibo(n-1)+fibo(n-2))

n=int(input("Enter number: "))
if n>0:
    for i in range(n):
        print(fibo(i))
else:
    print("Invalid Number")