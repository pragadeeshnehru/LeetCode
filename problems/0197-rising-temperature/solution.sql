# Write your MySQL query statement below
SELECT DISTINCT t.id FROM Weather y CROSS JOIN Weather t WHERE DATEDIFF(t.recordDate , y.recordDate) = 1 AND t.temperature > y.temperature;
