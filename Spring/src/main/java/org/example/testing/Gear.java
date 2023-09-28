package org.example.testing;

public class Gear {

    private String name;

    private String kind;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void displayGear(){
        System.out.println("Gear 1");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Gear{");
        sb.append("name='").append(name).append('\'');
        sb.append(", kind='").append(kind).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
