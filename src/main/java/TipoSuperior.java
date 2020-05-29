import java.util.Arrays;
import java.util.List;

public class TipoSuperior extends Tipo{

    private TipoSuperior(List<Material> materiales, Integer temperaturaLimite) {
        this.materialesValidos = materiales;
        this.temperaturaLimite = temperaturaLimite;
    }

    public static final TipoSuperior REMERA = new TipoSuperior(Arrays.asList(Material.TELA, Material.SEDA, Material.ALGODON), 80);
    public static final TipoSuperior MUSCULOSA = new TipoSuperior(Arrays.asList(Material.TELA, Material.SEDA, Material.ALGODON), 80);
    public static final TipoSuperior CAMISA = new TipoSuperior(Arrays.asList(Material.TELA, Material.SEDA, Material.ALGODON), 80);
    public static final TipoSuperior BLUSA = new TipoSuperior(Arrays.asList(Material.TELA, Material.SEDA, Material.ALGODON), 80);
    public static final TipoSuperior BUZO = new TipoSuperior(Arrays.asList(Material.TELA, Material.ALGODON, Material.POLIESTER, Material.JEAN, Material.TERCIOPELO), 22);
    public static final TipoSuperior PULOVER = new TipoSuperior(Arrays.asList(Material.LANA, Material.POLIESTER, Material.TERCIOPELO), 22);
    public static final TipoSuperior SACO = new TipoSuperior(Arrays.asList(Material.TELA, Material.SEDA, Material.ALGODON), 24);
    public static final TipoSuperior CAMPERA = new TipoSuperior(Arrays.asList(Material.TELA, Material.ALGODON, Material.LANA, Material.CUERO, Material.JEAN, Material.POLIESTER), 14);
    public static final TipoSuperior CAMPERA_IMPERMEABLE = new TipoSuperior(Arrays.asList(Material.POLIESTER), 14);
    public static final TipoSuperior CAMPERA_POLAR = new TipoSuperior(Arrays.asList(Material.LANA, Material.TELA, Material.ALGODON, Material.POLIESTER), 10);

    @Override
    public Categoria categoria() {
        return Categoria.SUPERIOR;
    }
}
