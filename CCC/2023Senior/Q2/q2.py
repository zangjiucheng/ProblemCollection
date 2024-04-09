n = int(input())
outList = []
outList.append(0)
inputList = input().split(" ")
# print(inputList)
for length in range(2, n+1):  # length mean each time of length
    absValueList = []
    # print("length:", length)
    for start in range(0, n):  # start mean each time of start position
        absValue = None
        if (start+length) <= n:
            checkList = inputList[start:start+length]
            for x in range(0, int(length/2)):
                if absValue == None:
                    absValue = 0
                absValue += abs(int(checkList[x]) - int(checkList[length-x-1]))
                print("absValue:", absValue)
        if absValue != None:
            absValueList.append(absValue)
    # print(absValueList)
    # print("min:", min(absValueList))
    outList.append(min(absValueList))

for x in outList:
    print(x, end=" ")
