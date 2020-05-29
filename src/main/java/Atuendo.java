import java.util.Objects;
import java.util.Set;

public class Atuendo {

    private Set<Prenda> superior;
    private Set<Prenda> inferior;
    private Set<Prenda> calzado;
    private Set<Prenda> accesorio;

    public Atuendo(Set<Prenda> superior, Set<Prenda> inferior, Set<Prenda> calzado, Set<Prenda> accesorio) {
        this.superior = superior;
        this.inferior = inferior;
        this.calzado = calzado;
        this.accesorio = accesorio;
    }

    public Set<Prenda> obtenerSuperior() {
        return superior;
    }

    public Set<Prenda> obtenerInferior() {
        return inferior;
    }

    public Set<Prenda> obtenerCalzado() {
        return calzado;
    }

    public Set<Prenda> obtenerAccesorio() {
        return accesorio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Atuendo atuendo = (Atuendo) o;
        return superior.equals(atuendo.superior) &&
                inferior.equals(atuendo.inferior) &&
                calzado.equals(atuendo.calzado) &&
                Objects.equals(accesorio, atuendo.accesorio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(superior, inferior, calzado, accesorio);
    }

}
