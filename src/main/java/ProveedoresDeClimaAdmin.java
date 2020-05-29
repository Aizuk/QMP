import java.util.HashSet;
import java.util.Set;

public class ProveedoresDeClimaAdmin {

    private Set<ProveedorClima> proveedores = new HashSet<>();

    public ProveedoresDeClimaAdmin() {
        this.proveedores.add(new ProveedorAccuWeather());
    }

    public Integer obtenerTemperaturaActual(String ciudad) {
        ProveedorClima proveedorEncontrado = encontrarPrimerProveedorFuncional();
        return proveedorEncontrado.obtenerTemperaturaActual(ciudad);
    }

    private ProveedorClima encontrarPrimerProveedorFuncional() {
        ProveedorClima proveedorEncontrado = proveedores
                .stream()
                .filter(ProveedorClima::estaActivo)
                .findFirst()
                .orElse(null);
        if (proveedorEncontrado == null)
            throw new NoAndaNingunProveedorException("No funciona ningun proveedor");
        return proveedorEncontrado;
    }

    public void agregarProveedor(ProveedorClima proveedorNuevo) {
        proveedores.add(proveedorNuevo);
    }
}