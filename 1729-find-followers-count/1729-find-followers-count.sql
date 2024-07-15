# Write your MySQL query statement below
SELECT DISTINCT user_id , count(distinct follower_id) AS followers_count
FROM followers
GROUP BY user_id
order by user_id asc;