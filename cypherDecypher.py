
encodingString = input()
cases = int(input())


def findCorresponding(str):
    encodedMessage=""
    for i in range(len(str)):
        value = ord(str[i])-ord('A')
        newCharIndex = value*int(encodingString[i]) % 26
        newChar = chr(newCharIndex+ord('A'))
        encodedMessage+=newChar
    print(encodedMessage)
    
for _ in range(cases): 
    str = input().upper()
    findCorresponding(str)