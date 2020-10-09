
public class Television {

	private String MANUFACTURER = "";
	private int SCREEN_SIZE = 0;
	private boolean powerOn;
	private int channel = 0;
	private int volume = 0;
	
	public Television(String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	public void setChannel(int station) {
		channel = station;
	}
	
	public void power() {
		powerOn = !powerOn;
	}
	
	public void increaseVolume() {
		volume++;
	}
	
	public void decreaseVolume() {
		volume--;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
}
