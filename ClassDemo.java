class Anime{// Creating a Class named Anime and used a simple method for multiplication :
String name;
int episode;

public int printDetail(int ep){
int epmin=23;

return epmin*ep;

}	}


class ClassDemo{
	public static void main(String args[]){
	Anime anime= new Anime();
	anime.name="Demon Slayer";
	anime.episode=40;
	int watch_time= anime.printDetail(anime.episode); 
	System.out.println("The Total Watch Time of Demon Slayer is : "+ watch_time+ " Minutes");

	}

}