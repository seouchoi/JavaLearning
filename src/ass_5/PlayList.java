package ass_5;

public class PlayList {
	public static void main(String[] args)
	{
		GenreMusic[] playList=new GenreMusic[3];
		playList[0]=new GenreMusic("���亥�� ���","(�����)");
		playList[1]=new GenreMusic("��� �޽þ�","(�����丮��)");
		playList[2]=new GenreMusic("��ߵ��� ���","(���ְ�)");
		
		for(int i =0;i<playList.length;i++)
		{
			playList[i].printGenreMusic();
		}
	}
}
