# Write your MySQL query statement below
select w1.id from Weather as w1 ,Weather as w2 where  datediff(w1.recordDate, w2.recordDate) = 1 AND w1.temperature>w2.temperature 
-- SELECT wt1.Id 
-- FROM Weather wt1, Weather wt2
-- WHERE wt1.temperature > wt2.temperature AND 
--       TO_DAYS(wt1.DATE)-TO_DAYS(wt2.DATE)=1;