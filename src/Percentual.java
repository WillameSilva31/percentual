import java.util.HashMap;
import java.util.Map;

public class Percentual {
    public static void main(String[] args) {
        
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double total = faturamentoPorEstado.values().stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("Percentual de representação por estado:");
        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();
            System.out.printf("%s: %.2f%%\n", estado, (valor / total) * 100);
        }
    }
}