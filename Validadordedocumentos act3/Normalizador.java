public class Normalizador {
        public void ejecutar() {

        String idSucio = " User_123 ";

        String idLimpio = idSucio.trim().toUpperCase().substring(0, 8);

        System.out.println("MEMORIA DE STRINGS");
        System.out.println("Original: '" + idSucio + "' ID Memoria: " + System.identityHashCode(idSucio));
        System.out.println("Limpio:   '" + idLimpio + "' ID Memoria: " + System.identityHashCode(idLimpio));

        StringBuilder sb = new StringBuilder(idLimpio);
        sb.reverse();
        String idFinal = sb.toString();

        System.out.println("RESULTADO");
        System.out.println("ID Invertido: " + idFinal);
    }
}
