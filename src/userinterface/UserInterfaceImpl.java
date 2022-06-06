package userinterface;

import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import problemdomain.Coordinates;
import problemdomain.SudokuGame;
import userinterface.IUserInterfaceContract.EventListener;

public class UserInterfaceImpl implements IUserInterfaceContract.View, EventHandler<KeyEvent> {
	
	private final Stage stage;
	private final Group root;
	
	//how do we keep track of 81 different text fields????
	private HashMap<Coordinates, SudokuTextField> textFieldCoordinates; 
	
	private IUserInterfaceContract.EventListener listener;
	
	private static final double WINDOW_Y = 732;
	private static final double WINDOW_X = 668;
	private static final double BOARD_PADDING = 50;
	private static final double BOARD_X_AND_Y = 576;
	
	private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(0,150,136);
	private static final Color BOARD_BACKGROUND_COLOR = Color.rgb(225,242,241);
	private static final String SUDOKU = "Sudoku";
	
	public UserInterfaceImpl(Stage stage) {
		this.stage = stage;
		this.root = new Group();
		this.textFieldCoordinates = new HashMap<>();
		initializeUserInterface();
	}
	
	private void initializeUserInterface() {
		drawBackground(root);
		drawTitle(root);
		drawSudokuBoard(root);
		drawTextFields(root);
		drawGridLines(root);
		stage.show();
	}
	
	private void drawGridLines(Group root) {
		int xAndy = 114;
		int index = 0;
		while (index < 8) {
			int thickness;
			if (index == 2 || 5) {
				thickness = 3;
			} else {
				thickness = 2;
			}
			
			Rectangle verticalLine = getLine(
				xAndy + 64 * index,
				BOARD_PADDING,
				BOARD_X_AND_Y,
				thickness
			);
		}
		
	}

	private void drawTextFields(Group root2) {
		// TODO Auto-generated method stub
		
	}

	private void drawSudokuBoard(Group root2) {
		// TODO Auto-generated method stub
		
	}

	private void drawTitle(Group root2) {
		// TODO Auto-generated method stub
		
	}

	private void drawBackground(Group root) {
		
		
	}

	@Override
	public void handle(KeyEvent arg0) {
		

	}

	@Override
	public void setListener(EventListener listener) {
		this.listener = listener;
	}

	@Override
	public void updateSquare(int x, int y, int input) {
		// TODO Auto-generated method stub

	}

	@Override
	public void udpateBoard(SudokuGame game) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showDialog(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showError(String message) {
		// TODO Auto-generated method stub

	}

}
