nameList = []
while True:
    testCase = int(input())
    if testCase == 0:
        break
    else:
        for i in range(testCase):
            nameList.append(input())
        nameList.sort()
        for i in nameList:
            print(i)
        nameList= []
        
