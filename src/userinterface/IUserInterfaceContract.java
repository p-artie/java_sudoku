package userinterface;

public interface IUserInterfaceContract {
	interface EventListener {
		void onSudokuInput(int x, int y, int input);
		void onDialogClick();
	}
	
	interface View {
		void setListener(IUserInterFaceContract.EventListener listener);
		void updateSquare(int x, int y, int input);
		void udpateBoard(SudokuGame game);
		void showDialog(String message);
		void showError(String message);
	}
}
