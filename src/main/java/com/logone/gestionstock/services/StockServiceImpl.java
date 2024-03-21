package com.logone.gestionstock.services;

import com.logone.gestionstock.entities.Stock;
import com.logone.gestionstock.repositories.StockRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StockServiceImpl implements StockService{
    private final StockRepository stockRepository;

    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Stock ajouterStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> afficherTousLesStocks() {

        return stockRepository.findAll();
    }

    @Override
    public void supprimerStock(Long id) {
        stockRepository.deleteById(id);

    }

    @Override
    public Stock modifierStock(Stock stock) {

        return stockRepository.save(stock);
    }
}
