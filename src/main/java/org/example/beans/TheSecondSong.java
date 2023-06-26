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
public class TheSecondSong {
  private String songTitle = "Stressed Out";
  private String genre = "indie pop";
}
