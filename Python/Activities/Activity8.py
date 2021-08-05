list = list(input("Enter values in the list: ").split(","))
size=int(len(list))
if(list[0]==list[size-1]):
    print("True")
else:
   print("False") 