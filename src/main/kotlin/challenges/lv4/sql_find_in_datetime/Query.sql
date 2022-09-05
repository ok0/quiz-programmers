-- https://school.programmers.co.kr/learn/courses/30/lessons/59413
-- 코드를 입력하세요
SET @HOUR = -1;

SELECT
    D.`HOUR`, SUM(D.`COUNT`) AS `COUNT`
FROM (
    (
        SELECT
            (@HOUR := @HOUR +1) AS `HOUR`,
            0 AS `COUNT`
        FROM
            ANIMAL_OUTS
        WHERE
            @HOUR < 23
    )
    UNION ALL
    (
        SELECT
            HOUR(DATETIME) AS `HOUR`,
            COUNT(*) AS `COUNT`
        FROM
            ANIMAL_OUTS
        GROUP BY HOUR(DATETIME)
    )
) AS D
GROUP BY D.`HOUR`
ORDER BY D.`HOUR` ASC
;