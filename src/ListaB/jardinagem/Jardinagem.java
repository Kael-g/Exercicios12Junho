package ListaB.jardinagem;

public class Jardinagem {
    String nomeJardim;
    int qtdPlantas;
    double qtdMetros, gramaAdubo, qtdMetrosGrama, valorAdubo, valorMetroGrama;

    public Jardinagem(String nomeJardim, int qtdPlantas, double qtdMetros, double gramaAdubo, double qtdMetrosGrama, double valorAdubo, double valorMetroGrama) {
        this.nomeJardim = nomeJardim;
        this.qtdPlantas = qtdPlantas;
        this.qtdMetros = qtdMetros;
        this.gramaAdubo = gramaAdubo;
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
    }

    public double usarAdubo (){
        double qtdAdubo = (qtdMetrosGrama/2)*100;
        if (gramaAdubo >= qtdAdubo){
            gramaAdubo -= qtdAdubo;
        }
        return qtdAdubo;
    }

    public double precoAdubo (){
        return valorAdubo * usarAdubo();
    }

    public double precoCorteGrama (){
        return qtdMetrosGrama * valorMetroGrama;
    }

    public void mostraInfos(){
        System.out.printf("Nome do Jardim: %s\n", nomeJardim);
        System.out.printf("Quantidade de plantas no jardim: %d\n", qtdPlantas);
        System.out.printf("Área total do jardim: %.1fm²\n", qtdMetros);
        System.out.printf("Área do jardim coberta por grama: %.1fm²\n", qtdMetrosGrama);
        System.out.printf("Quantidade de adubo em estoque (em gramas): %.1f\n",gramaAdubo);
    }

}
