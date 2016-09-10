package jackson.nazhir.ZCWLivingRoom;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nazhirjackson on 9/10/16.
 */
public class TelevisionTest {
    @Test
    public void getVolumeTest(){
    Television television = new Television();
        Integer expectedValue = 0;
        Integer actualValue = television.getVolume();
        Assert.assertEquals("The value should be 0", expectedValue, actualValue);

    }
    @Test
    public void setVolumeTest(){
        Television television = new Television();
        Integer expectedValue = 1;
        television.setVolume(1);
        Integer actualValue = television.getVolume();
        Assert.assertEquals("The new Value should be 0", expectedValue, actualValue);


    }


}
