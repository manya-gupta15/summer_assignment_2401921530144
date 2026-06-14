package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
class Test
{
void main()
{
	Veena V = new Veena();
	V.play();
	Saxophone S = new Saxophone();
	S.play();
	Playable P;
	P=V;
	P.play();
	P=S;
	P.play();
}
}
