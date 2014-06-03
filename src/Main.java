
public class Main // TODO Начало программы
{
	static MyFrame frame; // фрейм
	static int fSizeX = 290; // начальная ширина
	static int fSizeY = 260; // начальная высота
	 
	public static void main( String[] args )
	{
		frame = new MyFrame();
        frame.setDefaultCloseOperation( 3 );
        frame.setSize( fSizeX, fSizeY ); // задаем начальные размеры окна
        frame.setResizable( false ); // окно нельзя растягивать вручную
        frame.setVisible( true ); // команда для отображения окна
	}
}
