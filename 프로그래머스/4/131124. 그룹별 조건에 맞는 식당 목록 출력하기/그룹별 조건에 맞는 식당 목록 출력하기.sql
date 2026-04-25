SELECT 
    MEMBER_NAME,
    REVIEW_TEXT,
    REVIEW_DATE AS "REVIEW_DATE"
FROM 
    REST_REVIEW r
JOIN 
    MEMBER_PROFILE m ON r.MEMBER_ID = m.MEMBER_ID
WHERE 
    r.MEMBER_ID = (SELECT 
                        MEMBER_ID
                     FROM 
                        REST_REVIEW
                     GROUP BY 
                        MEMBER_ID
                     ORDER BY 
                        COUNT(REVIEW_SCORE) DESC
                     LIMIT 1)
ORDER BY REVIEW_DATE, REVIEW_TEXT;









