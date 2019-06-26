public class Owner {
    private String name;
    private Charge charge;

    public Owner(String name, Charge charge) {
        this.name = name;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Charge getCharge() {
        return charge;
    }

    public void setCharge(Charge charge) {
        this.charge = charge;
    }
}
