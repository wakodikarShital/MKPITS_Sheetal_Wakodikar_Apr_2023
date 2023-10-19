-- 1. What is an index in SQL, and how does it improve query performance?


-- 1. What is an index in SQL ?
Ans : In SQL, an index is a special lookup table that helps speed up data retrieval. Indexes are used to improve query performance by allowing the database to quickly locate the data requested by a query.
The CREATE INDEX command is used to create indexes in tables (allows duplicate values).Indexes are used to retrieve data from the database very fast. The users cannot see the indexes, they are just used to speed up searches/queries.
There are two main types of indexes: 
1) clustered 
2) non-clustered. 

1) clustered
A clustered index is an index in which the physical order of the rows in a table is the same as the order of the index. In other words, the rows in the table are stored in the same order as the index.

2) non-clustered. 
A non-clustered index is an index in which the physical order of the rows in a table is not the same as the order of the index. Instead, the index contains a separate data structure that maps the values in the indexed column(s) to the location of the corresponding rows in the table.

-- how does it improve query performance?
Ans : Index helps to optimize the query by improving the speed and efficiency of retrieval data from a table .