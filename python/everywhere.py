test = int(input())
str = []
duplicates=0
for i in range(0,test):
    workTrips = int(input())
    for j in range(0,workTrips):
        str.append(input())
    str.sort()
    for k in range(0,len(str)-1):
        if str[k]==str[k+1]:
            duplicates+=1
    print(len(str)-duplicates)
    str.clear()
    duplicates=0
