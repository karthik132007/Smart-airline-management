import java.time.LocalTime;
public class Gate {
    int gate_num;
    int capacity;
    LocalTime openTime;
    LocalTime closTime;

    public int getGate_num() {
        return gate_num;
    }
    Gate(int number,int capacity,LocalTime openTime,LocalTime closTime){
        this.gate_num=number;
        this.capacity=capacity;
        this.openTime=openTime;
        this.closTime=closTime;
    }
}
