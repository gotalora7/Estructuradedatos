public class NormalizadorID {
    public static void main(String[] args) {
        String idSucio = " User_123 ";

        String idLimpio = idSucio.trim().toUpperCase().substring(0, 8);

        System.out.println("Prueba de Inmutabilidad");
        System.out.println("ID Original: '" + idSucio + "' | Hash: " + System.identityHashCode(idSucio));
        System.out.println("ID Limpio:    '"  + idLimpio + "'  | Hash: " + System.identityHashCode(idLimpio));
        
        System.out.println("Manipulación Eficiente");
        
        StringBuilder sb = new StringBuilder(idLimpio);
        int hashAntes = System.identityHashCode(sb);

        sb.reverse();
        int hashDespues = System.identityHashCode(sb);
        
        String idInvertido = sb.toString();

        System.out.println("ID Invertido: " + idInvertido);
        System.out.println("¿Mismo objeto StringBuilder? " + (hashAntes == hashDespues));
    }
}
