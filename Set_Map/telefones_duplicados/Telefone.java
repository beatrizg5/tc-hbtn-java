public class Telefone implements Comparable<Telefone> {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }


    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", codigoArea, numero);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result((codigoArea == null) ? 0 : codigoArea.hashCode());
        result = prime * result((numero == null) ? 0 : numero.hashCode());
        return super.hashCode();
    }

    private int result(int i) {
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Telefone other = (Telefone) obj;
        if (codigoArea == null) {
            if (other.codigoArea != null)
                return false;
        } else if (numero.equals(other.numero))
            return false;
        return true;
    }

    @Override
    public int compareTo(Telefone o) {
        return numero.compareTo(o.numero);
    }
}