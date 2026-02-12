package com.datastructures.tries.services;

import java.util.List;

import org.apache.commons.collections4.trie.PatriciaTrie;

@Service
public class AutocompleteService {
    
        private final PatriciaTrie<String> trie = new PatriciaTrie<>();

    @PostConstruct
    public void init() {
        List.of(
                "casa", "casar", "casco", "cascada",
                "camino", "camisa", "camión",
                "perro", "persona", "personal",
                "gato", "gallina", "galaxia"
        ).forEach(p -> trie.put(p, p));
    }

    public List<String> sugerencias(String prefijo) {
        return trie.prefixMap(prefijo)
                .keySet()
                .stream()
                .limit(10)
                .toList();
    }
}
