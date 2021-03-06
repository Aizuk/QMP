import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Guardarropas {

    private Set<Prenda> prendas;

    private final Sugeridor sugeridor = new Sugeridor();

    private final ProveedoresDeClimaAdmin administradorDeProveedores = new ProveedoresDeClimaAdmin();

    public Guardarropas(Set<Prenda> prendas) {
        this.prendas = prendas;
    }

    public void agregarPrenda(Prenda prendaNueva) {
        this.prendas.add(prendaNueva);
    }

    public Set<Prenda> obtenerPrendasSuperiores() {
        return prendas.stream().filter(prenda -> prenda.getCategoria() == Categoria.SUPERIOR).collect(Collectors.toSet());
    }

    public Set<Prenda> obtenerPrendasInferiores() {
        return prendas.stream().filter(prenda -> prenda.getCategoria() == Categoria.INFERIOR).collect(Collectors.toSet());
    }

    public Set<Prenda> obtenerCalzados() {
        return prendas.stream().filter(prenda -> prenda.getCategoria() == Categoria.CALZADO).collect(Collectors.toSet());
    }

    public Set<Prenda> obtenerAccesorios() {
        return prendas.stream().filter(prenda -> prenda.getCategoria() == Categoria.ACCESORIO).collect(Collectors.toSet());
    }

    private Atuendo obtenerAtuendoRandom(List<Atuendo> combinaciones) {
        Collections.shuffle(combinaciones);
        return combinaciones.get(0);
    }

    public List<Atuendo> atuendosValidos(String ciudad) {
        return sugeridor.atuendosValidosParaTemperatura(administradorDeProveedores.obtenerTemperaturaActual(ciudad), this);
    }

    public Atuendo generarSugerencia(String ciudad) {
        return this.obtenerAtuendoRandom(atuendosValidos(ciudad));
    }

}
