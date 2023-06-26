package org.example.beans;

import org.springframework.stereotype.Component;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class TheFirstSong {
  private String songTitle = "Bones";
  private String genre = "pop rock";
}
