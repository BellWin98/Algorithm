def solution(s1, s2):
    answer = 0
    for i1 in s1:
        for i2 in s2:
            if i1 == i2:
                answer += 1
                break
    return answer