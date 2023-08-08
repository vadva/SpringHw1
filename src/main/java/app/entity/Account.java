package app.entity;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Account {
    private Long id;
    private String number;
    @NonNull
    private Currency currency;
    private Double balance;
    @NonNull
    private Customer customer;
}
