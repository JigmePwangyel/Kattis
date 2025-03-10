data = input()
encodingStr = input()

decodedStr = ""

for i in range(1, len(encodingStr), 3): 
    value = int(encodingStr[i]+encodingStr[i+1])
    decodedCharacter = data[value-1]
    decodedStr+=decodedCharacter

print(decodedStr)