# Write your MySQL query statement below
-- select v.customer_id, count(distinct(t.visit_id)) as count_no_trans from Visits as v join Transactions as t where Transaction_id is null 
-- SELECT DISTINCT customer_id,
--                 count(customer_id) AS count_no_trans
-- FROM visits v
-- LEFT JOIN transactions t ON v.visit_id = t.visit_id
-- WHERE transaction_id IS NULL
-- GROUP BY customer_id
-- ORDER BY NULL;

select  customer_id  , count(customer_id) as  count_no_trans  from Visits as v left join Transactions as t on v.visit_id = t.visit_id where transaction_id is null  group by customer_id 