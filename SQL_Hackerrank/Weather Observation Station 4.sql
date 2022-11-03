--Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
--The STATION table is described as follows:

--https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg

--where LAT_N is the northern latitude and LONG_W is the western longitude.

--For example, if there are three records in the table with CITY values 'New York', 'New York', 'Bengalaru', there are 2 different city names: 'New York' and 'Bengalaru'. The query returns , because .



select (
(select count(city) from STATION )
    -
(select count( DISTINCT  city) from STATION )
)