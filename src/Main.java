public class Main {
    //Adolfo Sobrino Gomez

    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0]);
        System.out.println(veredicto(args[1],args[2]));

    }

    public static String veredicto(String valor1, String valor2) {
        String veredictoFinal = "";
        if (valor1.equals(valor2)) {
            veredictoFinal = "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
        } else if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            veredictoFinal = "Poco tiempo de estudio. Debes dedicar más tiempo.";
        } else {
            veredictoFinal = "Ideal. Trabajas los contenidos en casa.";
        }
        return veredictoFinal;
    }
}
