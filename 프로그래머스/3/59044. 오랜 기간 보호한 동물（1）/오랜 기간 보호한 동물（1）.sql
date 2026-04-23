-- 코드를 입력하세요
SELECT
    a.name AS NAME,
    a.datetime AS DATETIME
FROM
    ANIMAL_INS a
LEFT JOIN
    ANIMAL_OUTS o
        ON a.animal_id = o.animal_id
WHERE
    o.animal_id IS NULL
ORDER BY
    DATETIME
LIMIT 3;