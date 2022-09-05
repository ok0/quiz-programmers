-- https://school.programmers.co.kr/learn/courses/30/lessons/59040
-- 코드를 입력하세요
SELECT
    ANIMAL_TYPE, COUNT(*) AS `cnt`
FROM
    ANIMAL_INS
WHERE
    ANIMAL_TYPE IN ('Cat', 'Dog')
GROUP BY ANIMAL_TYPE
ORDER BY FIELD(ANIMAL_TYPE, 'Cat', 'Dog')
;