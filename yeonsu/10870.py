# 원래 푼 코드 (재귀함수) --- 런타임 에러, 넘 오래걸림
n = int(input())
def fibo(n):
    if n==1 or n==2:
        return 1
    else :
        return fibo(n-1) + fibo(n-2)

print(fibo(n))


# 반복문으로 다시 풀었음
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