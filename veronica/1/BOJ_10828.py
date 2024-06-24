import sys
num = int(sys.stdin.readline())

lst = []

def push():
    lst.append(number)

def pop():
    if(len(lst) == 0):
        print("-1")
    else:
        print(lst[-1])
        lst.pop()

def size():
    print(len(lst))

def empty():
    if(len(lst) == 0):
        print("1")
    else:
        print("0")

def top():
    if(len(lst) == 0):
        print("-1")
    else:
        print(lst[-1])







for n in range(num):
    
    input_line = sys.stdin.readline().strip().split()
    
    command = input_line[0]
    number = int(input_line[1]) if (len(input_line)) > 1 else None

    if (command == "push"):
        push()
    elif (command == "pop"):
        pop()
    elif (command == "size"):
        size()
    elif (command == "empty"):
        empty()
    elif (command == "top"):
        top()




