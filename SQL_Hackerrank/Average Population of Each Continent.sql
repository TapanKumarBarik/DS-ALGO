--https://www.hackerrank.com/challenges/average-population-of-each-continent/problem?isFullScreen=false

SELECT cc.continent, AVG(c.population) from CITY as  c
inner join COUNTRY as cc
on c.CountryCode=cc.Code
group by cc.continent
