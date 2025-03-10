expected = [1,1,2,2,2,8]
pieces = list(map(int,input().split()))
for i in range(0,len(pieces)):
    print(expected[i]-pieces[i], end=' ')
