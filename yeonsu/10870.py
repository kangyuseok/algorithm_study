n = int(input())
array = []

for i in range(n+1):
    if i <= 1: # 0과 1 처리
        array.append(i) 
    else:
        fibo_next = array[i-1] + array[i-2]
        array.append(fibo_next)
        print(fibo_next)

print(max(array))