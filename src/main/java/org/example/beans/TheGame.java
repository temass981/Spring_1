package org.example.beans;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TheGame {
  private String gameName;
  private String genre;
}
