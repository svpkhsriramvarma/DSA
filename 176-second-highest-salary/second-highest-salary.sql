# Write your MySQL query statement below

select
ifNull(
    (
        Select 
            distinct salary
        from Employee
        order by salary desc limit 1,1
    ),null
) as SecondHighestSalary;