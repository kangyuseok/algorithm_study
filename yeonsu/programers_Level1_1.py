def solution(friends, gifts):
    answer = 0
    n = len(friends)
    
    friend_dict = {}
    for i in range(n):
        friend_dict[friends[i]] = i
    
    table = [[0] * n for _ in range(n)]
    
    # 주고 받은 선물 내역을 표에 저장 (2차원 배열)
    # 선물 지수(gift_idx) 저장
    gift_idx = [0] * n
    
    for gift in gifts:
        a, b = gift.split(" ") # a : 준 사람, b : 받은 사람
        giver, receiver = friend_dict[a], friend_dict[b]
        gift_idx[giver] += 1
        gift_idx[receiver] -= 1
        table[giver][receiver] += 1
    
    get_gift = [0] * n
    
    # 자기 자신에게 선물할 수 없기때문에 continue
    for i in range(n):
        for j in range(n):
            if i == j:
                continue
            if table[i][j] > table[j][i] : #준게 더 많을 경우
                get_gift[i] += 1
            elif table[i][j] == table[j][i]:
                if gift_idx[i] > gift_idx[j]:
                    get_gift[i] += 1
    
    answer = max(get_gift)
    return answer