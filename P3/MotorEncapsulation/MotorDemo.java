package P3.MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printstatus();
        motor.kecepatan = 50;
        motor.printstatus();
    }
}
