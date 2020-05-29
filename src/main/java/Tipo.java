import java.util.List;

public abstract class Tipo {

    protected List<Material> materialesValidos;
    protected Integer temperaturaLimite;

    public Tipo(){}
    public List<Material> getMaterialesValidos() {
        return materialesValidos;
    }

    public Integer getTemperaturaLimite() {
        return temperaturaLimite;
    }
    public abstract Categoria categoria();
}
