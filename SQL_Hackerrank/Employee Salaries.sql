--https://www.hackerrank.com/challenges/salary-of-employees/problem?isFullScreen=false

SELECT name FROM Employee
WHERE salary>2000 AND months<10
order by employee_id
