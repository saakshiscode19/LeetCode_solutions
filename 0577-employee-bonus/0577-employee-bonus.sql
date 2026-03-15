# Write your MySQL query statement below
select Employee.name, Bonus.bonus from Employee
Left join Bonus ON Employee.empID = Bonus.empID
where bonus <1000 or Bonus is NULl;