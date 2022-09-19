package paket;

public class Student {
    private int ID;
    private String fio;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Student(int ID, String fio) {
        this.ID = ID;
        this.fio = fio;
    }
}
