n = input().split()
k = input().split()

for i in range(0,int(n[0])):
    arr = input().split()

def findMax():
    max=0
    for i in range(0,int(n[0])):
        count = 0
        for j in range(0,int(n[0])):
            if (arr[i]==arr[j]):
                count = count+1
        if (count>=max):
            max=count

max = findMax()
remove=0
for i in range(0,int(n[0])):
    if(arr[i]==max):
        arr.remove(max)
if remove==int(k[0]):
    print(max)
else:
    findMax()
print(max)
