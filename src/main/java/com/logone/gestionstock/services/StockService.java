package com.logone.gestionstock.services;
import com.logone.gestionstock.entities.Stock;

import java.util.List;

public interface StockService {
    Stock ajouterStock(Stock stock);
    List<Stock> afficherTousLesStocks();
    void supprimerStock(Long id);
    Stock modifierStock(Stock stock);
}
