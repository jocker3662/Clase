
public class TestBook {

	public static void main(String[] args) {
		
		Author a = new Author("Jose","jose@gmail.com", 'm');
		Book b = new Book("SpiderPigger", a, 50, 20);
		Book b2 = new Book("The notebook",
						new Author("Nicolas Smith", "ppp@gmail.com",'m'),
						25.9);
		Book b3 = new Book("Mia y su mundo", a ,35.9, 8);
		
		System.out.println(b.toString());
		System.out.println(b2.getAuthor().getName());
		
		Book[] books; 		 //Declaracion
		books = new Book[5]; //instanciacion
		books[0] = b;        //Inicializacion
		books[1] = b2;
		books[2] = b3;
		books[3] = new Book("Don Quijote de la Mancha",
						new Author("Miguel de Cervantes", " NOT FOUND", 'm'),
						45.3, 50);
		books[4] = new Book("It",
				new Author("Stephen King", "stephenKing@gmail.com", 'm'),
				23.99, 10);
		
		System.out.println("------------------------------");
		
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].toString());
		}
		
		System.out.println("------------------------------");
		
		for(Book bvar : books) {
			System.out.println(bvar);
		}
		
		
		
	}

}


