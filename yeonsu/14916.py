import sys
S = int(sys.stdin.readline())
count = 0
while True:
    if S % 5 == 0:
        count += S//5
        break
    else:
        S -= 2
        count += 1
    
    if S < 0 :
        break

if S < 0:
    print(-1)
else:
    print(count)