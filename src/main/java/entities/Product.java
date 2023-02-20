package entities;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Product {
    private Long code;
    private String label;
    private double price;
    private int quantity;
}
