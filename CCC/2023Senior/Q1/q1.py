n = int(input())
minu = 0
blackList = []
whiteList = []
status = False
status1 = False
for r in range(2):
    inputList = input().split(" ")
    i = 0
    if status:
        if int(inputList[-1]) == 1:
            minu += 1
    if int(inputList[-1]) == 1:
        status = True
    if status1:
        if int(inputList[0]) == 1:
            minu += 1
    if int(inputList[0]) == 1:
        status1 = True
    for x in inputList:
        if (int(x) == 1):
            blackList.append([r, i])
        else:
            whiteList.append([r, i])
        i += 1

if (status & status1):
    minu -= 1

# print("Ori:", end="")
print(blackList)

side = len(blackList)*3


for i in range(0, len(blackList)-1):
    status = False
    try:
        if ([blackList[i][0], blackList[i][1]-1] in blackList):
            minu += 1
            status = True
    except:
        k = None
    try:
        if ([blackList[i][0], blackList[i][1]+1] in blackList):
            minu += 1
            status = True
    except:
        k = None
    try:
        if ([blackList[i][0]+1, blackList[i][1]] in blackList):
            minu += 1
            status = True
    except:
        k = None
    if (status):
        blackList.remove(blackList[i])
    # print("Process:", end="")
    # print(blackList)

side -= minu*2
print(minu)
print(side)
