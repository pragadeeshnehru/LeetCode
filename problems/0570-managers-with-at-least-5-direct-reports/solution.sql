# Write your MySQL query statement below
SELECT e.name FROM Employee e INNER JOIN Employee m on e.id = m.managerId GROUP BY m.managerId HAVING COUNT(m.managerId) >= 5
