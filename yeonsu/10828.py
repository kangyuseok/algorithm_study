def stack_operations():
    stack = [] # 스택 리스트
    n = int(input().strip()) # 정수 한번만 받기

    commands = [] # 명령어들 리스트 
    for _ in range(n): # 입력받은 정수만큼 반복
        command = input().strip() # \n 방지하기 위해 strip() 사용(앞 뒤 공백 제거용)
        commands.append(command)

    for command in commands: # 리스트에 들어있는 만큼 반복 
        x = command.split() # 입력받은 명령어와 정수 나눠주기
        if x[0] == 'push':
            stack.append(int(x[1])) # 문자로 받은걸 정수형으로 변환해 스택에 추가
        elif x[0] == 'pop':
            if stack: # 스택에 정수가 있을 때
                print(stack.pop()) # 가장 위에 있는 값 제거하고 출력
            else: # 스택에 정수가 없을 때
                print(-1) # -1 출력
        elif x[0] == 'size':
            print(len(stack)) # 스택의 길이를 출력
        elif x[0] == 'empty':
            if not stack: # 스택에 정수가 없다면
                print(1) # 1 출력
            else:
                print(0) # 0 출력
        elif x[0] == 'top': 
            if stack: # 스택에 정수가 있을 때
                print(stack[-1]) # 스택의 가장 위의 부분을 출력
            else:
                print(-1) # -1 출력

stack_operations()