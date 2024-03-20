package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Stock;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StockServiceImpl implements StockService{
    @Override
    public Stock ajouterStock(Stock stock) {
        return null;
    }

    @Override
    public List<Stock> afficherTousLesStocks() {
        return null;
    }

    @Override
    public void supprimerStock(Long id) {

    }

    @Override
    public Stock modifierStock(Stock stock) {
        return null;
    }
}
