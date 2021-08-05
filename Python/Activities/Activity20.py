import pandas
dataframe = pandas.read_excel('users.xlsx')
print("Rows and Columns size :", dataframe.shape)
print(dataframe["Email"])
print("Sorted data:")
print(dataframe.sort_values('FirstName'))