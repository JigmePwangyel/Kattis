ls = []
x = int(input())
for i in range(x):
    ls.append(int(input()))

maxValue = max(ls)
y = range(1,maxValue)
dupli = []
for i  in range(1, maxValue):
    if i not in ls:
        dupli.append(i)

if len(dupli)==0:
    print('good job')
else:
    for i in range(len(dupli)):
        print(dupli[i])
