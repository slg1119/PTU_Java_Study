package Example;

public class Television {
    int channel;
    int volume;
    boolean onOff;

    Television() { }

    Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println(channel + " " + volume + " " + onOff);
    }
}
