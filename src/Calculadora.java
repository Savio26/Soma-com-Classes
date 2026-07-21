public class Calculadora {

    int n1;
    int n2;

    public Calculadora(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int calculaSoma() {

        return n1 + n2;
    }

    public int calculaSub(){

        return n1 - n2;
    }
    public int calculaDiv(){

        return n1 / n2;
    }
    public int calculaMult(){

        return n1 * n2;
    }
}