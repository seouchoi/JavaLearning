package ass_5;

public class GenreMusic extends Music{
	String genre;
	public GenreMusic(String music,String genre)
	{
		super(music);
		this.genre=genre;
	}
	public String getGenreMusic()
	{
		return genre;
	}
	public void setGenreMusic()
	{
		this.genre=genre;
	}
		
	public void printGenreMusic()
	{
		this.printMusic();
		System.out.println(music+" "+genre);
	}
}
