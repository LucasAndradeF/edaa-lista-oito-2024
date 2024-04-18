import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) throws IOException {
        List<String> nomes = new ArrayList<>();
        try {
            File file = new File(
                    "C:\\Users\\Lucas Ferreira\\OneDrive\\Área de Trabalho\\edaa-lista-oito-2024\\src\\estudantes_una_2024.csv");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                nomes.add(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (!nomes.isEmpty()) {
            nomes.remove(0);
        }
        Collections.sort(nomes);

        System.out.println("Ordenando Estudantes por Nome:");
        for (String n : nomes) {
            System.out.println("nome: " + n);
        }
    }
}
