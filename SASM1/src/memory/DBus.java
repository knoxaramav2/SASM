package memory;

public class DBus {
	
	final int BUS_SIZE = 5;
	int comBus [];
	
	public DBus() {
		comBus = new int[BUS_SIZE];
	}
	
	public void clear() {
		for(int i = 0; i < BUS_SIZE; ++i) {
			comBus[i] = 0;
		}
	}
	
}
