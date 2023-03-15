package co.com.sofka.arusapp.model.tipocedula;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder(toBuilder = true)
public class TipoCedula {
    private int id;
    private String tipo;
}
