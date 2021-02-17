public class Book {
	private String title;
	private Author author;
	private int items;

	public static void main (String[] args){		
// 		Library l= new Library(100);
// 		Author a1 = new Author("Oscar Wilde", 1889);
// 		System.out.println(a1.getAuthorName());
// 		Book b1 = new Book("The Importance of Being Earnest", a1, 3);
// 		System.out.println(b1.getTitle());

System.out.println("Starting my new library\n");
//1. Create library
Library l= new Library(100);
//2. Populate library
//Add 'Oscar Wilde' as a new author
Author a1 = new Author("Oscar Wilde", 1889);
//Add three items of 'The Importance of Being Earnest' to the library
Book b1 = new Book("The Importance of Being Earnest", a1, 3);
l.addBook(b1);
//Add two items of 'The Picture of Dorian Gray' to the library
Book b2 = new Book("The Picture of Dorian Gray", a1, 2);
l.addBook(b2);
//Add 'Charles Dickens' as a new author
Author a2 = new Author("Charles Dickens", 1812);
//Add three items of 'The Picture of Oliver Twist' to the library
Book b3 = new Book("Oliver Twist", a2, 3);
l.addBook(b3);
//3. Explore library
l.whichBooks();
l.whichAuthors();
//4. Interact with the library
//Borrow Oliver Twist
l.borrowBook(b3);
//Return Oliver Twist
l.returnBook(b3);
//Borrow more than available
l.borrowBook(b2);
l.borrowBook(b2);
l.borrowBook(b2);

}


	public Book(String titlee, Author authorr, int itemss){
		title = titlee;
		author = authorr;
		items = itemss;
	}
    

	public String getTitle(){
		return title;
	}

	public Author getAuthor(){
		return author;

	}

	public int getItems(){
		return items;
	}

	public void setTitle(String a){
		title = a;
	}

	public void setAuthor(Author authorr){
		author = authorr;
	}

	public void setItems(int c){
		items = c;
	}

}

class Author {
	private String name;
	private int yearOfBirth;

	public static void main (String[] args){}

	public Author(String a, int b){
		name = a;
		yearOfBirth = b;

	}

	public String getAuthorName(){
		return name;
	}

	public void setAuthorName(String a){
		name = a;
	}

	public int getYearOfBirth(){
		return yearOfBirth;
	}

	public void setYearOfBirth(int a){
		yearOfBirth = a;
	}
}

class Library {
	private Book[] bookList = new Book[]{};
	private int currentNumberOfUniqueBooks;

	public static void main(String[] args){}

	public Library (int maxno){

	}

	public void addBook(Book boook){
		Book[] result = new Book[bookList.length+1];
		for(int i=0; i<bookList.length;i++){
			result[i]=bookList[i];
		}
		result[result.length-1] = boook;
		bookList = result;

	}

	public void whichBooks(){
		System.out.println();
		System.out.println("This is the list of books:");
		for(int i=0; i<bookList.length; i++){
			System.out.println("* " + bookList[i].getTitle());
		}
	}

	public void whichAuthors(){
		System.out.println();
		System.out.println("This is the list of authors:");
		for(int i=0; i<bookList.length; i++){
			System.out.println("* " + bookList[i].getAuthor().getAuthorName());
		}
	}

	public void returnBook(Book boook){
		System.out.println();
		boook.setItems(boook.getItems()+1);
		System.out.println(boook.getTitle() + " was successfully returned.");
		for(int i=0; i<bookList.length; i++){
			if(boook.getTitle() == bookList[i].getTitle()){
				break;
			}else{
				if(i == bookList.length-1){
					currentNumberOfUniqueBooks ++;
					break;
				}else{continue;}
				
			}
		}
	}

	public void borrowBook(Book boook){
		System.out.println();
		if(boook.getItems() == 0){
			System.out.println(boook.getTitle() + " is not available yet.");
		}else{
			if(boook.getItems() == 1){
				currentNumberOfUniqueBooks --;
			}
			boook.setItems(boook.getItems()-1);
			System.out.println(boook.getTitle() + " has been booked for you.");
		}
	}
}
