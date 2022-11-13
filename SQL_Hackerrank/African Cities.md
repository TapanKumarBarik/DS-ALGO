--https://www.hackerrank.com/challenges/african-cities/problem?isFullScreen=false

SELECT c.name from CITY as  c

inner join COUNTRY as cc

on c.CountryCode=cc.Code

where cc.CONTINENT = 'Africa'
