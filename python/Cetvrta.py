coord1 = list(map(int, input().split()))
coord2 = list(map(int, input().split()))
coord3 = list(map(int, input().split()))

x_coord = []
x_coord.append(coord1[0])
x_coord.append(coord2[0])
x_coord.append(coord3[0])

y_coord = []
y_coord.append(coord1[1])
y_coord.append(coord2[1])
y_coord.append(coord3[1])

count_dict_x={}
count_dict_y={}

for item in x_coord:
    if item in count_dict_x:
        count_dict_x[item]+=1
    else:
        count_dict_x[item]=1
    
for item in y_coord:
    if item in count_dict_y:
        count_dict_y[item]+=1
    else:
        count_dict_y[item]=1

sorted_x_dict = dict(sorted(count_dict_x.items(), key=lambda item: item[1]))
sorted_y_dict = dict(sorted(count_dict_y.items(), key=lambda item: item[1]))

print(list(sorted_x_dict.keys())[0], end=" ")
print(list(sorted_y_dict.keys())[0])