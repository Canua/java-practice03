package tv;

public class TV {
	private boolean power; // power의 유무에 따라 채널 변함 유무
	private int channel; // 0 ~ 50 51 -> 0
	private int volume; // 0 ~50 51 -> 0

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		power = on;
	}

	public void channel(int channel) {
		this.channel = channel;
		this.channel = (this.channel > 50) ? 0 : this.channel;
		this.channel = (this.channel < 0) ? 50 : this.channel;
	}

	public void channel(boolean up) {
		channel(up ? channel++ : channel--);
	}

	public void volume(int volume) {
		this.volume = volume;
		this.volume = (this.volume > 50) ? 0 : this.volume;
		this.volume = (this.volume < 0) ? 50 : this.volume;
	}

	public void volume(boolean up) {
		volume(up ? volume + 1 : volume - 1);
	}

	public void status() {
		System.out.println("TV[power = " + power + ", channel = " + channel + ", volume = " + volume + "]");
	}
}
