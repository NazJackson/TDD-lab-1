package jackson.nazhir.ZCWLivingRoom;

/**
 * Created by nazhirjackson on 9/10/16.
 */
public class Television {
    private Integer volume;
    private Integer channel;

    public Television(){
        volume = 0;

    }

    public Integer getVolume(){
        return volume;
    }

    public void setVolume(Integer amount){
    this.volume = amount;

    }

}
