# Write your MySQL query statement below
select
    *
from
    Users
where
    mail regexp '^[A-Za-z][A-Za-b0-9_\.\-]*@leetcode[.]com$' and
    mail like binary '%@leetcode.com';