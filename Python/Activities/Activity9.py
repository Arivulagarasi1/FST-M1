list1=[11,12,13,14,15,16]
list2=[1,2,3,4,5,6]
list3=[]
for list in list1:
   if(list%2!=0):
       list3.append(list)

for list in list2:
   if(list%2==0):
       list3.append(list)

print(list3)