package ass_5;

public class PlayList {
	public static void main(String[] args)
	{
		GenreMusic[] playList=new GenreMusic[3];
		playList[0]=new GenreMusic("베토벤의 운명","(교향곡)");
		playList[1]=new GenreMusic("헨델의 메시아","(오라토리오)");
		playList[2]=new GenreMusic("비발디의 사계","(협주곡)");
		
		for(int i =0;i<playList.length;i++)
		{
			playList[i].printGenreMusic();
		}
	}
}
