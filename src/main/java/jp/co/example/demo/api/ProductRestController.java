package jp.co.example.demo.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jp.co.example.demo.entity.Product;

@RestController
public class ProductRestController {
    
    @GetMapping("/products")
    @ApiOperation(notes="notes is what?",value="value is what?")
    public List<Product> getProducts(
                @ApiParam(value="query is what?") 
                String query){
        return null;
    }
    
    @GetMapping("/product/{id}")
    @ApiOperation(notes="notes is what?",value="value is what?")
    public Product getProduct(
            @PathVariable
            @ApiParam(value="value is what?",
                        example="A101110110",
                        required=true,
                        format="[0-9a-zA-Z]{1,9}" ) 
            String id){
        return null;
    }
    
}
