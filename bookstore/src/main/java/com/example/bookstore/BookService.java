package com.example.bookstore;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public BookService() {

        books.add(new Book(1,"A Tale of Two Cities","Charles Dickens",500,"https://covers.openlibrary.org/b/title/A%20Tale%20of%20Two%20Cities-L.jpg",4.6,1245));
        books.add(new Book(2,"The Little Prince","Antoine de Saint-Exupéry",450,"https://covers.openlibrary.org/b/title/The%20Little%20Prince-L.jpg",4.8,2104));
        books.add(new Book(3,"Wings of Fire","A.P.J. Abdul Kalam",299,"https://covers.openlibrary.org/b/isbn/9788173711466-L.jpg",4.9,3800));
        books.add(new Book(4,"And Then There Were None","Agatha Christie",520,"https://covers.openlibrary.org/b/title/And%20Then%20There%20Were%20None-L.jpg",4.7,1842));
        books.add(new Book(5,"The Hobbit","J.R.R. Tolkien",550,"https://covers.openlibrary.org/b/title/The%20Hobbit-L.jpg",4.8,3270));
        books.add(new Book(6,"The Lion, the Witch and the Wardrobe","C.S. Lewis",480,"https://covers.openlibrary.org/b/title/The%20Lion,%20the%20Witch%20and%20the%20Wardrobe-L.jpg",4.6,1408));
        books.add(new Book(7,"The Da Vinci Code","Dan Brown",500,"https://covers.openlibrary.org/b/title/The%20Da%20Vinci%20Code-L.jpg",4.5,1950));
        books.add(new Book(8,"The Alchemist","Paulo Coelho",400,"https://covers.openlibrary.org/b/title/The%20Alchemist-L.jpg",4.8,4200));
        books.add(new Book(9,"The Catcher in the Rye","J.D. Salinger",450,"https://covers.openlibrary.org/b/title/The%20Catcher%20in%20the%20Rye-L.jpg",4.5,1600));
        books.add(new Book(10,"The Great Gatsby","F. Scott Fitzgerald",450,"https://covers.openlibrary.org/b/title/The%20Great%20Gatsby-L.jpg",4.7,2900));

        books.add(new Book(11,"To Kill a Mockingbird","Harper Lee",500,"https://covers.openlibrary.org/b/title/To%20Kill%20a%20Mockingbird-L.jpg",4.9,5000));
        books.add(new Book(12,"1984","George Orwell",480,"https://covers.openlibrary.org/b/title/1984-L.jpg",4.8,4700));
        books.add(new Book(13,"Pride and Prejudice","Jane Austen",420,"https://covers.openlibrary.org/b/title/Pride%20and%20Prejudice-L.jpg",4.7,2300));
        books.add(new Book(14,"Clean Code","Robert C. Martin",750,"https://covers.openlibrary.org/b/title/Clean%20Code-L.jpg",4.9,3200));
        books.add(new Book(15,"The Kite Runner","Khaled Hosseini",500,"https://covers.openlibrary.org/b/title/The%20Kite%20Runner-L.jpg",4.8,2800));
        books.add(new Book(16,"The Hunger Games","Suzanne Collins",550,"https://covers.openlibrary.org/b/title/The%20Hunger%20Games-L.jpg",4.7,3500));
        books.add(new Book(17,"The Fault in Our Stars","John Green",480,"https://covers.openlibrary.org/b/title/The%20Fault%20in%20Our%20Stars-L.jpg",4.6,2400));
        books.add(new Book(18,"Gone Girl","Gillian Flynn",520,"https://covers.openlibrary.org/b/title/Gone%20Girl-L.jpg",4.5,1750));
        books.add(new Book(19,"The Book Thief","Markus Zusak",500,"https://covers.openlibrary.org/b/title/The%20Book%20Thief-L.jpg",4.8,3100));
        books.add(new Book(20,"Life of Pi","Yann Martel",480,"https://covers.openlibrary.org/b/title/Life%20of%20Pi-L.jpg",4.6,2000));

        books.add(new Book(21,"The Godfather","Mario Puzo",550,"https://covers.openlibrary.org/b/title/The%20Godfather-L.jpg",4.8,2650));
        books.add(new Book(22,"The Girl on the Train","Paula Hawkins",500,"https://covers.openlibrary.org/b/title/The%20Girl%20on%20the%20Train-L.jpg",4.5,1700));
        books.add(new Book(23,"Dune","Frank Herbert",600,"https://covers.openlibrary.org/b/title/Dune-L.jpg",4.9,4100));
        books.add(new Book(24,"Animal Farm","George Orwell",420,"https://covers.openlibrary.org/b/title/Animal%20Farm-L.jpg",4.8,3900));
        books.add(new Book(25,"Rich Dad Poor Dad","Robert Kiyosaki",499,"https://covers.openlibrary.org/b/title/Rich%20Dad%20Poor%20Dad-L.jpg",4.7,4400));
        books.add(new Book(26,"The Secret","Rhonda Byrne",400,"https://covers.openlibrary.org/b/title/The%20Secret-L.jpg",4.5,2100));
        books.add(new Book(27,"Atomic Habits","James Clear",550,"https://covers.openlibrary.org/b/title/Atomic%20Habits-L.jpg",4.9,6000));
        books.add(new Book(28,"The Power of Positive Thinking","Norman Vincent Peale",420,"https://covers.openlibrary.org/b/title/The%20Power%20of%20Positive%20Thinking-L.jpg",4.6,1800));
        books.add(new Book(29,"The 7 Habits of Highly Effective People","Stephen Covey",500,"https://covers.openlibrary.org/b/title/The%207%20Habits%20of%20Highly%20Effective%20People-L.jpg",4.8,2600));
        books.add(new Book(30,"A Brief History of Time","Stephen Hawking",550,"https://covers.openlibrary.org/b/title/A%20Brief%20History%20of%20Time-L.jpg",4.7,2300));

        books.add(new Book(31,"The Old Man and the Sea","Ernest Hemingway",400,"https://covers.openlibrary.org/b/title/The%20Old%20Man%20and%20the%20Sea-L.jpg",4.6,1450));
        books.add(new Book(32,"The Adventures of Huckleberry Finn","Mark Twain",450,"https://covers.openlibrary.org/b/title/Huckleberry%20Finn-L.jpg",4.6,1500));
        books.add(new Book(33,"The Diary of Anne Frank","Anne Frank",480,"https://covers.openlibrary.org/b/title/The%20Diary%20of%20Anne%20Frank-L.jpg",4.8,3000));
        books.add(new Book(34,"The Grapes of Wrath","John Steinbeck",500,"https://covers.openlibrary.org/b/title/The%20Grapes%20of%20Wrath-L.jpg",4.5,1100));
        books.add(new Book(35,"The Outsiders","S.E. Hinton",450,"https://covers.openlibrary.org/b/title/The%20Outsiders-L.jpg",4.7,1750));
        books.add(new Book(36,"Matilda","Roald Dahl",400,"https://covers.openlibrary.org/b/title/Matilda-L.jpg",4.8,2900));
        books.add(new Book(37,"Charlie and the Chocolate Factory","Roald Dahl",420,"https://covers.openlibrary.org/b/title/Charlie%20and%20the%20Chocolate%20Factory-L.jpg",4.7,2200));
        books.add(new Book(38,"The Giver","Lois Lowry",430,"https://covers.openlibrary.org/b/title/The%20Giver-L.jpg",4.6,1650));
        books.add(new Book(39,"The Help","Kathryn Stockett",500,"https://covers.openlibrary.org/b/title/The%20Help-L.jpg",4.7,2100));
        books.add(new Book(40,"The Lovely Bones","Alice Sebold",480,"https://covers.openlibrary.org/b/title/The%20Lovely%20Bones-L.jpg",4.5,1300));

        books.add(new Book(41,"The Silent Patient","Alex Michaelides",550,"https://covers.openlibrary.org/b/title/The%20Silent%20Patient-L.jpg",4.8,2500));
        books.add(new Book(42,"Jane Eyre","Charlotte Bronte",470,"https://covers.openlibrary.org/b/title/Jane%20Eyre-L.jpg",4.7,1850));
        books.add(new Book(43,"Brave New World","Aldous Huxley",510,"https://covers.openlibrary.org/b/title/Brave%20New%20World-L.jpg",4.7,2200));
        books.add(new Book(44,"It Ends With Us","Colleen Hoover",500,"https://covers.openlibrary.org/b/title/It%20Ends%20With%20Us-L.jpg",4.8,4700));
        books.add(new Book(45,"Dracula","Bram Stoker",500,"https://covers.openlibrary.org/b/title/Dracula-L.jpg",4.6,1900));
        books.add(new Book(46,"Frankenstein","Mary Shelley",450,"https://covers.openlibrary.org/b/title/Frankenstein-L.jpg",4.6,1700));
        books.add(new Book(47,"The Chronicles of Narnia","C.S. Lewis",650,"https://covers.openlibrary.org/b/title/The%20Chronicles%20of%20Narnia-L.jpg",4.8,3500));
        books.add(new Book(48,"Ikigai","Hector Garcia",450,"https://covers.openlibrary.org/b/title/Ikigai-L.jpg",4.8,3900));
        books.add(new Book(49,"Crime and Punishment","Fyodor Dostoevsky",590,"https://covers.openlibrary.org/b/title/Crime%20and%20Punishment-L.jpg",4.7,1550));
        books.add(new Book(50,"The Picture of Dorian Gray","Oscar Wilde",480,"https://covers.openlibrary.org/b/title/The%20Picture%20of%20Dorian%20Gray-L.jpg",4.6,1450));
        books.add(new Book(51,"The Pragmatic Programmer","Andrew Hunt",820,"https://covers.openlibrary.org/b/title/The%20Pragmatic%20Programmer-L.jpg",4.9,4100));
        books.add(new Book(52,"Treasure Island","Robert Louis Stevenson",430,"https://covers.openlibrary.org/b/title/Treasure%20Island-L.jpg",4.6,1300));
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(int id) {
        return books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
