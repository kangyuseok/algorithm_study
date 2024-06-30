from itertools import combinations # 조합을 쉽게 만들어주는 모듈

n, k = map(int,input().split()) # 정수로 변환, 한번만 순회할 수 있음

array = list(map(int,input().split())) # 리스트로 받아~~ 여러번 순회해야하기땜시롱 list

result = 0

# 순서가 상관 없으니까 combinations 사용
# 반복 가능한 객체를 combinations에 넣어줌. 3개를 선택할거니까 3~~
for cards in combinations(array,3):
    if sum(cards) <= k: # 카드들을 더한 닶이 k보다 작거나 같은걸 찾음!
        result = max(result,sum(cards)) # result에 카드들 더한 값 중 가장 최댓값을 넣어줌
print(result) # 출력 ~~
