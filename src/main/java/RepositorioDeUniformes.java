import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class RepositorioDeUniformes {

    private List<Atuendo> uniformes = new ArrayList<>();

    public static final Atuendo uniformeMilitar = new Atuendo(
            new HashSet<>(Collections.singletonList(new PrendaBuilder(Categoria.SUPERIOR)
                    .especificarTipo(TipoSuperior.MUSCULOSA)
                    .especificarColorPrincipal("Verde")
                    .especificarTrama(Trama.ESTAMPADO)
                    .especificarColorSecundario("GRisito")
                    .especificarMaterial(Material.TELA)
                    .crearPrenda())),
            new HashSet<>(Collections.singletonList(new PrendaBuilder(Categoria.INFERIOR)
                    .especificarTipo(TipoInferior.JOGGING)
                    .especificarColorPrincipal("Verde")
                    .especificarTrama(Trama.ESTAMPADO)
                    .especificarColorSecundario("Grisito")
                    .especificarMaterial(Material.TELA)
                    .crearPrenda())),
            new HashSet<>(Collections.singletonList(new PrendaBuilder(Categoria.CALZADO)
                    .especificarTipo(TipoCalzado.BOTAS)
                    .especificarColorPrincipal("Negro")
                    .especificarMaterial(Material.CUERO)
                    .crearPrenda())),
            new HashSet<>()
    );
    public static final Atuendo uniformeAbogado = new Atuendo(
            new HashSet<>(Collections.singletonList(new PrendaBuilder(Categoria.SUPERIOR)
                    .especificarTipo(TipoSuperior.SACO)
                    .especificarColorPrincipal("Negro")
                    .especificarMaterial(Material.SEDA)
                    .crearPrenda())),
            new HashSet<>(Collections.singletonList(new PrendaBuilder(Categoria.INFERIOR)
                    .especificarTipo(TipoInferior.TRAJE)
                    .especificarColorPrincipal("Negro")
                    .especificarMaterial(Material.SEDA)
                    .crearPrenda())),
            new HashSet<>(Collections.singletonList(new PrendaBuilder(Categoria.CALZADO)
                    .especificarTipo(TipoCalzado.ZAPATOS)
                    .especificarColorPrincipal("Negro")
                    .especificarMaterial(Material.CUERO)
                    .crearPrenda())),
            new HashSet<>()
    );
    public static Atuendo uniformeColectivero = new Atuendo(
            new HashSet<>(Collections.singletonList(new PrendaBuilder(Categoria.SUPERIOR)
                    .especificarTipo(TipoSuperior.CAMISA)
                    .especificarColorPrincipal("Azul")
                    .especificarMaterial(Material.ALGODON)
                    .crearPrenda())),
            new HashSet<>(Collections.singletonList(new PrendaBuilder(Categoria.INFERIOR)
                    .especificarTipo(TipoInferior.JEAN)
                    .especificarColorPrincipal("Azul")
                    .especificarMaterial(Material.JEAN)
                    .crearPrenda())),
            new HashSet<>(Collections.singletonList(new PrendaBuilder(Categoria.CALZADO)
                    .especificarTipo(TipoCalzado.ZAPATILLAS)
                    .especificarColorPrincipal("Negro")
                    .especificarMaterial(Material.TELA)
                    .crearPrenda())),
            new HashSet<>()
    );

    public RepositorioDeUniformes() {
        this.uniformes.add(uniformeMilitar);
        this.uniformes.add(uniformeAbogado);
        this.uniformes.add(uniformeColectivero);
    }

    public List<Atuendo> getUniformes() {
        return uniformes;
    }

}