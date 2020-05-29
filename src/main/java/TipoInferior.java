import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TipoInferior extends Tipo{


    private TipoInferior(List<Material> materiales, Integer temperaturaLimite) {
        this.materialesValidos = materiales;
        this.temperaturaLimite = temperaturaLimite;
    }

    public static final TipoInferior JEAN = new TipoInferior(Collections.singletonList(Material.JEAN), 80);
    public static final TipoInferior TRAJE = new TipoInferior(Arrays.asList(Material.TELA, Material.SEDA, Material.ALGODON), 80);
    public static final TipoInferior POLLERA = new TipoInferior(Arrays.asList(Material.JEAN, Material.SEDA, Material.TELA, Material.ALGODON, Material.CUERO, Material.POLIESTER), 80);
    public static final TipoInferior BERMUDA = new TipoInferior(Arrays.asList(Material.JEAN, Material.SEDA, Material.TELA, Material.ALGODON, Material.CUERO, Material.POLIESTER), 80);
    public static final TipoInferior CALZA = new TipoInferior(Arrays.asList(Material.TELA, Material.ALGODON, Material.POLIESTER), 80);
    public static final TipoInferior JOGGING = new TipoInferior(Arrays.asList(Material.TELA, Material.ALGODON), 80);
    public static final TipoInferior JOGGING_CORTO = new TipoInferior(Arrays.asList(Material.TELA, Material.ALGODON), 80);


    @Override
    public Categoria categoria() {
        return Categoria.INFERIOR;
    }
}
