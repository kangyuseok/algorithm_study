import sys

# 표준 입력에서 문자열 읽기, strip 앞 뒤 공백 제거
S = sys.stdin.readline().strip()
stack = []
ans = '' # 최종 결과
check = False # 태그 내부에 있는지 여부를 나타냄

for i in S:
    if i == '<':
        check = True
        # 스택에 있는 모든 문자를 팝하여 ans에 추가
        while stack:
            ans += stack.pop()
        ans += i
    elif i == '>':
        check = False
        ans += i
    elif check:
        ans += i
    elif i == ' ':
        # 스택에 있는 모든 문자를 팝하여 ans에 추가
        while stack:
            ans += stack.pop()
        ans += ' '
    else:
        stack.append(i)

# 스택에 남아 있는 모든 문자를 팝하여 ans에 추가
while stack:
    ans += stack.pop()

print(ans)
