import java.awt.Container;

class MyFrame extends javax.swing.JFrame // наследует javax.swing.JFrame
{
	public MyFrame() // конструктор 
    {
        setTitle("CalRem"); // Название на программы на окошке
        MyPanel panel = new MyPanel();
        Container pane = getContentPane(); // контейнер
        pane.add( panel ); // добавить панель в контейнер для отображения
    }
    
}