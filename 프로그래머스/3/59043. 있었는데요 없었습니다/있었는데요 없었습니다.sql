-- 코드를 입력하세요
SELECT
    a.animal_id,
    a.name
FROM
    ANIMAL_INS a
JOIN
    ANIMAL_OUTS o
        ON a.ANIMAL_ID = o.ANIMAL_ID
WHERE
    a.DATETIME > o.DATETIME
ORDER BY
    a.DATETIME;