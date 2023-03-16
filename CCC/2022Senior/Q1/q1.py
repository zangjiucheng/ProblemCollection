x = int(input())
i = 1
count = 0
while (x > 0):
    if (x % 4 == 0):
        count += 1
    x -= i * 5
if (x % 5 == 0):
    count += 1
print(count)
