import java.security.MessageDigest;

public class SHA256 {
    //Implementação do SHA-256
    public static String calcular(String texto) throws Exception {
        String retorno = "";

        MessageDigest objHash = MessageDigest.getInstance("SHA-256");

        byte[] resumo = objHash.digest(texto.getBytes("UTF-8"));

        for (int i = 0; i < resumo.length; i++) {
            String temp = Integer.toHexString(0xFF & resumo[i]);
            if (temp.length() == 1) temp = "0" + temp;{
                retorno += temp;
            }

        }
        return retorno;
    }
}
