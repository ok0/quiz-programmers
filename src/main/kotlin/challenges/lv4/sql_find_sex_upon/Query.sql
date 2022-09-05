-- https://school.programmers.co.kr/learn/courses/30/lessons/59045
-- 코드를 입력하세요
SELECT
    ANIMAL_INS.ANIMAL_ID, ANIMAL_INS.ANIMAL_TYPE, ANIMAL_INS.NAME
FROM
    ANIMAL_INS
    INNER JOIN ANIMAL_OUTS
    ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
WHERE
    ANIMAL_INS.SEX_UPON_INTAKE IN ('Intact Male', 'Intact Female')
    AND ANIMAL_OUTS.SEX_UPON_OUTCOME NOT IN ('Intact Male', 'Intact Female')
;