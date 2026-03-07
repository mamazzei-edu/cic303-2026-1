package br.maua.cic303;

import java.util.HashMap;
import java.util.Map;

/**
 * Representa a Tabela de Símbolos ou "Memória" do nosso Interpretador.
 */
public class Environment {
    private final Map<String, Double> variaveis = new HashMap<>();

    public void setVariable(String name, Double value) {
        variaveis.put(name, value);
    }

    public Double getVariable(String name) {
        if (!variaveis.containsKey(name)) {
            throw new RuntimeException("Erro Semântico: Variável '" + name + "' não declarada!");
        }
        return variaveis.get(name);
    }
}