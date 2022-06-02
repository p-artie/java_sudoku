package userinterface;

import javafx.scene.control.TextField;
import java.util.regex.*;

public class SudokuTextField extends TextField {
	private final int x;
	private final int y;
	
	public SudokuTextField(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	@Override
	public void replaceText(int i, int il, String s) {
		if(!s.matches("[0-9]")) {
			 super.replaceText(i, il, s);
		}
	}
	
	@Override
	public void replaceSelection(String s) {
		if(!s.matches("[0-9]")) {
			 super.replaceSelection(s);
		}
	}
}
