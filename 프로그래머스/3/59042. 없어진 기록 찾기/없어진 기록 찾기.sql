-- 방법 1 : LEFT JOIN 사용
SELECT O.ANIMAL_ID, O.NAME 
FROM ANIMAL_OUTS O 
LEFT JOIN ANIMAL_INS I 
ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.ANIMAL_ID IS NULL
ORDER BY O.ANIMAL_ID;

-- 방법 2 : INNER JOIN 사용
# SELECT ANIMAL_ID, NAME 
# FROM ANIMAL_OUTS 
# WHERE ANIMAL_ID NOT IN
# (SELECT O.ANIMAL_ID 
#  FROM ANIMAL_OUTS O 
#  INNER JOIN ANIMAL_INS I 
#  ON O.ANIMAL_ID = I.ANIMAL_ID)
# ORDER BY ANIMAL_ID;