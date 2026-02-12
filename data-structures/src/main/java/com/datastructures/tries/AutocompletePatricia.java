package com.datastructures.tries;

import java.util.Map;

import org.apache.commons.collections4.trie.PatriciaTrie;

public class AutocompletePatricia {

    public static void main(String[] args) {
        PatriciaTrie<String> trie = new PatriciaTrie<>();

        // Diccionario
        trie.put("casa", "casa");
        trie.put("casar", "casar");
        trie.put("casco", "casco");
        trie.put("cascada", "cascada");
        trie.put("camino", "camino");
        trie.put("camisa", "camisa");

        String prefijo = "cas";

        // prefixMap es la clave para autocomplete
        Map<String, String> sugerencias = trie.prefixMap(prefijo);

        System.out.println("Sugerencias para: " + prefijo);
        sugerencias.keySet().forEach(System.out::println);
    }
}