str = input()
alive = False
undead = False
ls = list(str)
for i in range(0,len(ls)-1):
    if ls[i]  == ':' and ls[i+1]==')':
        alive = True
    elif ls[i]  == ':' and ls[i+1]=='(':
        undead = True

if(alive and undead):
    print('double agent')
elif(alive):
    print('alive')
elif(undead):
    print('undead')
else:
    print('machine')