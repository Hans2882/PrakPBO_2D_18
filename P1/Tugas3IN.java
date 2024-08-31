package P1;

public class Tugas3IN extends Tugas3 {
    private String Role;
    private String senjata;

    public void setRole(String newValue) {
        Role = newValue;
    }

    public void setSenjata(String newValue) {
        senjata = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Role Pesawat: " + Role);
        System.out.println("Senjata Pesawat: " + senjata);
    }
}
