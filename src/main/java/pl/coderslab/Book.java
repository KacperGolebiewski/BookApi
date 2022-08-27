package pl.coderslab;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

}
