public class Tv {
            int channel = 1;
            int volume = 1;
            boolean on = true;
            public Tv() {
            }
            public void tvOn() {
                on = true;
            }
            public void tvOff() {
                on = false;
            }
            public void setChannel(int newChannel) {
                if (on && newChannel >= 1 && newChannel <= 120 )
                channel = newChannel;
            }
            public void setVolume(int newVolume) {
                if(on && newVolume >= 1 && newVolume <= 7)
                    volume = newVolume;
            }
            public void channelUp() {
                if(on && channel < 120)
                    channel++;
            }
            public void channelDown() {
                if(on && channel > 1)
                    channel--;
            }
            public void volumeUp() {
                if(on && volume < 7)
                    volume++;
            }
            public void volumeDown() {
                if(on && volume > 1)
                    volume--;
            }
}
