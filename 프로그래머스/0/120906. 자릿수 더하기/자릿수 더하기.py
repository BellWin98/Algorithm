def solution(n):
    answer = 0
    strnum = str(n)
    for i in range(0, len(strnum)):
        answer += int(strnum[i])
    return answer