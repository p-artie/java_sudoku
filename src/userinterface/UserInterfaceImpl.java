package userinterface;

import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
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
	
	@Override
	public void handle(KeyEvent arg0) {
		

	}

	@Override
	public void setListener(EventListener listener) {
		// TODO Auto-generated method stub

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
