package dio.v_aguiar.sintaxe.smart_tv;

public class SmartTv {
  boolean isOn = false;
  int channel = 50;
  int volume = 25;

  public void turnOn() {
    isOn = true;
  }

  public void turnOff() {
    isOn = false;
  }

  public void channelUp() {
    channel++;
  }

  public void channelDown() {
    channel--;
  }

  public void setChannel(int channelNumber) {
    channel = channelNumber;
  }

  public void volumeUp() {
    volume++;
  }

  public void volumeDown() {
    volume--;
  }
}
