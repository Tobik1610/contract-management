import java.awt.Frame;

public class MainFrame extends Frame{
	
	private int width, height;
	private final String TITLE = "Vertrags Verwaltung";

	public MainFrame(int width, int height) {
		this.width = width;
		this.height = height;
		
		setSize(width, height);
		setTitle(TITLE);
	}
	
}
