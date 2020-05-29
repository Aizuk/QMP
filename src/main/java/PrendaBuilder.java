public class PrendaBuilder {
    private Categoria categoria;
    private Tipo tipo;
    private Material material;
    private String colorPrimario;
    private String colorSecundario = null;
    private Trama trama = Trama.LISO;


    public Prenda crearPrenda() {
        verificarSiHayAtributosNulos();
        return new Prenda(this.colorPrimario,this.colorSecundario,this.trama,this.material,this.categoria, this.tipo);
    }

    public PrendaBuilder(Categoria categoria) {
        romperSiEsNulo(categoria, "La categoria no puede ser nula");
        this.categoria = categoria;
    }

    public PrendaBuilder especificarTipo(Tipo tipo) {
        romperSiEsNulo(tipo, "El tipo no puede ser nulo");
        validarTipoSegunCategoria(tipo);
        this.tipo = tipo;
        return this;
    }

    public PrendaBuilder especificarMaterial(Material material) {
        romperSiEsNulo(material, "El material no puede ser nulo");
        romperSiEsNulo(this.tipo, "Antes de asignar un material debes asignar un tipo de prenda");
        validarMaterial(material);
        this.material = material;
        return this;
    }

    public PrendaBuilder especificarColorPrincipal(String colorPrimario) {
        romperSiEsNulo(colorPrimario, "El color principal no puede ser nulo");
        this.colorPrimario = colorPrimario;
        return this;
    }

    public PrendaBuilder especificarColorSecundario(String colorSecundario) {
        if (colorSecundario!=null && colorSecundario.equals(this.colorPrimario)) {
            throw new ColoresIgualesException("El color secundario no puede ser igual al principal");
        }
        this.colorSecundario = colorSecundario;
        return this;
    }

    public PrendaBuilder especificarTrama(Trama trama) {
        romperSiEsNulo(trama, "La trama no puede ser nula");
        this.trama = trama;
        return this;
    }


    private void validarTipoSegunCategoria(Tipo tipo) {
        if (tipo.categoria() != categoria) {
            throw new TipoDePrendaNoCompatibleConLaCategoriaException("El tipo de prenda elegido no es compatible con la categoria cargada");
        }
    }

    private void validarMaterial(Material material) {
        if (!((this.tipo.getMaterialesValidos()).contains(material))) {
            throw new MaterialInvalidoException("El material no es válido para el tipo de prenda seleccionada");
        }
    }

    private void verificarSiHayAtributosNulos() {
        romperSiEsNulo(tipo, "El tipo de prenda no puede ser nulo");
        romperSiEsNulo(material, "El material no puede ser nulo");
        romperSiEsNulo(categoria, "La categoria no puede ser nula");
        romperSiEsNulo(colorPrimario, "El color principal no puede ser nulo");
    }

    private void romperSiEsNulo(Object object, String message) {
        if (object == null)
            throw new AtributoNuloException(message);
    }
}
