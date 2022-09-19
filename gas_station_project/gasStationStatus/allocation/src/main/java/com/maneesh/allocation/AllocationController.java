package com.maneesh.allocation;

import com.maneesh.allocation.entity.Stock;
import com.maneesh.allocation.repo.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Allocation Controller Which handles Http Requests
@RestController
@RequestMapping("api/v1/allocation-check")
@AllArgsConstructor
public class AllocationController {

    private final AllocationCheckService allocationCheckService;
    private final StockRepository stockRepository;

//    @GetMapping(path = "{orderId}")
//    public AllocaionCheckResponce isStockAvailable(
//            @PathVariable("orderId") Integer orderId){
//
//        boolean isStockAvailable = allocationCheckService.isStockAvailable(orderId);
//        return new AllocaionCheckResponce(isStockAvailable);
//
//    }

//    @PostMapping
//    public void publish(@RequestBody MessageRequest messageRequest){
//        kafkaTemplate.send("mainTopic", messageRequest.message());
//    }

//    Updating Stock Amount From Admin (Intial Built)
    @CrossOrigin(origins = "http://localhost:4201")
    @PostMapping("/update-stock")
    public void updatedStock(@RequestBody UpdateStockmessage updateStockmessage){
        allocationCheckService.stockUpdate(updateStockmessage);
    }

    @CrossOrigin(origins = "http://localhost:4201")
    @GetMapping("/get-all")
    public List<Stock> getOrders(){
        return stockRepository.findByIdDESC();
    }

}
