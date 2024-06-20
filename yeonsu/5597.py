input_num = []

for i in range(28):
    x = int(input().strip())
    input_num.append(x)

input_set = set(input_num)

for i in range(1,31):
    if i not in input_set:
        print(i)