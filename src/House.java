import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class House {
    private  String floorsNumber;
    private  String address;
    private String[] residentsNames;

    public House(String floorsNumber, String address, String[] residentsNames) {
        this.floorsNumber = floorsNumber;
        this.address = address;
        this.residentsNames = residentsNames;
    }

}
