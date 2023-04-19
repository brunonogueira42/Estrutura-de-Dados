public class App {
    public static void main(String[] args) throws Exception {
        PontoCartesiano ponto1 = new PontoCartesiano(1, 2);
        PontoCartesiano ponto2 = new PontoCartesiano(3, 4);

        double distancia = ponto1.Euclidiana(ponto1, ponto2);
        System.out.println("Distancia entre "+ponto1.toString()+" e "+ponto2.toString()+" é: "+distancia);

        ponto1 = new PontoCartesiano(2, 2);
        ponto2 = new PontoCartesiano(2, 2);

        distancia = ponto1.Euclidiana(ponto1, ponto2);
        System.out.println("Distancia entre "+ponto1.toString()+" e "+ponto2.toString()+" é: "+distancia);

        ponto1 = new PontoCartesiano(4.2, 5.8);
        ponto2 = new PontoCartesiano(7.3, 1.6);

        distancia = ponto1.Euclidiana(ponto1, ponto2);
        System.out.println("Distancia entre "+ponto1.toString()+" e "+ponto2.toString()+" é: "+distancia);

    }
}
