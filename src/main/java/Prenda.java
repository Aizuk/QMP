public class Prenda {
    private String colorPrimario; //colores en RGB
    private String colorSecundario = null;
    private Material material;

    public Tipo getTipo() {
        return tipo;
    }

    private Tipo tipo;
    private Trama trama;

    public Prenda (String colorPrimario,String colorSecundario,Trama trama,Material material,Categoria categoria, Tipo tipo){
        this.colorPrimario = colorPrimario;
        this.trama = trama;
        this.colorSecundario = colorSecundario;
        this.material = material;
        this.tipo = tipo;
    }

    public Prenda(String colorPrimario, Trama trama, Material material, Tipo tipo){
        this.colorPrimario = colorPrimario;
        this.trama = trama;
        this.material = material;
        this.tipo = tipo;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }

    public Trama getTrama(){
        return trama;
    }

    public Categoria getCategoria(){
        return tipo.categoria();
    }
}
