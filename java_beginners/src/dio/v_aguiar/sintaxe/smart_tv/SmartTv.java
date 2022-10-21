package dio.v_aguiar.sintaxe.smart_tv;

public class SmartTv {
  boolean isOn = false;
  int channel = 50;
  int volume = 25;

  public void turnOn() {
    this.isOn = true;
  }

  public void turnOff() {
    this.isOn = false;
  }

  public void channelUp() {
    this.channel++;
  }

  public void channelDown() {
    this.channel--;
  }

  public void setChannel(int channelNumber) {
    this.channel = channelNumber;
  }

  public void volumeUp() {
    this.volume++;
  }

  public void volumeDown() {
    this.volume--;
  }
}
