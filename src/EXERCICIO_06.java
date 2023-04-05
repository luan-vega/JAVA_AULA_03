public class EXERCICIO_06 {

    public static void main(String[] args) {

    // switch...case -> semelhante ao if
    // teste é em cima de um valor númerico
    // esse valor só pode ser inteiro
    // pode-se fazer mais de uma verificação
    // na mesma linha
    int numero = 11;
    /*if (numero % 2 == 0) {
        System.out.println("Par");
    }
    else if (numero % 2 == 1) {
        System.out.println("impar");
    }*/
        switch (numero) {
        case 1:
        case 3:
        case 5:
        case 7:
            System.out.println("numero impar");
            break;
        case 2:
        case 4:
        case 6:
        case 8:
            System.out.println("numero par");
            break;
        default:
            System.out.println("número não cadastrado");
    }
}


}
