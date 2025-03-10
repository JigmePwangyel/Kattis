def getImportedTurtle(turtle): 
    previousTurtle = turtle[0]
    totalImports=0

    for i in range(1, len(turtle)-1): 
        if(turtle[i]>2*previousTurtle): 
            totalImportedTurtle = turtle[i]-previousTurtle*2
            totalImports+=totalImportedTurtle
        previousTurtle = turtle[i]      
    print(totalImports)

cases = int(input())

for _ in range(cases):
    turtle = list(map(int, input().split()))
    getImportedTurtle(turtle)
