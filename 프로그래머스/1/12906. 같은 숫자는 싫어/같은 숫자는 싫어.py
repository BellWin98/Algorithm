def solution(arr):
    stack = []
    for num in arr:
        if stack:
            if stack[-1] != num:
                stack.append(num)
        else:
            stack.append(num)
    return stack