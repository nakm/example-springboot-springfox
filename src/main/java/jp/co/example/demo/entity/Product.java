package jp.co.example.demo.entity;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Product {
    
    @NotNull
    @Pattern(regexp="[0-9a-zA-Z]{1,9}")
    @ApiModelProperty(example="A10001010",name="商品ID")
    private String id;
    
    @NotNull
    @Pattern(regexp="\\w{1,10}")
    @ApiModelProperty(example="サンプル食品A",name="商品名")
    private String name;
    
    @NotNull
    @ApiModelProperty(example="100000",name="商品価格")
    private BigDecimal price;
    
    @NotNull
    private User author;
}
