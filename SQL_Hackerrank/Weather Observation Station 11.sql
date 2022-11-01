--Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.

SELECT distinct city FROM station

where city not like '%[aeiou]' 

or city not like '[aeiou]%'
