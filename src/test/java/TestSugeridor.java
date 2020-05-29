import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SugeridorTest {

    Sugeridor sugeridor;

    @Before
    public void setUp() {
        sugeridor = new Sugeridor();
    }

    @Test
    public void sugeridorMeGeneraUnAtuendoSinAccesorioYUnAtuendoConAccesorio() {
        Guardarropas guardarropas = new Guardarropas(new HashSet<>());
        guardarropas.agregarPrenda(new Prenda("Negro", Trama.LISO, Material.TELA, TipoSuperior.REMERA));
        guardarropas.agregarPrenda(new Prenda("Negro", Trama.LISO, Material.TELA, TipoInferior.JOGGING));
        guardarropas.agregarPrenda(new Prenda("Negro", Trama.LISO, Material.TELA, TipoCalzado.ZAPATILLAS));
        guardarropas.agregarPrenda(new Prenda("Negro", Trama.LISO, Material.METAL, TipoAccesorio.ANTEOJOS));
        List<Atuendo> atuendos = sugeridor.atuendosValidosParaTemperatura(30, guardarropas);
        assertEquals(2, atuendos.size());
    }

    @Test
    public void sugeridorMeGeneraUnAtuendoSinAccesorio() {
        Guardarropas guardarropas = new Guardarropas(new HashSet<>());
        guardarropas.agregarPrenda(new Prenda("Negro",Trama.LISO, Material.TELA, TipoSuperior.REMERA));
        guardarropas.agregarPrenda(new Prenda("Negro", Trama.LISO, Material.TELA, TipoInferior.JOGGING));
        guardarropas.agregarPrenda(new Prenda("Negro", Trama.LISO, Material.TELA, TipoCalzado.ZAPATILLAS));
        List<Atuendo> atuendos = sugeridor.atuendosValidosParaTemperatura(30, guardarropas);
        assertEquals(1, atuendos.size());
    }

    @Test
    public void sugeridorMeGeneraCuatroAtuendos() {
        Guardarropas guardarropas = new Guardarropas(new HashSet<>());
        guardarropas.agregarPrenda(new Prenda("Negro",  Trama.LISO, Material.TELA, TipoSuperior.REMERA));
        guardarropas.agregarPrenda(new Prenda("Negro", Trama.LISO, Material.TELA, TipoInferior.JOGGING));
        guardarropas.agregarPrenda(new Prenda("Negro",Trama.LISO, Material.TELA, TipoInferior.JOGGING_CORTO));
        guardarropas.agregarPrenda(new Prenda("Negro",Trama.LISO,  Material.TELA,TipoCalzado.ZAPATILLAS));
        guardarropas.agregarPrenda(new Prenda("Negro",Trama.LISO, Material.METAL, TipoAccesorio.ANTEOJOS));
        List<Atuendo> atuendos = sugeridor.atuendosValidosParaTemperatura(30, guardarropas);

        assertEquals(4, atuendos.size());
    }

    @Test
    public void sugeridorSinPrendaSuperiorNoMeGeneraAtuendos() {
        Guardarropas guardarropas = new Guardarropas(new HashSet<>());
        guardarropas.agregarPrenda(new Prenda("Negro",Trama.LISO, Material.TELA, TipoInferior.JOGGING));
        guardarropas.agregarPrenda(new Prenda("Negro",Trama.LISO, Material.TELA, TipoInferior.JOGGING_CORTO));
        guardarropas.agregarPrenda(new Prenda("Negro",Trama.LISO, Material.TELA, TipoCalzado.ZAPATILLAS));
        guardarropas.agregarPrenda(new Prenda("Negro",Trama.LISO, Material.METAL, TipoAccesorio.ANTEOJOS));
        List<Atuendo> atuendos = sugeridor.atuendosValidosParaTemperatura(30, guardarropas);

        assertEquals(0, atuendos.size());
    }

    @Test
    public void sugeridorSinPrendasNoMeGeneraAtuendos() {
        Guardarropas guardarropas = new Guardarropas(new HashSet<>());
        List<Atuendo> atuendos = sugeridor.atuendosValidosParaTemperatura(30, guardarropas);

        assertEquals(0, atuendos.size());
    }

}
