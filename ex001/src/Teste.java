public class Teste {
    public static void main(String[] args){
        Lampada lampada = new Lampada();
        lampada.tipos = new String[5];

        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.abajur = true;
        lampada.tipos[0] = "Abajur";
    }
}
