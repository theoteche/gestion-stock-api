package com.logone.gestionstock.controllers;

import com.logone.gestionstock.entities.Stock;
import com.logone.gestionstock.services.StockService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stock")
public class StockController {
    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }
    //POST http://localhost:8081/api/stock/add
    @PostMapping(path = "/add")
    @ResponseBody
    public Stock addStock(@RequestBody Stock stk){
        return stockService.ajouterStock(stk);
    }
    //GET http://localhost:8081/api/stock/all
    @GetMapping("/all")
    @ResponseBody
    public List<Stock> getAllStock(){
        return stockService.afficherTousLesStocks();
    }
    //DELETE http://localhost:8081/api/stock/delete/id
    @DeleteMapping("/delete/{stock-id}")
    public String deleteStock(@PathVariable("stock-id") Long idp){
        stockService.supprimerStock(idp);
        return "Stock supprimé";
    }
    //PUT http://localhost:8081/api/stock/update
    @PutMapping("/update")
    @ResponseBody
    public Stock updateStock(@RequestBody Stock s){
        return stockService.modifierStock(s);

    }
}
