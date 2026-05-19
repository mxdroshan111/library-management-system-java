**Project Goal**

This project aims to build a console-based Library Management System using Core Java.
The purpose of this project is to:

    - improve Java programming skills,
    - understand Object-Oriented Programming practically,
    - learn project structure and software design,
    - gain experience with Git and GitHub workflow,
    - build a resume-worthy Java project.

**Project Structure**

src/
│
├── model/
├── service/
├── util/
├── exception/
└── Main.java

**Entity Classes**

Book - Represents a library book.

    bookId
    bookName
    bookAuthor
    availabilityStatus

User - Base class for all users.

    userId
    userName
    borrowedBooks

Student - Represents a student user. 
          Inherits User

    rollNumber
    year

Admin - Represents library administrator.
        Inherits User

LibraryService

    Add books
    Remove books
    Search books
    Borrow books
    Return books
    Display books


**Relationships**

Student IS A User
Admin IS A User
LibraryService MANAGES books
User CAN BORROW books