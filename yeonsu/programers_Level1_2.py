# [시전 시간, 초당 회복량, 추가 회복량] , 체력 , [공격 시간, 피해량]
def solution(bandage, health, attacks):
    max_health = health # 최대 체력
    max_time = attacks[-1][0] # 공격 시간의 가장 마지막 리스트의 0번째 요소를 가져옴
    attack_dict = {} # 딕셔너리 초기화
    for i in attacks: 
        attack_dict[i[0]] = i[1] # key,value값으로 딕셔너리 채움
    
    time = 0 # 시간
    
    continued = 0 # 연속 성공 시간
    
    while time <= max_time: # 최대 시간동안 계속
        
        if time in attack_dict: # 시간이 attack_dict의 키값과 일치하는지 확인
            health -= attack_dict[time] # attack_dict 키값의 데미지만큼 체력 감소
            continued = 0 # 0으로 초기화
            
            # 체력이 0 이하 -1 return
            if health <= 0:
                return -1
            
        else :
            continued += 1
            if continued < bandage[0]: # 연속 성공이 기술 시간보다 작으면
                health += bandage[1] # 초당 회복량만큼 체력 증가
                if health > max_health: # 최대 체력보다 넘어가지 않게
                    health = max_health
            else :
                continued = 0 # 연속 성공 시간 초기화
                health += bandage[1] + bandage[2] # 체력 = 체력 + 초당회복량 + 추가 회복량
                if health > max_health:
                    health = max_health

        time += 1 # 시간 +1
    return health # 남은 체력 return