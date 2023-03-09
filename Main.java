public class Main {
        public static void main (String[] args) {

            Tv remote = new Tv();
            remote.tvOn();
            remote.setChannel(30);
            remote.setVolume(3);
//          comments
            System.out.println(remote.on);
            System.out.println("Tv channel is "+remote.channel+" and volume is "+remote.volume);
        }
}
