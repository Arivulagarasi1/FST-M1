dictionary=dict(Apple=100,Orange=80,Guava=70,Grapes='50')
buy=input("You want to buy: ")
if buy in dictionary:
    print(buy, "available")
else:
    print(buy, "not available")
    