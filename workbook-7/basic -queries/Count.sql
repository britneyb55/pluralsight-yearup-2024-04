USE sports;

SELECT *
FROM athletes;

SELECT EVENT, COUNT(*) as event_count
FROM athletes
GROUP BY EVENT;

SELECT EVENT, country, COUNT(*) as event_count
FROM athletes
GROUP BY EVENT, country;