hours, minutes = map(int, input().split())

finalMinutes = 0
finalHour = 0

minutesSubtract = minutes - 45

if(minutesSubtract<0):
    finalMinutes = 60 + minutesSubtract
    if hours == 0: 
        finalHour = 23
    else:
        finalHour=hours-1
else:
    finalHour = hours
    finalMinutes=minutesSubtract

print(finalHour, end=" ")
print(finalMinutes, end=" ")