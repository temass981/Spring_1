package org.example.beans;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TheFilm {
  private String filmName;
  private String genre;
}
