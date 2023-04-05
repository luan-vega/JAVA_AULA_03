public class EXERCICIO_04 {
    public static void main(String[] args) {
        int mes = 1;
        int ano = 2020;
        int numDias =0; // Variável do resultado
        switch (mes) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDias = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDias = 30;
                break;
            case 2:
                if (((ano % 4 == 0) &&  !(ano % 100 == 0)) ||
                        (ano % 400 == 0)) {
                    numDias = 29;
                    System.out.println("Esse ano foi bissexto"); }
                else {
                    numDias = 28;
                    System.out.println("Esse ano não foi bissexto"); }
                break;
            default:
                System.out.println("Mês inválido.");
                break;
        }
        System.out.println("Numero de dias = " + numDias);
    }

}
