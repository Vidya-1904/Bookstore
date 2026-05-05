package com.example.bookstore;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public BookService() {

        books.add(new Book(1,"A Tale of Two Cities","Charles Dickens",500,"https://covers.openlibrary.org/b/title/A%20Tale%20of%20Two%20Cities-L.jpg",4.6,1245,
            "A gripping story set during the French Revolution, following lives torn apart by war, sacrifice, and love."));

        books.add(new Book(2,"The Little Prince","Antoine de Saint-Exupéry",450,"https://covers.openlibrary.org/b/title/The%20Little%20Prince-L.jpg",4.8,2104,
            "A poetic tale of a young prince exploring planets, reflecting on love, loneliness, and what truly matters."));

        books.add(new Book(3,"Wings of Fire","A.P.J. Abdul Kalam",299,"https://covers.openlibrary.org/b/isbn/9788173711466-L.jpg",4.9,3800,
            "The inspiring autobiography of India's beloved scientist and former President Dr. A.P.J. Abdul Kalam."));

        books.add(new Book(4,"And Then There Were None","Agatha Christie",520,"https://covers.openlibrary.org/b/title/And%20Then%20There%20Were%20None-L.jpg",4.7,1842,
            "Ten strangers are lured to an island and killed one by one. A masterpiece of suspense and mystery."));

        books.add(new Book(5,"The Hobbit","J.R.R. Tolkien",550,"https://covers.openlibrary.org/b/title/The%20Hobbit-L.jpg",4.8,3270,
            "Bilbo Baggins embarks on an unexpected adventure with dwarves and a wizard to reclaim a dragon-guarded treasure."));

        books.add(new Book(6,"The Lion, the Witch and the Wardrobe","C.S. Lewis",480,"https://covers.openlibrary.org/b/title/The%20Lion,%20the%20Witch%20and%20the%20Wardrobe-L.jpg",4.6,1408,
            "Four children discover a magical world through a wardrobe and join the lion Aslan in battle against the White Witch."));

        books.add(new Book(7,"The Da Vinci Code","Dan Brown",500,"https://covers.openlibrary.org/b/title/The%20Da%20Vinci%20Code-L.jpg",4.5,1950,
            "A murder in the Louvre leads to clues hidden in Da Vinci's works, unraveling a centuries-old secret society."));

        books.add(new Book(8,"The Alchemist","Paulo Coelho",400,"https://covers.openlibrary.org/b/title/The%20Alchemist-L.jpg",4.8,4200,
            "A shepherd boy travels from Spain to Egypt in search of treasure, discovering the true riches lie within himself."));

        books.add(new Book(9,"The Catcher in the Rye","J.D. Salinger",450,"https://covers.openlibrary.org/b/title/The%20Catcher%20in%20the%20Rye-L.jpg",4.5,1600,
            "Holden Caulfield wanders New York after expulsion, wrestling with identity, belonging, and the phoniness of adult life."));

        books.add(new Book(10,"The Great Gatsby","F. Scott Fitzgerald",450,"https://covers.openlibrary.org/b/title/The%20Great%20Gatsby-L.jpg",4.7,2900,
            "A mysterious millionaire pursues his lost love in Jazz Age America, exposing the hollow promise of the American Dream."));

        books.add(new Book(11,"To Kill a Mockingbird","Harper Lee",500,"https://covers.openlibrary.org/b/title/To%20Kill%20a%20Mockingbird-L.jpg",4.9,5000,
            "A young girl in the American South watches her father defend a Black man unjustly accused of a terrible crime."));

        books.add(new Book(12,"1984","George Orwell",480,"https://covers.openlibrary.org/b/title/1984-L.jpg",4.8,4700,
            "In a totalitarian future, Winston Smith dares to think freely in a world where Big Brother watches every move."));

        books.add(new Book(13,"Pride and Prejudice","Jane Austen",420,"https://covers.openlibrary.org/b/title/Pride%20and%20Prejudice-L.jpg",4.7,2300,
            "Elizabeth Bennet navigates love, class, and family pressures while sparring with the proud Mr. Darcy."));

        books.add(new Book(14,"Clean Code","Robert C. Martin",750,"https://covers.openlibrary.org/b/title/Clean%20Code-L.jpg",4.9,3200,
            "A handbook of agile software craftsmanship teaching developers how to write readable, maintainable, and elegant code."));

        books.add(new Book(15,"The Kite Runner","Khaled Hosseini",500,"https://covers.openlibrary.org/b/title/The%20Kite%20Runner-L.jpg",4.8,2800,
            "A story of friendship, betrayal, and redemption set against the turbulent history of Afghanistan."));

        books.add(new Book(16,"The Hunger Games","Suzanne Collins",550,"https://covers.openlibrary.org/b/title/The%20Hunger%20Games-L.jpg",4.7,3500,
            "Katniss volunteers for a deadly televised competition to save her sister, sparking a revolution against a brutal regime."));

        books.add(new Book(17,"The Fault in Our Stars","John Green",480,"https://covers.openlibrary.org/b/title/The%20Fault%20in%20Our%20Stars-L.jpg",4.6,2400,
            "Two teenagers with cancer fall deeply in love and find humor and hope in the face of life's hardest realities."));

        books.add(new Book(18,"Gone Girl","Gillian Flynn",520,"https://covers.openlibrary.org/b/title/Gone%20Girl-L.jpg",4.5,1750,
            "On their anniversary, a wife vanishes and her husband becomes the prime suspect in a chilling psychological thriller."));

        books.add(new Book(19,"The Book Thief","Markus Zusak",500,"https://covers.openlibrary.org/b/title/The%20Book%20Thief-L.jpg",4.8,3100,
            "Narrated by Death, a young girl in Nazi Germany steals books to cope with loss, finding power in words and stories."));

        books.add(new Book(20,"Life of Pi","Yann Martel",480,"https://covers.openlibrary.org/b/title/Life%20of%20Pi-L.jpg",4.6,2000,
            "A boy survives a shipwreck and spends 227 days on a lifeboat with a Bengal tiger in this philosophical adventure."));

        books.add(new Book(21,"The Godfather","Mario Puzo",550,"https://covers.openlibrary.org/b/title/The%20Godfather-L.jpg",4.8,2650,
            "The powerful saga of the Corleone crime family, exploring loyalty, power, betrayal, and the dark side of the American Dream."));

        books.add(new Book(22,"The Girl on the Train","Paula Hawkins",500,"https://covers.openlibrary.org/b/title/The%20Girl%20on%20the%20Train-L.jpg",4.5,1700,
            "A woman obsessed with a couple she sees from the train becomes entangled in their dark secrets after one goes missing."));

        books.add(new Book(23,"Dune","Frank Herbert",600,"https://covers.openlibrary.org/b/title/Dune-L.jpg",4.9,4100,
            "On the desert planet Arrakis, young Paul Atreides battles for survival, power, and the fate of the known universe."));

        books.add(new Book(24,"Animal Farm","George Orwell",420,"https://covers.openlibrary.org/b/title/Animal%20Farm-L.jpg",4.8,3900,
            "Farm animals overthrow their human farmer but soon find themselves under a new tyranny in this sharp political allegory."));

        books.add(new Book(25,"Rich Dad Poor Dad","Robert Kiyosaki",499,"https://covers.openlibrary.org/b/title/Rich%20Dad%20Poor%20Dad-L.jpg",4.7,4400,
            "Contrasting lessons from two father figures teach readers how the wealthy think differently about money and investing."));

        books.add(new Book(26,"The Secret","Rhonda Byrne",400,"https://covers.openlibrary.org/b/title/The%20Secret-L.jpg",4.5,2100,
            "Reveals the law of attraction, claiming that positive thinking can create life-changing results in wealth, health, and happiness."));

        books.add(new Book(27,"Atomic Habits","James Clear",550,"https://covers.openlibrary.org/b/title/Atomic%20Habits-L.jpg",4.9,6000,
            "Proven strategies for building good habits and breaking bad ones through tiny daily changes that compound over time."));

        books.add(new Book(28,"The Power of Positive Thinking","Norman Vincent Peale",420,"https://covers.openlibrary.org/b/title/The%20Power%20of%20Positive%20Thinking-L.jpg",4.6,1800,
            "A timeless guide to overcoming self-doubt and harnessing the power of faith and optimism to achieve personal success."));

        books.add(new Book(29,"The 7 Habits of Highly Effective People","Stephen Covey",500,"https://covers.openlibrary.org/b/title/The%207%20Habits%20of%20Highly%20Effective%20People-L.jpg",4.8,2600,
            "A principle-centered framework for personal and professional effectiveness that has transformed millions of lives worldwide."));

        books.add(new Book(30,"A Brief History of Time","Stephen Hawking",550,"https://covers.openlibrary.org/b/title/A%20Brief%20History%20of%20Time-L.jpg",4.7,2300,
            "Hawking explores the universe's origins, black holes, and the nature of time in this landmark book for general readers."));

        books.add(new Book(31,"The Old Man and the Sea","Ernest Hemingway",400,"https://covers.openlibrary.org/b/title/The%20Old%20Man%20and%20the%20Sea-L.jpg",4.6,1450,
            "An aging Cuban fisherman battles a giant marlin far out at sea in this Pulitzer Prize-winning story of perseverance."));

        books.add(new Book(32,"The Adventures of Huckleberry Finn","Mark Twain",450,"https://covers.openlibrary.org/b/title/Huckleberry%20Finn-L.jpg",4.6,1500,
            "Huck Finn and escaped slave Jim journey down the Mississippi River in this classic adventure confronting race and freedom."));

        books.add(new Book(33,"The Diary of Anne Frank","Anne Frank",480,"https://covers.openlibrary.org/b/title/The%20Diary%20of%20Anne%20Frank-L.jpg",4.8,3000,
            "The deeply moving diary of a Jewish girl hiding from Nazis in Amsterdam, a timeless testament to hope amid darkness."));

        books.add(new Book(34,"The Grapes of Wrath","John Steinbeck",500,"https://covers.openlibrary.org/b/title/The%20Grapes%20of%20Wrath-L.jpg",4.5,1100,
            "The Joad family flees the Dust Bowl for California, facing poverty and injustice in this Pulitzer Prize-winning epic."));

        books.add(new Book(35,"The Outsiders","S.E. Hinton",450,"https://covers.openlibrary.org/b/title/The%20Outsiders-L.jpg",4.7,1750,
            "Two rival gangs clash in 1960s Oklahoma in this coming-of-age story about loyalty, class, and the cost of violence."));

        books.add(new Book(36,"Matilda","Roald Dahl",400,"https://covers.openlibrary.org/b/title/Matilda-L.jpg",4.8,2900,
            "A brilliant young girl with magical powers uses her gifts to outsmart her horrible parents and cruel headmistress."));

        books.add(new Book(37,"Charlie and the Chocolate Factory","Roald Dahl",420,"https://covers.openlibrary.org/b/title/Charlie%20and%20the%20Chocolate%20Factory-L.jpg",4.7,2200,
            "Lucky Charlie wins a golden ticket to tour Willy Wonka's mysterious, magical, and dangerous chocolate factory."));

        books.add(new Book(38,"The Giver","Lois Lowry",430,"https://covers.openlibrary.org/b/title/The%20Giver-L.jpg",4.6,1650,
            "In a perfect but emotionless society, a boy is chosen to receive memories of the true painful and beautiful past."));

        books.add(new Book(39,"The Help","Kathryn Stockett",500,"https://covers.openlibrary.org/b/title/The%20Help-L.jpg",4.7,2100,
            "Black maids in 1960s Mississippi share their stories with a young white writer, risking everything to be heard."));

        books.add(new Book(40,"The Lovely Bones","Alice Sebold",480,"https://covers.openlibrary.org/b/title/The%20Lovely%20Bones-L.jpg",4.5,1300,
            "A murdered girl watches from heaven as her family grieves and her killer evades justice in this haunting novel."));

        books.add(new Book(41,"The Silent Patient","Alex Michaelides",550,"https://covers.openlibrary.org/b/title/The%20Silent%20Patient-L.jpg",4.8,2500,
            "A famous painter shoots her husband and never speaks again. A criminal psychotherapist is obsessed with uncovering why."));

        books.add(new Book(42,"Jane Eyre","Charlotte Bronte",470,"https://covers.openlibrary.org/b/title/Jane%20Eyre-L.jpg",4.7,1850,
            "An orphaned governess falls in love with her brooding employer but discovers a dark secret hidden in his home."));

        books.add(new Book(43,"Brave New World","Aldous Huxley",510,"https://covers.openlibrary.org/b/title/Brave%20New%20World-L.jpg",4.7,2200,
            "A dystopian future where humans are engineered and conditioned for happiness — but at the cost of truth and freedom."));

        books.add(new Book(44,"It Ends With Us","Colleen Hoover",500,"https://covers.openlibrary.org/b/title/It%20Ends%20With%20Us-L.jpg",4.8,4700,
            "A courageous story about a woman navigating love, abuse, and the painful but powerful choice to break the cycle."));

        books.add(new Book(45,"Dracula","Bram Stoker",500,"https://covers.openlibrary.org/b/title/Dracula-L.jpg",4.6,1900,
            "The original vampire tale follows Count Dracula's attempt to move from Transylvania to England and the battle to stop him."));

        books.add(new Book(46,"Frankenstein","Mary Shelley",450,"https://covers.openlibrary.org/b/title/Frankenstein-L.jpg",4.6,1700,
            "A scientist creates life from dead matter, only to be haunted by his monstrous creation in this gothic science fiction classic."));

        books.add(new Book(47,"The Chronicles of Narnia","C.S. Lewis",650,"https://covers.openlibrary.org/b/title/The%20Chronicles%20of%20Narnia-L.jpg",4.8,3500,
            "Seven epic tales of the magical land of Narnia, filled with talking animals, mythical creatures, and timeless moral lessons."));

        books.add(new Book(48,"Ikigai","Hector Garcia",450,"https://covers.openlibrary.org/b/title/Ikigai-L.jpg",4.8,3900,
            "The Japanese secret to a long and happy life — finding your ikigai, the reason you get up every morning with purpose."));

        books.add(new Book(49,"Crime and Punishment","Fyodor Dostoevsky",590,"https://covers.openlibrary.org/b/title/Crime%20and%20Punishment-L.jpg",4.7,1550,
            "A poor student commits a murder believing himself above morality, then descends into guilt, paranoia, and eventual confession."));

        books.add(new Book(50,"The Picture of Dorian Gray","Oscar Wilde",480,"https://covers.openlibrary.org/b/title/The%20Picture%20of%20Dorian%20Gray-L.jpg",4.6,1450,
            "A beautiful young man sells his soul for eternal youth while his portrait ages and reflects his moral corruption."));

        books.add(new Book(51,"The Pragmatic Programmer","Andrew Hunt",820,"https://covers.openlibrary.org/b/title/The%20Pragmatic%20Programmer-L.jpg",4.9,4100,
            "Essential wisdom for software developers on writing better code, managing projects, and building a lasting programming career."));

        books.add(new Book(52,"Treasure Island","Robert Louis Stevenson",430,"https://covers.openlibrary.org/b/title/Treasure%20Island-L.jpg",4.6,1300,
            "Young Jim Hawkins sets sail for a mysterious island with a treacherous pirate crew in pursuit of buried treasure."));
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
