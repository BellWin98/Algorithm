def solution(my_string):
    sum = 0
    for c in my_string:
        if c.isdigit():
            sum += int(c)
    return sum