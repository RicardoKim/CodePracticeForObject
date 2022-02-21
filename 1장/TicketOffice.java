import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;

    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets){ //ellipsis라는 것으로 동일한 객체의 파라미터를 처리할때 메소드마다 파라미터의 갯수를 늘려가며 설정하는 대신 ...로 처리하면 다수의 Ticket을 받을 수 있게 해준다.
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket(){
        return tickets.remove(0);
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }
}
