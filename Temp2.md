
Perfect — here is a complete, clean, step-by-step SQL execution flow from scratch ✅
You can run this directly in MySQL Workbench (or terminal).


---

🔷 ✅ STEP 0 — Create Database

CREATE DATABASE BookDB;
USE BookDB;


---

🔷 ✅ STEP 1 — Create Authors Table

CREATE TABLE Authors (
    author_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);


---

🔷 ✅ STEP 2 — Create Books Table (with constraint)

CREATE TABLE Books (
    book_id INT PRIMARY KEY,
    author_id INT,
    price DECIMAL(10,2),
    CHECK (price > 0),
    FOREIGN KEY (author_id) REFERENCES Authors(author_id)
);


---

🔷 ✅ STEP 3 — Insert Sample Data

-- Authors
INSERT INTO Authors VALUES
(1, 'John Smith'),
(2, 'Alice Brown'),
(3, 'David Lee');

-- Books
INSERT INTO Books VALUES
(101, 1, 300),
(102, 1, 700),
(103, 2, 450),
(104, 2, 800),
(105, 3, 600);


---

🔷 ✅ STEP 4 — Verify Data

SELECT * FROM Authors;
SELECT * FROM Books;


---

🔷 ✅ QUESTION 1


---

🔹 a) Table already created with CHECK constraint ✔

(Already done in Step 2)


---

🔹 b) Average price of books

SELECT AVG(price) AS average_price
FROM Books;

✅ Output (example)

average_price = 570


---

🔹 c) Author name and book price (JOIN)

SELECT Authors.name, Books.price
FROM Authors
JOIN Books
ON Authors.author_id = Books.author_id;

✅ Output

John Smith → 300
John Smith → 700
Alice Brown → 450
Alice Brown → 800
David Lee → 600


---

🔹 d) Books priced above average (Subquery)

SELECT *
FROM Books
WHERE price > (SELECT AVG(price) FROM Books);

✅ Output

102 → 700
104 → 800
105 → 600


---

🔹 e) Create View

CREATE VIEW Expensive_Books AS
SELECT *
FROM Books
WHERE price > 500;


---

🔹 View Output

SELECT * FROM Expensive_Books;

✅ Output

102 → 700
104 → 800
105 → 600


---

🔷 ✅ QUESTION 2 — Cursor

⚠ Since MySQL uses procedures (not PL/SQL directly), use this:


---

🔹 Cursor Implementation (MySQL version)

DELIMITER $$

CREATE PROCEDURE display_expensive_books()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE b_id INT;
    DECLARE b_price DECIMAL(10,2);

    DECLARE book_cursor CURSOR FOR
        SELECT book_id, price FROM Books WHERE price > 500;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN book_cursor;

    read_loop: LOOP
        FETCH book_cursor INTO b_id, b_price;

        IF done THEN
            LEAVE read_loop;
        END IF;

        SELECT b_id AS Book_ID, b_price AS Price;
    END LOOP;

    CLOSE book_cursor;
END$$

DELIMITER ;


---

🔹 Execute Cursor

CALL display_expensive_books();


---

✅ Output

Book_ID | Price
102     | 700
104     | 800
105     | 600


---

🎯 FINAL EXECUTION ORDER (IMPORTANT)

1. CREATE DATABASE
2. CREATE TABLE Authors
3. CREATE TABLE Books
4. INSERT DATA
5. SELECT (verify)
6. Aggregate query
7. JOIN query
8. Subquery
9. CREATE VIEW
10. SELECT VIEW
11. CREATE PROCEDURE (cursor)
12. CALL PROCEDURE


---

⚠ COMMON ERRORS (Quick Fix)

Error	Fix

Table exists	DROP TABLE first
FK error	Insert Authors first
View exists	DROP VIEW
Procedure exists	DROP PROCEDURE
DELIMITER error	Run full block



---

🚀 DONE

👉 You now have: ✔ Full working SQL flow
✔ Correct outputs
✔ Ready for demo + exam


---

If you want, I can give: ✅ Viva answers for this question
✅ Short theory to write in exam
✅ One-page cheat sheet

Just tell 👍
