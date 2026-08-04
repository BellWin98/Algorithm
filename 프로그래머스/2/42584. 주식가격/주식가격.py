from collections import deque

def solution(prices):
    answer = [0] * len(prices)
    q = deque(prices)
    
    idx = 0
    while q:
        count = 0
        target = q.popleft()
        for number in q:
            count += 1
            if target > number:
                break
        answer[idx] = count
        idx += 1

    return answer