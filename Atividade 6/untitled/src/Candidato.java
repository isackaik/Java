public class Candidato implements Comparable<Candidato>{
    private final String inscricao, nome;
    private final Float nota1, nota2, notaf;
    private final Integer q1, q2;

    public Candidato(String ins, String n, float n1, int q1, float n2, int q2, float nf){
        this.inscricao = ins;
        this.nome = n;
        this.nota1 = n1;
        this.q1 = q1;
        this.nota2 = n2;
        this.q2 = q2;
        this.notaf = nf;
    }

    public int compareTo(Candidato c) {
        if((c.notaf - this.notaf) == 0 && (c.nota2 - this.nota2) == 0)
            return (this.nome.compareTo(c.nome));
        if((c.notaf.compareTo(this.notaf) == 0))
            return (c.nota2.compareTo(this.nota2));
        return (c.notaf.compareTo(this.notaf));
    }

    public String resultado(){
        return this.nome + " " + this.notaf;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.inscricao + " "
               + this.nota1 + " " + this.q1 + " "
               + this.nota2 + " " + this.q2 + " "
               + this.notaf;
    }
}