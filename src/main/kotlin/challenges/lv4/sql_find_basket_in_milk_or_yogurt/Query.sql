-- https://school.programmers.co.kr/learn/courses/30/lessons/62284
-- 코드를 입력하세요
SELECT
    DISTINCT MILK.CART_ID
FROM (
        SELECT
            CART_ID
        FROM
            CART_PRODUCTS
        WHERE NAME IN ('Milk')
    ) AS MILK
    INNER JOIN (
        SELECT
            *
        FROM
            CART_PRODUCTS
        WHERE NAME IN ('Yogurt')
    ) AS YOGURT
    ON MILK.CART_ID = YOGURT.CART_ID
;