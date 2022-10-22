package dio.v_aguiar.sintaxe.smart_tv;

public class User {
  public static void main(String[] args) {
    SmartTv tv = new SmartTv();

    System.out.println("Está ligada? " + tv.isOn);
    System.out.println("Canal inicial: " + tv.channel);
    System.out.println("Volume inicial: " + tv.volume + "\n");

    tv.turnOn();
    tv.channelUp();
    tv.volumeUp();
    tv.volumeUp();
    tv.volumeUp();

    System.out.println("Está ligada? " + tv.isOn);
    System.out.println("Canal atual: " + tv.channel);
    System.out.println("Volume atual: " + tv.volume + "\n");

    tv.setChannel(192);
    System.out.println("Canal atual: " + tv.channel);
  }
}
