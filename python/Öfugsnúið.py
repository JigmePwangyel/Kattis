arr = []
x = int(input())

for _ in range(x):
    num = int(input())
    arr.append(num)

for i in range(1, len(arr)+1):
    print(arr[-i])