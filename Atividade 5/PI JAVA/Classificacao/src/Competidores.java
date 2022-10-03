public class Competidores implements Comparable<Competidores> {
    private final String name; // IDE sugeriu inserir o "final", pesquisei sobre e decidi manter
    private int ouro = 0;
    private int prata = 0;
    private int bronze = 0;

    public Competidores(String n, String med) {
        this.name = n;
        switch (med) {
            case "ouro" -> this.ouro++;
            case "prata" -> this.prata++;
            case "bronze" -> this.bronze++;
        }
    }

    public String getName() {
        return name;
    }

    public void setOuro() {
        this.ouro++;
    }

    public void setPrata() {
        this.prata++;
    }

    public void setBronze() {
        this.bronze++;
    }

    public int getOuro() {
        return ouro;
    }

    public int getPrata() {
        return prata;
    }

    public int getBronze() {
        return bronze;
    }

    @Override
    public String toString() {
        return this.name + " ouro:" + this.ouro + " prata:" + this.prata + " bronze:" + this.bronze;
    }

    @Override
    public int compareTo(Competidores comp) {
        if ((comp.getOuro() - this.ouro) == 0 && (comp.getPrata() - this.prata) == 0)
            return (comp.getBronze() - this.prata);
        else if ((comp.getOuro() - this.ouro) == 0)
            return (comp.getPrata() - this.prata);
        return (comp.getOuro() - this.ouro);
    }
}
