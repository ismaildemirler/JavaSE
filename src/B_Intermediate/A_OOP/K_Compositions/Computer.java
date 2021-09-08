package B_Intermediate.A_OOP.K_Compositions;

public class Computer {
	
	private Monitor monitor;
	private ComputerCase computerCase;
	private MainBoard mainBoard;
	
	public Computer(Monitor monitor, ComputerCase computerCase, MainBoard mainBoard) {
		super();
		this.monitor = monitor;
		this.computerCase = computerCase;
		this.mainBoard = mainBoard;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public ComputerCase getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(ComputerCase computerCase) {
		this.computerCase = computerCase;
	}

	public MainBoard getMainBoard() {
		return mainBoard;
	}

	public void setMainBoard(MainBoard mainBoard) {
		this.mainBoard = mainBoard;
	}	
}
