package List.Exercicio.Temperatura;

public class MesTemperatura {
    private Double mediaTemperatura;
    private String mes = "";

    public MesTemperatura(Double mediaTemperatura, String mes) {
        this.mediaTemperatura = mediaTemperatura;
        this.mes = mes;
    }

    public Double getMediaTemperatura() {
        return mediaTemperatura;
    }

    public void setMediaTemperatura(Double mediaTemperatura) {
        this.mediaTemperatura = mediaTemperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "{Mês: " + mes + ", Temperatura: " + mediaTemperatura + "}";
    }
}
