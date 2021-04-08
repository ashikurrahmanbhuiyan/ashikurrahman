package lecture;

import javax.xml.crypto.Data;
import java.sql.Date;

public class TemperConverter {
    private int averageTemp ,lowTemp , highTemp;
    private double humidity;
    Data date = (Data) Date.valueOf("2021-04-08");
    void setAverageTemp(int averageTemp, int lowTemp, int highTemp){
        this.averageTemp=averageTemp;
    }
}
