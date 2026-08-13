def solution(array):
    answer = []
    max_num = max(array)
    answer.append(max_num)
    
    for i in range(0, len(array)):
        if array[i] == max_num:
            answer.append(i)
            break
    
    return answer