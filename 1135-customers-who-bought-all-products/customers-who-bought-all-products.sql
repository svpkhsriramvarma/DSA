WITH cte AS (
    SELECT COUNT(DISTINCT product_key) AS total_products
    FROM Product
)
SELECT 
    c.customer_id
FROM 
    Customer c
    JOIN cte
WHERE 1
GROUP BY 
    c.customer_id
HAVING 
    COUNT(DISTINCT c.product_key) = MAX(cte.total_products);
