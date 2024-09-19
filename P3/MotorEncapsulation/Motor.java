package P3.MotorEncapsulation;

public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printstatus() {
        if (kontakOn == true) {
            System.out.println("Kontak on");
        } else {
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan: " + kecepatan + "\n");
    }
}
