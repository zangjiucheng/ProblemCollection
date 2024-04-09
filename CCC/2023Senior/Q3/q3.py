i = input().split(" ")
inputList = []
for x in i:
    inputList.append(int(x))

wordList = []
row = inputList[2]
line = inputList[3]

length = inputList[1]
numLine = inputList[0]

letterList = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
              'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

for x in range(numLine):
    word = []
    # for y in range(length):
    if (line >= 0):
        word += (letterList[:int(length/2)])
        print(letterList[:int(length/2)])
        word.append((letterList[:int(length/2)]).reverse())
        line -= 1
    print(word)


print(inputList)
