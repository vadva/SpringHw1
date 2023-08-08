package app.entity;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Customer {
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private Integer age;
    private List<Account> accounts;

}
