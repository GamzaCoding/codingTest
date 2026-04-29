-- 코드를 입력하세요
SELECT
    p.product_id,
    p.product_name,
    SUM(p.price * o.amount) AS TOTAL_SALES
FROM
    FOOD_ORDER o
JOIN
    FOOD_PRODUCT p ON o.product_id = p.product_id
WHERE
    YEAR(o.produce_date) = 2022 AND MONTH(o.produce_date) = 5
GROUP BY
    p.product_id
ORDER BY
    TOTAL_SALES DESC, p.product_id;

    
    